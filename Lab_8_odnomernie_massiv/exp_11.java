package Lab_8_odnomernie_massiv;


import java.util.Scanner;
import static java.lang.Math.*;

public class exp_11 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Задайте кол-во треугольнтков(N).");
        int n = scn.nextInt();
        System_print(Proverka(Get_koordinat(n),n));
    }

    public static void System_print(double[][] mas){
        System.out.println("Результаты:");
        for(int i = 0; i < mas[0].length; i++) {
            System.out.printf("Треугольник %d:\n", (i+1));
            if (mas[0][i] == 0) {
                System.out.println("1)не существует");
            } else {
                System.out.println("1)существует");
                if (mas[1][i] == 1) {
                    System.out.println("2)равносторонний");
                } else if (mas[1][i] == 2) {
                    System.out.println("2)прямоугольный");
                } else if (mas[1][i] == 3) {
                    System.out.println("2)равнобедренный");
                } else {
                    System.out.println("2)произвольный");
                }
                System.out.printf("Square %d = %.5f\n",i+1, mas[2][i]);
                for(int j = 0; j < mas[0].length; j++){
                    if (i != j && mas[2][i] == mas[2][j] ){
                        System.out.printf("S%d = S%d \n", i+1, j+1);
                    }
                }
            }
            System.out.println();
        }
    }

    public static double Square(double x,double y, double z){
        double p = (x + y + z)/2;
        return pow(p*(p-x)*(p-y)*(p-z),1/2f);
    }

    public static double Dlin(double x1, double x2, double y1, double y2){
        return pow(pow(x2-x1,2) + pow(y2-y1,2),1/2f);
    }

    public static double[][] Proverka(double Mas_koordint[][],int N){
        double[][] MasProver = new double[3][N];
        for(int i = 0; i < N; i++) {
            double fst = Dlin(Mas_koordint[0][i * 3], Mas_koordint[0][i * 3 + 1], Mas_koordint[1][i * 3], Mas_koordint[1][i * 3 + 1]);/**длины трёх сторон**/
            double sec = Dlin(Mas_koordint[0][i * 3 + 1], Mas_koordint[0][i * 3 + 2], Mas_koordint[1][i * 3 + 1], Mas_koordint[1][i * 3 + 2]);/**длины трёх сторон**/
            double thr = Dlin(Mas_koordint[0][i * 3 + 2], Mas_koordint[0][i * 3], Mas_koordint[1][i * 3 + 2], Mas_koordint[1][i * 3]);/**длины трёх сторон**/
            if ((fst >= sec + thr) || (sec >= fst + thr) || (thr >= fst + sec)) {
                for (int j = 0; j < 3; j++) {
                    MasProver[j][i] = 0;
                }
            } else {
                MasProver[0][i] = 1;
                if (fst == sec && fst == thr) {
                    MasProver[1][i] = 1;
                } else if (fst == pow(sec * sec + thr * thr, 1/2f) || sec == pow(fst * fst + thr * thr, 1/2f) ||
                        thr == pow(sec * sec + fst * fst, 1/2f)) {
                    MasProver[1][i] = 2;
                } else if (fst == sec || sec == thr || thr == fst) {
                    MasProver[1][i] = 3;
                } else {
                    MasProver[1][i] = 4;
                }
                MasProver[2][i] = Square(fst, sec, thr);
            }
        }
        return MasProver;
    }

    public static double[][] Get_koordinat(int N){
        Scanner scn = new Scanner(System.in);
        double mas[][] = new double[2][3 * N];
        for(int i = 0; i < 3*N; i ++){
            System.out.printf("Введите координаты %d - го треугольника. \n", i/3+1);
            System.out.printf("%d - я вершина треугольника. \n", i%3+1);
            for (int j = 0; j < 2; j++){
                if(j == 0) {
                    System.out.printf("x = ");
                } else {
                    System.out.printf("y = ");
                }
                mas[j][i] = scn.nextDouble();
            }
            System.out.println();
        }
        return mas;
    }
}

