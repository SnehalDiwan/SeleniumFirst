import java.util.Arrays;

public class StringPractice {
public static void main(String[] args) {
    String [] arr = {"Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"};

    int [] arr2={1,2,8,9,3,7,5};
        //System.out.println(contains(arr2,7));
        int sum=0;
        for( int  i=0; i<arr2.length; i++){
            sum = sum+ arr2[i];
        }

        double avg=sum/arr2.length;
        System.out.println(avg);
        


        System.out.println("orignal array" +Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sorted arrys" +Arrays.toString(arr));
         System.out.println("orignal arry" + Arrays.toString(arr2));
         Arrays.sort(arr2);
         System.out.println("sorted array" + Arrays.toString(arr2));
}
}
