package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        int water = 200;
        int milk = 50;
        int beans = 15;

        Scanner sc = new Scanner(System.in);
        int cup = sc.nextInt();

        System.out.println("For " + cup + " cups of coffee you will need:");
        System.out.println((water * cup) + " ml of water");
        System.out.println((milk * cup) + " ml of milk");
        System.out.println((beans * cup) + " g of coffee beans");
    }
}
