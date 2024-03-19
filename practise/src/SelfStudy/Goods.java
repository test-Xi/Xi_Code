package SelfStudy;

public class Goods {
    private String Id;
    private String name;
    private int price;
    private int count;

    public Goods(){}

    public Goods(String Id,String name,int price ,int count){
        this.Id = Id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
