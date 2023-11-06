public class MealOrder {
        private Item side;
        private Item drink;
        private Burger burger;

        public MealOrder() {
            this("regular", "coke", "fries");
        }

        public MealOrder(String burgerType, String drinkType, String sideType) {
            this.burger = new Burger(burgerType, 4.0);
            this.drink = new Item("drink", drinkType, 1.0);
            this.side = new Item("size", sideType, 1.5);
        }

        public double getTotalPrice() {
            return this.side.getAdjustedPrice() + this.drink.getAdjustedPrice() + this.burger.getAdjustedPrice();
        }

        public void printItemizedList() {
            this.burger.printItem();
            this.drink.printItem();
            this.side.printItem();
            System.out.println("-".repeat(30));
            Item.printItem("Total PRICE", this.getTotalPrice());
        }
    }


