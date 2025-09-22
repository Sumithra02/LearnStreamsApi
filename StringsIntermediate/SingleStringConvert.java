package StringsIntermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingleStringConvert {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "CSharp", "java", "pyth", "Script", "pascal", "php");
        String str=languages.stream().collect(Collectors.joining(","));
        System.out.println(str);
    }
}
