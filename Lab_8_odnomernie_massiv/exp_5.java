package Lab_8_odnomernie_massiv;

import java.util.Random;
import java.util.Scanner;
public class exp_5 {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner scn = new Scanner(System.in);
        int summ = 0;

        System.out.println("Введите порядок матрицы: ");
        int n = scn.nextInt();

        int mass[][];
        mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {/**Запись данных в матрицу**/
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = random.nextInt(20);
            }
        }

        for (int i = 0; i < mass.length; i++) {/**Вывод матрицы**/
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("=============");

        for (int i = 0; i < mass.length; i++) { /**сумма элементов матрицы**/
            for (int j = 0; j < mass.length; j++) {
                if (i != j) {
                    summ += mass[i][j];
                }
            }
        }

        System.out.println(summ);
    }
}
