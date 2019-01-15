package E_Array;

public class Array14 {

    public static void main(String[] args) {

        String[] testString1 = {"Java", "Java", "Java", "Python", "PHP", "C#", "C", "C++"};

        String[] testString2 = {"Python", "a", "b", "d", "e"};

        int count = 0;
        String duplicatedElement = "";

        for (int i = 0; i < testString1.length-1; i++) {
            for (int j = 0; j < testString2.length-1; j++) {
                if (testString1[i].equals(testString2[j])) {
                    count++;
                    duplicatedElement = testString2[j];
                }
            }
        }
        System.out.println("Duplicated Element '" + duplicatedElement + "' occurs " + count + " times.");
    }
}
