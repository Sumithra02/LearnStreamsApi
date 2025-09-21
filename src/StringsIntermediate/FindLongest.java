package StringsIntermediate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
//Qn: Find the longest word in the string

public class FindLongest {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "CSharp", "java", "pyth", "Script", "pascal", "php");
       Optional<String> str= languages.stream().max(Comparator.comparing(String::length)).map(String::toUpperCase);
       str.ifPresent(System.out::println);
    }
}
