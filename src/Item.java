public class Item {
    private String name;
    private String type;
    private double price;
    private String size = "MEDIUM";

    public Item(String type, String name, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName() {
        return !this.type.equals("SIDE") && !this.type.equals("DRINK") ? this.name : this.size + " " + this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getBasePrice() {
        return this.price;
    }

    public double getAdjustedPrice() {
        double var10000;
        switch (this.size) {
            case "SMALL":
                var10000 = this.getBasePrice() - 0.5;
                break;
            case "LARGE":
                var10000 = this.getBasePrice() * 1.5;
                break;
            default:
                var10000 = this.getBasePrice();
        }

        return var10000;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(this.getName(), this.getAdjustedPrice());
    }
}