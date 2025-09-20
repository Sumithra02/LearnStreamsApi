package StringsBasics;
import java.util.List;
import java.util.Arrays;
public class StringsToUppercase {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Sumi","Ram","Ragav","Geetha","Logi","Sanbagam");
        names.stream()
                //used lambda expression
                     //  .map(str->str.toUpperCase())
                //used method references
                      .map(String::toUpperCase)
                      .sorted()
                //used lambda expression
//                      .forEach(str->System.out.println(str))
                //used method references
                       .forEach(System.out::println);
}
}