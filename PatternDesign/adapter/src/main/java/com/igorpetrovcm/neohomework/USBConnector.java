package com.igorpetrovcm.neohomework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class USBConnector {
    private USBCable cable;

    public MemoryData requestData(){
        return cable.takeData();
    }
}
