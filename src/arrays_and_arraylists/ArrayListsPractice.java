package arrays_and_arraylists;
import java.sql.SQLOutput;
import java.util.*;
public class ArrayListsPractice {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
//        Create an ArrayList
            fruits.add("Apple");
            fruits.add("Orange");
            fruits.add("Banana");
            fruits.add("Pineapple");
            fruits.add("Mango");
            System.out.println(fruits);
            System.out.println(fruits.size());
            fruits.remove("Apple");
            System.out.println(fruits);
            fruits.set(1, "Strawberry");
            System.out.println(fruits);

//        add 5 elements to it
//        print the entire ArrayList to the terminal
//        print the length of it
//        remove some elements from the ArrayList
//        print the entire ArrayList again
//        change some values in the ArrayList
//        print it again to see your changes


        ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        num.remove(1);
        System.out.println(num);
//        Create an ArrayList with 5 elements and give the value in-line (you will need to use Arrays.asList())


//        mess around with a couple methods for ArrayLists. Just type out the ArrayList variable name you made and then put a "." and scroll through the list of methods.
//        read the information it shows you and try to figure out how to use it.
//        create different conditionals using "if-else" statements to test different methods. For example:
//        if (myArray.contains("something")){
//        then do something
//        }
//        print out whatever you need to the terminal to check and see if the methods work the way you think they should.

        System.out.println("Print something from arraylists practice");


    }
}
