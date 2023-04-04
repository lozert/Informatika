package Lab_8_odnomernie_massiv;

import java.util.Scanner;
import java.util.Random;
public class exp_2 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        System.out.println("ВВедите число n которое определяет длину массива: ");
        int n = scn.nextInt();

        int mass[];

        boolean status = true;
        int count_itaration = 0;

        while(status) {
            mass = new int[n];


            for (int i = 0; i < n; i++) {
                mass[i] = random.nextInt(20);
            }

            int count = 0;
            for (int i = 1; i < n; i++) {

                if (mass[i-1] == mass[i]) {

                    count++;

                    /**Когда находит два таких элемента , то выводит ответ**/
                    if (count == 2) {

                        /**Вывод массива у которого нашлёсь эти два элемента**/
                        for (int j = 0; j < n; j++) {
                            System.out.print(mass[j] + " ");
                        }
                        System.out.println("Потребовалось "+ count_itaration + " операций");
                        status = false;
                    }
                }
            count_itaration++;

            }
        }


        }
    }

