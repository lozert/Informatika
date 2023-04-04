package Lab_8_odnomernie_massiv;



import static java.lang.Math.*;
import java.util.Scanner;
public class exp_1 {
    public static void main(String args[]){

        double summ = 0;
        int chislo = -1;
        int[] nums_9sistem;
        int[] nums_10system;

        nums_9sistem = new int[] {8,5};
        nums_10system = new int[6];


        /**Проверка все символы из девятичной системы или нет и сразу вычисление из
         десятичной формы**/

        for(int i = 0; i < nums_9sistem.length; i++){
            if(nums_9sistem[i] >= 9){
                System.out.println("Это не девятиричная система");
                break;
            } else {
                summ += nums_9sistem[i]* pow(9,chislo);
                chislo--;
            }
        }
//        //0.9506172839506173
//        System.out.println((int) (summ*1e5%10));
        for(int i=1; i<=6;i++){
            nums_10system[i-1] += summ* pow(10,i) %10;
            System.out.print(nums_10system[i-1]);
        }


    }

}
