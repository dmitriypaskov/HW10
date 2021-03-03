package pashkov;

public class Fruit {

    public enum Type {
        APPLE, LEMON, BANANA
    }

    private Type type;
    private Color color;
    private int weight;
    private double price;

    public double calculatePrice() {
        return price * weight / 1000;
    }

    public Fruit() {
    }

    public Fruit(Type type, Color color, int weight, double price) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "\n Fruit { " +
                "\n type   = " + type +
                "\n color  = " + color +
                "\n weight = " + weight +
                "\n price  = " + price +
                '}';
    }

}
