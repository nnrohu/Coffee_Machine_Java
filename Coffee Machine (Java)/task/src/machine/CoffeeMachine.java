package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        System.out.println(coffee);

        Scanner sc = new Scanner(System.in);

        System.out.println("Write action (buy, fill, take):");
        String action = sc.nextLine();

        switch (action){
            case "buy":
                buy(sc,coffee);
                break;
            case "fill":
                fill(sc,coffee);
                break;
            case "take":
                coffee.take();
                System.out.println(coffee);
                break;
            default:
                System.out.println("wrong input");
        }
    }


    private static void fill(Scanner sc, Coffee coffee){
        System.out.println("Write how many ml of water you want to add:");
        int water = sc.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        int milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = sc.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        int cup = sc.nextInt();
        coffee.fill(water,milk,beans,cup);
        System.out.println(coffee);
    }
    private static void buy(Scanner sc, Coffee coffee) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int option = sc.nextInt();
        switch (option){
            case 1:
                coffee.buyEspresso();
                break;
            case 2:
                coffee.buyLatte();
                break;
            case 3:
                coffee.buyCappuccino();
                break;
            default:
                System.out.println("wrong input");
        }
        System.out.println(coffee);
    }
}
