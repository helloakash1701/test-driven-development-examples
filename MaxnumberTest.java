import org.junit.Test;
import static org.junit.Assert.*;


public class MaxnumberTest {
    @Test
//    adding methods to that test
    public void textMax(){
    Max max = new Max();
    int[] arr = new int[]{1,2,3,4};
    int max_number = max.max_num(arr);
    assertEquals(4,max_number);
    }
}
