/*
46. Write a Java program to display the system time. Go to the editor
Sample Output:
Current Date time: Fri Jun 16 14:17:40 IST 2017
 */

package A_Basic_Part_I;

public class Basic046 {

    public static void main(String[] args) {
        System.out.format("Current Date time: %tc%n\n", System.currentTimeMillis());
//        System.out.format(String.valueOf(System.nanoTime()));
    }
}