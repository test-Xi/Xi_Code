package SelfStudy;

public class Phone {
    private String band;
    private double price;
    private String color;

    public Phone() {
    }
    public Phone(String band , double price ,String color){
        this.band = band;
        this.price = price;
        this.color = color;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
