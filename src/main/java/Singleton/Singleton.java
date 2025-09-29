package Singleton;

import org.w3c.dom.ls.LSOutput;

public class Singleton {
    private static Singleton instance;
    private String data;

    private Singleton() {
        data = "Singleton data";
        System.out.println("Singleton data created");
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
