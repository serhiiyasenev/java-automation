package lesson5;


public class BoxRunner {

    public static void main(String[] args) {

        Box mybox = new Box(); // создать объект mybox класса Box
        Box cube = new Box(); // создать объект cube класса Box
        Box parallelepiped = new Box(); // создать объект parallelepiped класса Box

        mybox.name = "Моя коробка";
        mybox.width = 99;
        mybox.height = 100;
        mybox.depth = 99;

        cube.name = "Cube";
        cube.width = 10;
        cube.height = 10;
        cube.depth = 10;

        parallelepiped.name = "Parallelepiped";
        parallelepiped.width = 10;
        parallelepiped.height = 20;
        parallelepiped.depth = 15;

        cube.volume();
        parallelepiped.volume();
        mybox.volume();

    }
}
