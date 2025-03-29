import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
Predicate<T>: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar o Predicate com expressão lambda para filtrar números pares
        Predicate<Integer> isEven = n -> n % 2 == 0;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .toList();

        // Imprimir a lista de números pares
        evenNumbers.forEach(System.out::println);

        List<String> palavras = Arrays.asList("Java", "Kotlin", "C++", "Python", "JavaScript", "Flutter", "Go", "Ruby", "C#");

        Predicate<String> maiorQueCincoLetras = p -> p.length() > 5;

        palavras.stream()
                .filter(s -> s.length() < 5)
                .forEach(System.out::println);
        System.out.println("------------");
        palavras.stream()
                .filter(maiorQueCincoLetras)
                .forEach(System.out::println);
    }
}
