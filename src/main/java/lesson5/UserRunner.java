package lesson5;


public class UserRunner {

    public static void main(String[] args) {

        User user1 = new User(); // Объект класса User
        User user2 = new User(); // 2й бъект класса User
        User user3 = new User();  // 3й Объект класса User

        user1.name = "Mahsa";
        user1.age = 25;
        user2.name = "JACK";
        user2.age = 70;
        user2.city = "New York";
        user3.gender = 'M';

        System.out.println(user1.name+": "+user1.age);
        System.out.println(user2.name+": "+user2.age+": "+user2.city);
        System.out.println(user3.gender);

    }
}

