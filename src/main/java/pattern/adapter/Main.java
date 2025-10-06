package pattern.adapter;

public class Main {
    public static void main(String[] args) {
        IUSB cardReader = new CardReaderAdapter();
        cardReader.connectWithUSB();
    }
}
