package DioExercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4","1","2","3","9","9","6","5");

        //Imprimindo todos elementos
        numerosAleatorios.stream().forEach(numeros-> System.out.println(numeros.toString()));

        //Pegue os 5 numeros e Coloque Dentro de um Set
        System.out.println("-----------------------------------------");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("-----------------------------------------");
        //Transforme uma lista de String para numeros inteiros
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("-----------------------------------------");
        //Pegue os numero pares maiores que 2 e coloque em uma lista
              List<Integer> pares =  numerosAleatorios.stream()
               .map(Integer::parseInt)
               .filter(integer -> integer % 2 == 0 && integer > 2)
               .collect(Collectors.toList());
        System.out.println(pares);

        System.out.println("-----------------------------------------");
        //media dos numeros
        numerosAleatorios.stream()
                .mapToInt(i-> Integer.parseInt(i))
                .average().ifPresent(System.out::println);

        System.out.println("-----------------------------------------");

        //Remova os Valores Impares
        List<Integer>numerosInteiros = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosInteiros);
        numerosInteiros.removeIf(i ->i % 2 != 0);
        System.out.println(numerosInteiros);


    }

}
