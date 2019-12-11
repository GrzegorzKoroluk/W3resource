/*
45. Write a Java program to find the size of a specified file. Go to the editor
Sample Output:

/home/students/abc.txt  : 0 bytes
/home/students/test.txt : 0 bytes

 */

package A_Basic_Part_I;

import java.io.File;

public class Basic045 {


    public static void main(String[] args) {
        System.out.println("C:\\Users\\gkoroluk\\Desktop\\DXC\\a.xlsx  : " + new File("C:\\Users\\gkoroluk\\Desktop\\DXC\\a.xlsx").length() + " bytes");
        System.out.println("/home/students/test.txt : " + new File("test.txt").length() + " bytes");
    }

}
