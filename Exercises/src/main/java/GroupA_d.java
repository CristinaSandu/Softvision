import java.io.IOException;
import java.util.*;


public class GroupA_d {

    //d. Sa se implimenteze o metoda care primeste ca parametru 2 liste de numere si returneaza numerele comune celor doua liste.

    public static void main(String[] args) {

        List<Integer> firstParam= Arrays.asList(11, 22, 33, 44, 55, 55, 11);
        List<Integer> secondParam= Arrays.asList(11, 21, 33, 42, 55);

        commonList(firstParam, secondParam);
    }

    public static void commonList(List<Integer> parameter1, List<Integer> parameter2) {

        ArrayList<Integer> firstList = new ArrayList<Integer>();
        firstList.addAll(parameter1);
        System.out.println("FirstList: --> " + firstList);
        ArrayList<Integer> secondlist = new ArrayList<Integer>();
        secondlist.addAll(parameter2);
        System.out.println("SecondList: -->  " + parameter2);
        firstList.retainAll(secondlist);
        System.out.println("Common Elements: --> "+firstList); //before removal duplicates
        ArrayList<Integer> withoutDuplicates = new ArrayList<Integer>();


        for (Integer element : firstList) {

            // If this element is not present in withoutDuplicates list then add it
            if (!withoutDuplicates.contains(element)) {
                withoutDuplicates.add(element);
            }
        }
        System.out.println("Without  duplicates: --> " + withoutDuplicates);
    }
}
