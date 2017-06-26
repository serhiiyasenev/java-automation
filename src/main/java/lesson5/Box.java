package lesson5;


public class Box {

    public double width; // ширина
    public double height; // высота
    public double depth; // глубина
    public String name;

    public void volume ()
    {

        System.out.print("Volume " + name + " equals: ");
        System.out.println(width*height*depth);

    }
}
