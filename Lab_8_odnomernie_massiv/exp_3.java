package Lab_8_odnomernie_massiv;

import java.util.Scanner;
import java.util.Random;
public class exp_3 {
    public static void main(String args[]){
        Random random = new Random();
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите угловой коэффициент k используя (,): ");
        double k = scn.nextDouble();
        System.out.println("Введите b: ");
        double b = scn.nextDouble();

        int mass[];
        mass = new int[12];

        for(int i=0; i< mass.length; i++){
            mass[i] = random.nextInt(15);

        }

        /**Вывод точкек, которые лежат выше**/

        for(int i=0; i< mass.length; i+=2){
            try {
                if (mass[i + 1] > k* mass[i] + b){

                    System.out.println("Точка {"+mass[i] + " ; " + mass[i+1]+ "} лежит выше прямой");
                }
            } catch (Exception e){

            }
        }



    }
}
