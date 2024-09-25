package Examples;

import java.util.Arrays;
import java.util.List;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println(numeros);
        System.out.println(numerosDobrados);
    }
}
