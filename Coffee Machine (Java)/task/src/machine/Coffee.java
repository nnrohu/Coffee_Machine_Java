package machine;

public class Coffee {
    int water = 400, milk = 540, beans = 120,
            cups = 9, money = 550;

    public void buyEspresso() {
        if (water < 250) return;
        if (beans < 16) return;
        if (money < 4) return;

        water -= 250;
        beans -= 16;
        money += 4;
        cups--;
    }

    public void buyLatte() {
        if (water < 350) return;
        if (milk < 75) return;
        if (beans < 20) return;
        if (money < 7) return;

        water -= 350;
        milk -= 75;
        beans -= 20;
        money += 7;
        cups--;
    }

    public void buyCappuccino() {
        if (water < 200) return;
        if (milk < 100) return;
        if (beans < 12) return;
        if (money < 6) return;

        water -= 200;
        milk -= 100;
        beans -= 12;
        money += 6;
        cups--;
    }

    public void fill(int water, int milk, int beans, int cups) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
        this.cups += cups;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                 water + " ml of water\n" +
                 milk + " ml of milk\n" +
                 beans + " g of coffee beans\n" +
                 cups + " disposable cups\n" +
                 "$" + money + " of money\n";
    }

    public void take() {
        System.out.println("I gave you $"+ money);
        money =0;
    }
}

