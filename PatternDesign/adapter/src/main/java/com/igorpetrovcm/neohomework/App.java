package com.igorpetrovcm.neohomework;

public class App
{
    public static void main( String[] args )
    {
        MemoryCard memoryCard = new MemoryCard(
                new MemoryData("Hello, World!")
        );

        CardReader cardReader = new CardReader(memoryCard);

        PC pc = new PC(
                new USBConnector(cardReader)
        );

        pc.displayMemoryData();
    }
}
