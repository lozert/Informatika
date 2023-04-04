package Lab_8_odnomernie_massiv;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
public class exp_6 {
    public static void main(String args[]){

        double max_ves = 100, min_ves = 50,
                max_rost = 200, min_rost = 140,
                max_ball = 5, min_ball = 3,
                srednestat_people = 0;
        int max_semia = 7, min_semia = 3;
        Scanner scn = new Scanner(System.in);

        double mass[][];
        int srednestat[][];
        mass = new double[5][4];
        srednestat = new int[5][4];



        for(int i = 0; i < mass.length; i++){
            for(int j = 0; j < mass[i].length;j++){
                switch (j){
                    case(0):
                        mass[i][j] = RandomChisloDouble(min_ves, max_ves);

                    case(1):
                        mass[i][j] = RandomChisloDouble(min_rost,max_rost);

                    case(2):
                        mass[i][j] = RandomChisloDouble(min_ball,max_ball);

                    case(3):
                        mass[i][j] =RandomChisloInt(min_semia,max_semia);
                }/**switch**/

            }/**for**/
        }/**for**/

        for(int j = 0; j<mass.length-1;j++){/**Вычисление людей с средними значениями**/
            int count = 0;
            double summ = 0;
            for(int i = 0; i<mass.length;i++){
                summ += mass[i][j];
                count++;
            }/**for**/

            double srednee = summ / count;
            for(int i =0; i<mass.length;i++){
                if(mass[i][j] > srednee){
                    srednestat[i][j] = 1;
                } else {
                    srednestat[i][j]= 0;
                }

            }/**for**/
        }/**for**/


        for(int i = 0; i<srednestat.length ;i++){
            for(int j = 0; j<srednestat[i].length; j++){
                System.out.print(srednestat[i][j]+ " ");
            }
            System.out.println("");
        }

        for(int i = 0; i<srednestat.length ;i++){
            int summ = 0;
            for(int j = 0; j<srednestat[i].length; j++){
                summ += srednestat[i][j];
            }
            if(summ > 2){
                System.out.println((i+1) +"-ый человек является среднестатестическим ");
            }
        }


    }
    public static double RandomChisloDouble(double min, double max){
        double x = (Math.random()* ((max-min)+1)+min);
        return x;
    }
    public static double RandomChisloInt(int min, int max){
        double x = (Math.random()* ((max-min)+1)+min);
        return x;
    }
}
