package com.igorpetrovcm.neohomework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    private USBConnector usbConnector;

    public void displayMemoryData(){
        if (usbConnector == null){
            throw new NullPointerException("The PC doesn't have a usb connector.");
        }

        MemoryData memoryData = usbConnector.requestData();
        if (memoryData == null){
            throw new NullPointerException("No data");
        }

        System.out.println(memoryData.getData());
    }
}
