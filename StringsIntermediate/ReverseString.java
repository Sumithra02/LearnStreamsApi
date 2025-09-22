package StringsIntermediate;

import java.util.Arrays;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "CSharp", "java", "pyth", "Script", "pascal", "php");
        languages.stream().map(str->new StringBuilder(str).reverse()).forEach(System.out::println);
    }
}
