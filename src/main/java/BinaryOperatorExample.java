import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
BinaryOperator<T>: Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
public class BinaryOperatorExample {

    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar o BinaryOperator com expressão lambda para somar dois números inteiros
        BinaryOperator<Integer> sum = Integer::sum;

        // Usar o BinaryOperator para somar todos os números no Stream
        int result = numbers.stream().reduce(0, sum);
        System.out.println(result);

        int value = numbers.stream()
                .reduce(0, Integer::sum);

        // Imprimir o resultado da soma
        System.out.println("A soma dos números é: " + result);
        System.out.println("--------------------");
        System.out.println("A soma dos números é: " + value);
    }
}
