package lesson5;


public class BoxRunner2 {

    public static void main(String[] args) {

        Box2 mybox2 = new Box2(1, 2, 3, "mybox2"); // создать объект mybox класса Box2
        Box2 cube2 = new Box2(3, 3, 3, "cube2"); // создать объект cube класса Box2
        Box2 parallelepiped2 = new Box2(7, 6, 5, "parallelepiped2"); // создать объект parallelepiped класса Box2

        mybox2.getVolume();
        cube2.getVolume();
        parallelepiped2.getVolume();
    }
}
