import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortingTest {

    @Test
    public void testing(){
        Sort sort = new Sort();
        int[] arr = new int[]{1,3,2,0};
        sort.bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
}
