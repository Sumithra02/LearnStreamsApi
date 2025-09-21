package StringsBasics;

import java.util.Arrays;
import java.util.List;

//Qn: Check whether the list of strings has particular character and print them

public class CharacterCheck {
    public static void main(String[] args) {
        List<String> programs = Arrays.asList("Java", "CSharp", "Java", "python", "JScript", "Csharp");
        programs.stream().filter(str->str.contains("J")).forEach(System.out::println);
    }
}
