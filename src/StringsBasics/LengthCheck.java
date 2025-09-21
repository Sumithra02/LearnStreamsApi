package StringsBasics;

import java.util.Arrays;
import java.util.List;

//Qn: Get the list of strings whose length is greater than 4

public class LengthCheck {
    public static void main(String[] args) {
        List<String> programs = Arrays.asList("java", "CSharp", "java", "python", "JScript", "Csharp");
        programs.stream().filter(str -> str.length() > 4).forEach(System.out::println);
    }}

