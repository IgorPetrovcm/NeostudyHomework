package com.igorpetrovcm.neohomework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    private USBConnector usbConnector;

    public void displayMemoryData(){
        Objects.requireNonNull(usbConnector);

        MemoryData memoryData = usbConnector.requestData();
        Objects.requireNonNull(memoryData);

        System.out.println(memoryData.getData());
    }
}
