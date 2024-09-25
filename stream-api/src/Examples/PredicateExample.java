package Examples;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        palavras.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}
