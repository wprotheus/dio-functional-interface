import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Function<T, R>: Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
 */

public class FunctionExample {

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = n -> n * 2;

        // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numbersDouble = numbers.stream()
                .map(dobrar)
                .toList();

        List<Integer> dobroFunction = numbers.stream()
                .map(n -> n * 2)
                        .toList();

        // Imprimir a lista de números dobrados
        numbersDouble.forEach(System.out::println);
        dobroFunction.forEach(System.out::println);
    }
}
