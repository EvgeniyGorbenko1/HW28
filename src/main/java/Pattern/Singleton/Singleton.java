package Pattern.Singleton;

public class Singleton {
    private static Singleton instance;
    private String data;

    private Singleton() {
        data = "Pattern.Singleton data";
        System.out.println("Pattern.Singleton data created");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void Data(){
        System.out.println(data);
    }

}
