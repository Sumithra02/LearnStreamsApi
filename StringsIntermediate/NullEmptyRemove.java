package StringsIntermediate;

import java.util.Arrays;
import java.util.List;

public class NullEmptyRemove {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "CSharp", "null",null, "pyth","", "Script",null, "pascal", "php");
        languages.stream().filter(str->str!=null && !str.isEmpty()).forEach(System.out::println);

    }
}
