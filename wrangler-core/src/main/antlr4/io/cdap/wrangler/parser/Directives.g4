fragment BYTE_UNIT: ('B'|'KB'|'MB'|'GB'|'TB'|'KIB'|'MIB'|'GIB'|'TIB');
fragment TIME_UNIT: ('NS'|'MS'|'S'|'M'|'H'|'D');

BYTE_SIZE: NUMBER WS* BYTE_UNIT;
TIME_DURATION: NUMBER WS* TIME_UNIT;

byteSizeArg: BYTE_SIZE;
timeDurationArg: TIME_DURATION;

// Update value rule to include new types
value: 
    STRING | NUMBER | BOOLEAN | NULL | 
    byteSizeArg | timeDurationArg | 
    list | map;
