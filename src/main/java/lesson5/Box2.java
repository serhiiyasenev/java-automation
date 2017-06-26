package lesson5;


public class Box2 {
    private double width;
    private double height;
    private double depth;
    private String name;

    public Box2(double width, double height, double depth, String name){
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.name = name;
    }

    public void getVolume ()
    {
        System.out.println(name);
        System.out.println(width*height*depth);

    }
}
