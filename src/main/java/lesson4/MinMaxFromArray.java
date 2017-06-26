package lesson4;


public class MinMaxFromArray {
    public static void main(String[] args) {
        int ar[] = {-111,-111,222,3,-1,6,36,6,7,8,999,0,1111,-1,1};
        int min = 0;
        int max = 0;
        for(int i : ar){
            if(i>max)
                max = i;
            if(i<min)
                min = i;
        }
        System.out.println("Min int in array: " + min);
        System.out.println("Max int in array: " + max);
    }

}
