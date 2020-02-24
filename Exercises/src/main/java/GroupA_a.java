import java.util.*;

public class GroupA_a {

//* fiecare exercitiu din acest grup va fi facut in clase separate cu cate un main method.
//a. Sa se implementeze o metoda care primeste ca parametru o lista de stringuri si sa se
// afiseze pentru fiecare lungimea si numarul de spatii.

    public static void main(String[] args) {

        firstExercise(Arrays.asList("abc", "    ", "   ", "Ana", "are", "mere" ,"     ")); //12 spatii
    }

    public static void firstExercise(List<String> parameter) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.addAll(parameter);

        int length = listOfStrings.size();
        System.out.println("The items from the list: -->  " + listOfStrings);
        System.out.println("Length of ArrayList: --> " + length);

        int s = 0;
        for (String i : listOfStrings) {
            if (i.contains(" ")) {
                s = s + i.length();
            }
        }
        System.out.println("Number of spaces: -->  " + s);
    }
}