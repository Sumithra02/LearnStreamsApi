package StringsBasics;

import java.util.Arrays;
import java.util.List;

public class RemoveSpecificWord {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "CSharp", "java", "python", "JScript", "Csharp");
        languages.stream().filter(str -> !str.startsWith("j")).forEach(System.out::println);
    }

    }

