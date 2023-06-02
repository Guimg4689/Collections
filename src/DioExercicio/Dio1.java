package DioExercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Dio1 {
    public static void main(String[] args) {
        ArrayList<Integer>temperatura  = new ArrayList<>();
        temperatura.add(30);
        temperatura.add(32);
        temperatura.add(27);
        temperatura.add(22);
        temperatura.add(34);
        temperatura.add(20);
        int media = 0;
        int soma = 0;


        temperatura.iterator();
        Iterator<Integer> it = temperatura.iterator();
        while (it.hasNext()){
            int next = it.next();
            soma+=next;
        }
        media = soma/ temperatura.size();
        System.out.println("Media Semestral: " + media);

        for(Integer a : temperatura){
            if(a > media){

                switch ( temperatura.indexOf(a)){
                    case 0:
                        System.out.println("Janeiro: " + a );
                        break;
                    case 1:
                        System.out.println("Fevereiro: " + a );
                        break;
                    case 2:
                        System.out.println("Marco: " + a );
                        break;
                    case 3:
                        System.out.println("Abril: " + a );
                        break;
                    case 4:
                        System.out.println("Maio: " + a );
                        break;
                    case 5:
                        System.out.println("Junho: " + a );
                        break;
                }


            }
        }
    }
}
