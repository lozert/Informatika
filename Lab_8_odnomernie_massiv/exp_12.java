package Lab_8_odnomernie_massiv;


import java.util.Scanner;

public class exp_12 {
    public static void main(String args[]) {

        double mas1[][] = GetMas();
        double mas2[][] = GetMas();
        if (Proverka_massiv(MasUmnoj(mas1,mas2))) {
            System.out.println("\nРезультаты проверки:\nОбратная матрица задана правильно!");
        } else {
            System.out.println("\nРезультаты проверки:\nОбратная матрица задана не правильно!");
        }
    }
    public static double[][] GetMas() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество строчек массива N:");
        int N = scn.nextInt();
        System.out.println("Введите количество столбцов массива M:");
        int M = scn.nextInt();
        double mas[][] = new double[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("Задайте %d элемент %d строки: ", j+1, i+1);
                mas[i][j] = scn.nextDouble();
            }
        }
        return mas;
    }
    public static double[][] MasUmnoj(double[][] mas1, double[][] mas2){
        double mas[][] = new double[mas1.length][mas1.length];
        for(int i = 0; i < mas1.length; i++){
            for(int j = 0; j < mas1.length; j++) {
                for(int k = 0; k < mas1.length; k++){
                    mas[j][i] += mas1[j][k] * mas2[k][i];
                }
            }
        }
        return mas;
    }
    public static boolean Proverka_massiv(double[][] mas){
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas.length;j++){
                if((i == j && mas[i][j] != 1) || (i != j && mas[i][j] != 0)){
                    return false;
                }
            }
        }
        return true;
    }
}
