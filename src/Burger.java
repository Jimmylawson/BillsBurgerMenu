public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    public String getName() {
        return super.getName() + " BURGER";
    }

    public double getAdjustedPrice() {
        return this.getBasePrice() + (this.extra1 == null ? 0.0 : this.extra1.getAdjustedPrice()) + (this.extra2 == null ? 0.0 : this.extra2.getAdjustedPrice()) + (this.extra3 == null ? 0.0 : this.extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName) {
        double var10000;
        switch (toppingName.toUpperCase()) {
            case "AVOCADO":
            case "CHEESE":
                var10000 = 1.0;
                break;
            case "BACON":
            case "HAM":
            case "SALAMI":
                var10000 = 1.5;
                break;
            default:
                var10000 = 0.0;
        }

        return var10000;
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("Topping", extra1, this.getExtraPrice(extra1));
        this.extra2 = new Item("Topping", extra2, this.getExtraPrice(extra2));
        this.extra3 = new Item("Topping", extra3, this.getExtraPrice(extra3));
    }

    public void printItemizedList() {
        printItem("BASE BURGER", this.getBasePrice());
        if (this.extra1 != null) {
            this.extra1.printItem();
        }

        if (this.extra2 != null) {
            this.extra2.printItem();
        }

        if (this.extra3 != null) {
            this.extra3.printItem();
        }

    }

    public void printItem() {
        this.printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
