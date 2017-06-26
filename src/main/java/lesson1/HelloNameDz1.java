package lesson1;

import java.util.Random;

public class HelloNameDz1 {


    public static void main(String[] args) throws InterruptedException {

        String names[] = {"Serhii", "Andrii", "Oleksandr", "Vasyl", "Ivan"};
        String namesRandom = names [ new Random().nextInt(names.length)];
//
        System.out.format("%s, %s\n", "Hello", namesRandom);
        System.out.format("%s, %s\n", namesRandom, "hello");
//
    }

}
