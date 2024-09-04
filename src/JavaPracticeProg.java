import java.lang.reflect.Array;
import java.util.Arrays;

// anagragrm

public class JavaPracticeProg {
    public static void main(String[] args) {
        String str1="now";
        String str2="own";

        char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        System.out.println(Arrays.equals(char1, char2));
        
    }
    
}
