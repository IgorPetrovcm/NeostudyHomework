package com.igorpetrovcm.neohomework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Adapter
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardReader extends USBCable {
    private MemoryCard memoryCard;

    @Override
    public MemoryData takeData(){
        return memoryCard.getMemoryData();
    }
}
