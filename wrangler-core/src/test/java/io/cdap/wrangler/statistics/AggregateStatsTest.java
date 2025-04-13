public class AggregateStatsTest {
    @Test
    public void testAggregation() throws Exception {
        List<Row> rows = Arrays.asList(
            new Row("data_transfer_size", "10KB", "response_time", "100ms"),
            new Row("data_transfer_size", "1.5MB", "response_time", "2.5s")
        );
        
        String[] recipe = new String[] {
            "aggregate-stats :data_transfer_size :response_time total_size_mb total_time_sec"
        };
        
        List<Row> results = TestingRig.execute(recipe, rows);
        
        assertEquals(1, results.size());
        assertEquals(expectedSize, results.get(0).getValue("total_size_mb"), 0.001);
        assertEquals(expectedTime, results.get(0).getValue("total_time_sec"), 0.001);
    }
}
