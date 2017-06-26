package lesson12;

public class Dog extends Pet{

    @Override
    public void voice(){
        System.out.println("GAF GAF");
    }
    @Override
    public void move(){
        if (isHungry){
            System.out.println("I need food!");
            return;
        }
        System.out.println("OK, I'll walk a little");
    }
}