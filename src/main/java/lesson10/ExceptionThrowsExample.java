package lesson10;

import java.io.File;
import java.io.IOException;

public class ExceptionThrowsExample {

    public static void createFile() throws IOException {

        File file = new File ("\\/,sad\\ASD");
        file.createNewFile(); // Метод выбрасывает исключение в случае неправильного пути к файлу
    }

    public static void main(String[] args) {
        try {
            createFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}