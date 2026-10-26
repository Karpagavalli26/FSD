
package array;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class RemoveArray {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};

        int[] removed = ArrayUtils.removeElement(intArray, 3);

        System.out.println(Arrays.toString(removed));
    }
}
