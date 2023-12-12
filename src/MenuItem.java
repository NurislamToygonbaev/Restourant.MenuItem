public class MenuItem {
    private long id;
    private String name;
    private double price;
    private int preparationTime;

    public MenuItem() {
    }

    public MenuItem(long id, String name, double price, int preparationTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }


    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", preparationTime=" + preparationTime +
                '}' + "\n";
    }
}
