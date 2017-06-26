package lesson3;


public class Switch_Case {

    public static void main(String[] args) {

        int i = 5;
        switch (i)
        {
            case 1:
                System.out.println("This is '1' !");
                break;
            case 2:
                System.out.println("This is '2' !");
                break;
            default:
                System.out.println("This is not '1' and not '2' !");
                break;
        }

        String s = "s";
        switch (s)
        {
            case "qq":
                System.out.println("This is 'qq' !");
                break;
            case "s":
                System.out.println("This is 's' !");
                break;
            default:
                System.out.println("This is not '1' and not '2' !");
                break;
        }
    }
}
