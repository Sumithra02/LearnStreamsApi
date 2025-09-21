package StringsBasics;

import java.util.Arrays;
import java.util.List;

//Qn: Print the length of each element in the list in the ascending order

public class GetLength {
    public static void main(String[] args) {
        List<String> lan= Arrays.asList("java","dotnet","python","c","csharp");
        lan.stream().map(String::length).sorted().forEach(System.out::println);
    }
}
