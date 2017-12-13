package binarySearch;

public class BinarySearch {

    public static void main(String[] args) {

        int [] data = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;
        System.out.println(find(numberToFind, data));
    }
    // собственно алгоритм поиска
    public static int find(int x, int [] array) {
        int i = -1;
        if (array != null) {
            int low = 0, high = array.length, mid;
            while (low < high) {
                mid = (low + high) / 2; // Можно заменить на: (low + high) >>> 1, чтоб не возникло переполнение целого
                if (x == array[mid]) {
                    i = mid;
                    break;
                } else {
                    if (x < array[mid]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return i;
    }
}