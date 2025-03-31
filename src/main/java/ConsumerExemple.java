import java.util.Arrays;
import java.util.List;


/*
 - Consumer<T>: Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos
 do Stream sem modificar ou retornar um valor.
 */

public class ConsumerExemple {

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        // Usar o Consumer com expressão lambda para imprimir números pares
//        Consumer<Integer> printEvenNumbers = number -> {
//            if (number % 2 == 0) System.out.println(number);
//        };
//
//        // Usar o Consumer para imprimir números pares no Stream
//        numbers.stream().forEach(printEvenNumbers);
        numbers.forEach(n -> {
            if (n % 2 == 0) System.out.println(n);
        });

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("------------------");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
