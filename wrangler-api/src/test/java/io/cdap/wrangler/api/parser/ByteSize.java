package io.cdap.wrangler.api.parser;

public class ByteSize extends Token {
    private final long bytes;
    
    public ByteSize(String value) {
        super(TokenType.BYTE_SIZE, value);
        this.bytes = parseBytes(value);
    }
    
    public long getBytes() {
        return bytes;
    }
    
    private long parseBytes(String input) {
        // Implementation to parse "10KB", "1.5MB" etc. into bytes
    }
}
