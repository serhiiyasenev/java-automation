package matrixPrint;

public class MatrixPrint {
    public static void main(String args[]){
        String[][] array = new String [][]
                {
                        new String[]{" *", " 2", " 3", " 4", " *"},
                                    {String.valueOf(" 6"), String.valueOf(" *"), String.valueOf(" 8"), String.valueOf(" *"), String.valueOf("10")},
                                    {String.valueOf("11"), String.valueOf("12"), String.valueOf(" *"), String.valueOf("14"), String.valueOf("15")},
                                    {String.valueOf("16"), String.valueOf(" *"), String.valueOf("18"), String.valueOf(" *"), String.valueOf("20")},
                                    {" *", "22", String.valueOf("23"), String.valueOf("24"), String.valueOf(" *")}
                };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + '\u0020');
            }
            System.out.println();
        }
    }
}