package com.igorpetrovcm.neohomework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NeoDBClient implements DBClient {

    @Override
    public String connect(String dbName){
        return dbName;
    }
}
