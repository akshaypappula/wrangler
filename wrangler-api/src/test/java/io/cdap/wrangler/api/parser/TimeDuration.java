package io.cdap.wrangler.api.parser;

public class TimeDuration extends Token {
    private final long nanoseconds;
    
    public TimeDuration(String value) {
        super(TokenType.TIME_DURATION, value);
        this.nanoseconds = parseDuration(value);
    }
    
    public long getNanoseconds() {
        return nanoseconds;
    }
    
    private long parseDuration(String input) {
        // Implementation to parse "150ms", "2.5s" etc. into nanoseconds
    }
}
