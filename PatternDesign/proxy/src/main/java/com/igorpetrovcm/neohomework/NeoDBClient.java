package com.igorpetrovcm.neohomework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NeoDBClient implements DBClient {
    private final String dbName;

    @Override
    public String connect(){
        return dbName;
    }
}
