package Lab_8_odnomernie_massiv;

import java.util.Scanner;
import java.util.Random;

public class exp_10 {
    public static void main(String args[]) {
        int min = -7, max = 6;

        Scanner scn = new Scanner(System.in);

        System.out.println("ВВедите число точек n: ");
        int n = scn.nextInt();
        int mass[][] = new int[2][n];

        for(int i = 0; i < mass.length; i++){
            for(int j = 0; j < mass[i].length;j++){
                mass[i][j] =  RandomChisloInt(min, max);
            }
        }

        for (int i = 0; i < n; i++){
            int flag = Figure_lab_number5(mass[0][i],mass[1][i]);
            if (flag == 1) {
                System.out.printf("Точка (%d, %d) попала внутрь  фигуры \n", mass[0][i],mass[1][i]);
            } else if (flag == 0) {
                System.out.printf("Точка (%d, %d) попала на границу фигуры \n", mass[0][i],mass[1][i]);
            } else {
                System.out.printf("Точка (%d, %d) не попала \n", mass[0][i],mass[1][i]);
            }
        }

        for(int i = 0; i < mass.length; i++){
            for(int  j = 0; j< mass[i].length; j++){
                System.out.print(mass[i][j]+ "\t");
            }
            System.out.println();
        }


    }

    public static int Figure_lab_number5(int x, int y){
        if (figure_One(x, y) == 0 || figure_Two(x, y) == 0 ||
            figure_Three(x, y) == 0 ||figure_Four(x, y) == 0 ||
            figure_Five(x, y) == 0 ) {
            return 0;
        } else if (figure_One(x, y) == 1 || figure_Two(x, y) == 1 ||
                figure_Three(x, y) == 1 ||figure_Four(x, y) == 1 ||
                figure_Five(x, y) == 1 ) {
            return 1;
        } else {
            return -1;
        }
    }


    public static int RandomChisloInt(int min, int max){
        Random rnd = new Random();
        int x = (rnd.nextInt( (max - min) + 1) + min);
        return x;
    }
    public static double k(double x1,double y1,double x2,double y2){
        return (y1 - y2)/(x1 - x2);
    }
    public static double b(double x1,double y1,double x2,double y2){
        return y1 - x1 * k(x1,y1,x2,y2);
    }

    public static int figure_One(double x, double y) {
        if (y <= x * k(-6, -4, -4, 0) + b(-6, -4, -4, 0) &&
                y >= x * k(-2, -6, -6, -4) + b(-2, -6, -6, -4) &&
                y <= x * k(-2, -6, -4, 0) + b(-2, -6, -4, 0)) {

            if (y == x * k(-2, -6, -6, -4) + b(-2, -6, -6, -4) ||
                    y == x * k(-2, -6, -4, 0) + b(-2, -6, -4, 0)) {
                return 0;
            }
            return 1;
        }
        return -1;
    }

    public static int figure_Two(double x, double y) {
        if (y <= x * k(-4, 0, -7, 5) + b(-4, 0, -7, 5) &&
            y >= x * k(-6, -4, -4, 0) + b(-6, -4, -4, 0) &&
            y >= x * k(-6, -4, -7, 5) + b(-6, -4, -7, 5)) {

            if (y == x * k(-6, -4, -7, 5) + b(-6, -4, -7, 5)) {
                return 0;
            }
            return 1;
        }
        return -1;
    }

    public static int figure_Three(double x, double y) {
        if (y >= x * k(-4, 0, 1, 4) + b(-4, 0, 1, 4) &&
            y >= x * k(-4, 0, -7, 5) + b(-4, 0, -7, 5) &&
            y <= x * k(1, 4, -7, 5) + b(1, 4, -7, 5)) {

            if ( y == x * k(1, 4, -7, 5) + b(1, 4, -7, 5)||
                y == x * k(-4, 0, 1, 4) + b(-4, 0, 1, 4)) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    public static int figure_Four(double x, double y) {
        if (x >= 1 && x <= 3 &&
            y <= x * k(1, -2, 3, -1) + b(1, -2, 3, -1) &&
            y >= x * k(1, -7, 3, -4) + b(1, -7, 3, -4)) {

            if (y == x * k(1, -7, 3, -4) + b(1, -7, 3, -4) ||
                    y == x * k(1, -2, 3, -1) + b(1, -2, 3, -1) ||
                    x == 1) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
    public static int figure_Five(double x, double y) {
        if (y <= x * k(3, -1, 5,2) + b(3, -1, 5,2) &&
                y >= x * k(3, -4, 6, -3) + b(3, -4, 6, -3) &&
                y <= x * k(6, -3, 5,2) + b(6, -3, 5,2) && x >= 3) {
            if (y == x * k(3, -1, 5,2) + b(3, -1, 5,2) ||
                    y == x * k(3, -4, 6, -3) + b(3, -4, 6, -3) ||
                    y == x * k(6, -3, 5,2) + b(6, -3, 5,2)) {
                return 0;
            }
            return 1;
        }
        return -1;
    }
}
