package homeTasks3;

import java.util.Scanner;

public class Namesakes_Equals {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            System.out.println("-------------------------" + "\n" + "Please, input the first name. And press Enter than.");
            Scanner scanner0 = new Scanner(System.in);
            String s0 = scanner0.nextLine().toString();
            System.out.println("-------------------------" + "\n" + "Please, input the second name. And press Enter than.");
            Scanner scanner1 = new Scanner(System.in);
            String s1 = scanner1.nextLine().toString();

            String name1 = s0;
            String name2 = s1;

            if (name1.equals(name2)) {
                System.out.println("This is the same names!");
            } else {
                System.out.println("This is NOT the same names!");
            }

        }
    }
}
