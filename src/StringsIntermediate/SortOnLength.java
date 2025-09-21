package StringsIntermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortOnLength {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "CSharp", "java", "pyth", "Script", "pascal", "php");
        // In ascending order

        // List<String> str=languages.stream().sorted(Comparator.comparing(String::length)).toList();
//       System.out.println("In ascending order: ");
//        str.forEach(System.out::println);

        //In descending Order
     List<String> str= languages.stream().sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println("In descending order: ");
        str.forEach(System.out::println);


    }

}