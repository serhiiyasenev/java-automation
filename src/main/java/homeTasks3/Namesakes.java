package homeTasks3;


import java.util.Scanner;

public class Namesakes {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("-------------------------" + "\n" + "Please, input your name. And press Enter than.");
            Scanner scanner = new Scanner(System.in); // Объявляем сканнер
            String s = scanner.nextLine().toString(); // получем введенную линию в String
            switch (s) {
                case "Namesakes":
                    System.out.println("This is 'Namesake' !");
                    break;
                default:
                    System.out.println("This is not 'Namesake' !");
                    break;
            }
        }
    }
}
