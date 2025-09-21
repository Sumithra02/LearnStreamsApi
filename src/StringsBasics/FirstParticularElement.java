package StringsBasics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Qn:print the first element in the list that starts with a letter 'p'

public class FirstParticularElement {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "CSharp", "java", "python", "JScript","pascal", "Csharp");
        Optional<String> opt=languages.stream().filter(str->str.startsWith("h")).findFirst();
        opt.ifPresent(System.out::println);
}}
