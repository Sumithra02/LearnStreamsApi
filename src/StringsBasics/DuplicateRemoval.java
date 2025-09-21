package StringsBasics;

import java.util.Arrays;
import java.util.List;

//Qn: Find the duplicate and remove them in the string using StreamsAPI

public class DuplicateRemoval {
    public static void main(String[] args) {
        List<String> programs = Arrays.asList("java", "CSharp", "java", "python", "JScript", "Csharp");
        programs.stream().distinct().forEach(System.out::println);
    }}


