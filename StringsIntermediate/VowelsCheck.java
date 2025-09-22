package StringsIntermediate;

import java.util.Arrays;
import java.util.List;

public class VowelsCheck {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "CSharp", "java", "pyth", "Script", "pascal", "php");
       //words having vowels
        System.out.println("words having vowels: ");
        languages.stream().filter(str->str.matches(".*[aeiou].*")).forEach(System.out::println);
       //words not having vowels
        System.out.println("words not having vowels: ");
       languages.stream().filter(str1->!str1.matches(".*[aeiou].*")) .forEach((System.out::println));

    }
}
