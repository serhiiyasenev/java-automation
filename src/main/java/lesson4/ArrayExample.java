package lesson4;


public class ArrayExample {

    public static void main(String[] args) {

        int[] a = {-10001, 1, 2, 3, 10, 12, 15, 10001, -11, -22};
        a[1] = -1000;
        a[2] = 2;
        a[3] = 1000;

        char b[] = {'a', 'b', '1'};

        boolean bool[] = {true, true, false};

        int minFromArray = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minFromArray) {
                minFromArray = a[i];
            }
        }

            int maxFromArray = 0;
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] > maxFromArray)
                    maxFromArray = a[i];
            }


                System.out.println("Максимальное значение равно: " + maxFromArray);
                System.out.println("Минимально значение равно: " + minFromArray);
                // for (int arrElement : a)
                // {
                //     System.out.println(a[arrElement]);

                // }
            }
        }