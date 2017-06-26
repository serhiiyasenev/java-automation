package homeTasks3;

import java.util.Scanner;

public class Seasons {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("-------------------------" + "\n" +
                    "Please, input your month's number" +
                    " from 1 to 12. And press Enter than.");

            Scanner scanner0 = new Scanner(System.in);
            String s = scanner0.nextLine().toString();
            int monthCount = new Integer(s);

            if ((monthCount > 0 && monthCount <= 2) || (monthCount == 12)) {
                System.out.println("Winter");
            } else if (monthCount >= 3 && monthCount <= 5) {
                System.out.println("Spring");
            } else if (monthCount >= 6 && monthCount <= 8) {
                System.out.println("Summer");
            } else if (monthCount >= 9 && monthCount <= 11) {
                System.out.println("Autumn");
            } else {
                System.out.println("Input correct number!");
            }

        }
    }
}
