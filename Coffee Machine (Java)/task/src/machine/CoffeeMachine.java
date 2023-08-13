package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cup = sc.nextInt();

        int waterPossible = water / 200, milkPossible = milk / 50, beansPossible = beans / 15;
        int possibleCup = Math.min(waterPossible, Math.min(milkPossible, beansPossible));

        if (cup == possibleCup) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (possibleCup < cup) {
            System.out.println("No, I can make only " + possibleCup + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (possibleCup - cup) + " more than that)");
        }
    }
}
