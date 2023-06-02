package DioExercicio;

import java.util.*;

public class Estados {
    public static void main(String[] args) {
        HashMap<String, Integer> estados = new HashMap<>();
        estados.put("PE", 9616621);
        estados.put("AL", 3351543);
        estados.put("CE", 9187103);
        estados.put("RN", 3534265);

        // Crie um dicionário e relacione os estados e suas populações;
        for (Map.Entry<String, Integer> a : estados.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }
        //Substitua a população do estado do RN por 3.534.165;
        estados.put("RN", 3534165);
        System.out.println("\n");
        for (Map.Entry<String, Integer> a : estados.entrySet()) {
            System.out.println(a.getKey() + " - " + a.getValue());
        }
        //Confira se o estado PB está no dicionário, caso não adicione: PB -
        //4.039.277;
        if (estados.containsKey("PB") == false)
            estados.put("PB", 4039277);
        //Exiba a população PE;
        System.out.println("Populacao :  " + estados.get("PE"));

        //Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> estados2 = new TreeMap<>(estados);

        for (Map.Entry<String, Integer> b : estados2.entrySet()) {
            System.out.println(b.getKey() + " - " + b.getValue());
        }
        //Exiba o estado com o menor população e sua quantidade;
        //
        //Exiba o estado com a maior população e sua quantidade;
        int min = Collections.min(estados.values());
        int max = Collections.max(estados.values());
        System.out.println("Maior e Menor Populacao");
        for (Map.Entry<String, Integer> b : estados.entrySet()) {
            if (min == b.getValue() || max == b.getValue())
                System.out.println(b.getKey() + " - " + b.getValue());
        }
        //Exiba a soma da população desses estados;
        int soma = 0;
        Iterator<Integer> iterator = estados.values().iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            soma += next;

        }
        System.out.println("soma = " + soma);

        //Exiba a média da população deste dicionário de estados;
        int div = soma / estados.size();
        System.out.println("Media = " + div);
        Iterator<Integer> it = estados.values().iterator();
        while (it.hasNext()){

           if(it.next() < 4000000){it.remove();}

        }
        System.out.println(estados);
        estados.clear();
        System.out.println(estados.isEmpty());
    }
    }
