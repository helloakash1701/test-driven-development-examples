import java.util.Arrays;
public class Max {
    int[] arr = new int[]{1, 2, 3, 4};

    public int max_num(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
}





