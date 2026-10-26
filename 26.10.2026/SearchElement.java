
package array;

public class SearchElement {
    public static void main(String[] args) {

        int[] rollNumbers = {101, 102, 103, 104, 105, 106};
        int searchNumber = 104;
        int position = -1;

        for (int i = 0; i < rollNumbers.length; i++) {
            if (rollNumbers[i] == searchNumber) {
                position = i + 1;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Roll Number Found");
            System.out.println("Position: " + position);
        } else {
            System.out.println("Roll Number Not Found");
        }
    }
}
