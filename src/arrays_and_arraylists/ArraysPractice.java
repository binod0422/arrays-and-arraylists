package arrays_and_arraylists;
import java.util.Arrays;
public class ArraysPractice {
    public static void main(String[] args) {
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "mango";
        fruits[3] = "avacado";
        fruits[4] = "orange";
        System.out.println(Arrays.toString(fruits));
        System.out.println(fruits.length);

        String[] operatingSystem = {"Windows XP" ,"Windows 7", "Windows 8", "Windows 10", "Window 11"};
        System.out.println(Arrays.toString(operatingSystem));

//        change a few values in each array and then print both arrays to the terminal again
        System.out.println(operatingSystem.length);
        operatingSystem[2] = "Windows 8 Home";
        System.out.println(Arrays.toString(operatingSystem));
    }


}
