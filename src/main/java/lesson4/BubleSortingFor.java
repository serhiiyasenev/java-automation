package lesson4;


public class BubleSortingFor {

    public static void main(String[] args) {

        int[] intArray = {5, 2, 9, 7, 6, 5, 4, 3, 2, 1};
        int temp;
        for (int j = 0; j < intArray.length; j++)
        {
            for (int i = 0; i < intArray.length - 1; i++)
            {
                if (intArray[i] > intArray[i+1]) {
                    temp = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }
}
