package com.tms.pattern.adapter;

public class CardReaderAdapter extends MemoryCard implements IUSB{
 //   private MemoryCard memoryCard;

  // public CardReader(MemoryCard memoryCard) {
  //     this.memoryCard = memoryCard;
  // }

    @Override
    public void connectWithUSB() {
        success();
        saveOnComp();
    }
}
