package homeTasks3;


public class MinFromArray {
    public static void main(String[] args) {
        int ar[] = {-111,222,0,1111,-222};
        int min = 0;

        for(int i : ar){
            if(i<min)
                min = i;
        }
        System.out.println("Min int in array: " + min);

    }

}
