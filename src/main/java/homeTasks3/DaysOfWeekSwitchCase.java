package homeTasks3;


import java.util.Scanner;

public class DaysOfWeekSwitchCase {

    public static void main(String[] args) {

       for (int i = 0; i < 7; i++) {

           System.out.println("-------------------------" + "\n"+ "Please, input your day's number from 1 to 7. And press Enter than.");
           Scanner scanner = new Scanner(System.in); // Объявляем сканнер
           String s = scanner.nextLine().toString(); // получем введенную линию в String
           int d = new Integer(s); // переводим в int
           switch (d) {
               case 1:
                   System.out.println("This is 'Monday' !");
                   break;
               case 2:
                   System.out.println("This is 'Tuesday' !");
                   break;
               case 3:
                   System.out.println("This is 'Wednesday' !");
                   break;
               case 4:
                   System.out.println("This is 'Thursday' !");
                   break;
               case 5:
                   System.out.println("This is 'Friday' !");
                   break;
               case 6:
                   System.out.println("This is 'Saturday' !");
                   break;
               case 7:
                   System.out.println("This is 'Sunday' !");
                   break;
               default:
                   System.out.println("Please, input correct number!");
                   break;
           }
       }
    }
}
