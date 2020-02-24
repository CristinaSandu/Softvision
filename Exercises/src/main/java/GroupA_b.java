import java.util.ArrayList;
import java.util.List;

public class GroupA_b {


// Sa se implementeze o metoda care primeste ca parametru un numar natural N mai mare ca zero.
// Sa se afiseze suma numerelor pare cuprinse intre zero si N, si media numerelor impare cuprinse intre zero si N.

    public static void main(String[] args) {
        sumAndMedia(8);

    }

    public static void sumAndMedia(int number) {
        int sumEven = 0;
        int sumOdd = 0;
        double average = 0.0;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();


        if (number > 0 && number == (int) number) {  //check number >0 and integer
            for (int i = 0; i <= number; i++) {
                if (i % 2 == 0) {  //check even
                    even.add(i);   //add even numbers to List
                }
                else {               //odd
                    odd.add(i);      // add odd numbers to List
                }
            }
        }
        System.out.println("Even: --> " + even);
        System.out.println("Odd: --> " + odd);

        for (int x:even) {            //sum of even
            sumEven=sumEven+x;
        }
        System.out.println("Sum even " + sumEven );


        for (int y:odd) {            //average of odd
             sumOdd=sumOdd+y;
             average=sumOdd/odd.size();
        }

        System.out.println("Average of Odd " + average);
    }


}