package lesson4;


import java.util.Arrays;

public class BubleSorting {

    public static void main(String[] args) {

        int[] intArray = {5, 2, 9, 7, 1, 10, 11, 12, 13, 6, 5, 4, 3, 2, 1};
        boolean flag = true;
        int temp;
        while (flag)
        {
            flag = false;
            for (int i = 0; i < intArray.length - 1; i++)
            {
                if (intArray[i] > intArray[i+1])
                {
                    temp = intArray[i+1];
                    intArray[i+1] = intArray[i];
                    intArray[i] = temp;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }

       //  Arrays.sort(intArray);
       //  for (int i = 0; i < intArray.length; i++)
      //   {
      //      System.out.print(intArray[i] + " ");
     //   }

    }
}
