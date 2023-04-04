package Laba_9_stroki;

import java.util.HashMap;
import java.util.Scanner;


import static java.lang.Math.*;

public class exp_2 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите число в 12-ричной системе: " );
        String input = scn.next();
        HashMap<Character, Integer> system12=
                new HashMap<>();
        system12.put('0',0);
        system12.put('1',1);
        system12.put('2',2);
        system12.put('3',3);
        system12.put('4',4);
        system12.put('5',5);
        system12.put('6',6);
        system12.put('7',7);
        system12.put('8',8);
        system12.put('9',9);
        system12.put('A',10);
        system12.put('B',11);

        HashMap<Integer, Character> system16=
                new HashMap<>();
        system16.put(0,'0');
        system16.put(1,'1');
        system16.put(2,'2');
        system16.put(3,'3');
        system16.put(4,'4');
        system16.put(5,'5');
        system16.put(6,'6');
        system16.put(7,'7');
        system16.put(8,'8');
        system16.put(9,'9');
        system16.put(10,'A');
        system16.put(11,'B');
        system16.put(12,'C');
        system16.put(13,'D');
        system16.put(14,'E');
        system16.put(15,'F');

        int summ_10 = 0;
        String summ_16 = "";
        for(int i = input.length()-1; i >=0 ; i--){
            try {
                summ_10 +=system12.get(input.charAt(i)) * pow(12, input.length()-i-1 );
            } catch (Exception e){
                System.out.println("Это не 12 ричаня система счисления");
            }
        }

        while(summ_10 >0){
            summ_16 += system16.get(summ_10%16);
            summ_10 /= 16;
        }

        System.out.println(reverse(summ_16));
    }
    public static String reverse(String chislo){
        String summ_16 = "";
        for(int i = chislo.length()-1; i >= 0; i--){
            summ_16 += chislo.charAt(i);
        }
        return summ_16;
    }
}
