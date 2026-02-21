package models;

public class MenuItem {
    private int code;
    private String name;
    private double price;
    public MenuItem(String name, double price, int code){
        this.name = name;
        this.price = price;
        this.code = code;
    }
    public void setPrice(int p) {price=p;}
    public void setName(String naam) {name=naam;}
    public void setCode(int c) {code = c;}
    public double getPrice() {return price;}
    public String getName() {return name;}
    public int getCode() {return code;}
}
