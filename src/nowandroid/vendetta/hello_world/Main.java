package nowandroid.vendetta.hello_world;

import java.util.Scanner;

/**
 * Created by nowandroid on 18.03.17.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vasa zadacha ygadat chislo");

        for (int i = 10; i <= 30; i += 10) playerLevel(i);
        System.out.println("Вы выиграли!");
        scanner.close();
    }

    private static void playerLevel(int range) {
        int number = (int) (Math.random() + range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int num_input = scanner.nextInt();
            if (num_input == number) {
                System.out.println("yeah");
                break;
            } else if (num_input > number) {
                System.out.println("chislo menche");
            } else {
                System.out.println("Chislo bolwe");
            }
        }
    }
}
