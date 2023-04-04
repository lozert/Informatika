package Lab_8_odnomernie_massiv;

import java.util.Random;

public class exp_4 {
    public static void main(String args[]){

        int n = 10;
        Random random = new Random();
        int mass[], sheker[], buble[], count_operation[];
        mass = new int[n];
        sheker = new int[n];
        buble = new int[n];
        count_operation = new int[2];
        int count = 0;


        for(int i = 0; i< mass.length; i++){/**Заполнение всех массивов данными**/
            mass[i] = random.nextInt(100);
            sheker[i] = mass[i];
            buble[i] = mass[i];

        }

        shekerSort(sheker,count,count_operation);
        sortedBuble(buble,count,count_operation);
        int raznitsa = count_operation[1] - count_operation[0];
        System.out.println("Количество операций  над массивами отличается " +
                "на " + raznitsa);
    }

    public static void shekerSort(int sheker[] , int count,int count_operation[]){

        int left = 0, right = sheker.length - 1;
        int flag = 1;/**показывает были ли операции передвижения**/

        while ((left < right) && flag > 0 ){

            flag = 0;

            for(int i = left; i < right; i++){
                count++;/**По массиву двигаемся вправо**/
                if(sheker[i]>sheker[i+1]){

                    int chislo = sheker[i+1];
                    sheker[i+1] = sheker[i];
                    sheker[i] = chislo;

                    flag = 1;/**Показывает то, что было передвижение элемента**/
                }
            }
            right--;

            for(int i = right; i>left; i--){/**По массиву движемся вправо**/
                count++;
                if(sheker[i-1] > sheker[i]){

                    int chislo = sheker[i-1];
                    sheker[i-1] = sheker[i];
                    sheker[i] = chislo;

                    flag = 1;
                }
            }

        }/**while**/
       count_operation[0] = count;
    }/**sherekSort**/

    public static void sortedBuble(int buble[], int count, int count_operation[] ){
        int left = 0, right= buble.length -1;
        int flag = 1;

        while(flag > 0) {
            flag = 0;

            for (int i = left; i < right; i++) {
                count++;
                if (buble[i] > buble[i + 1]) {

                    int chislo = buble[i + 1];
                    buble[i + 1] = buble[i];
                    buble[i] = chislo;

                    flag = 1;
                }
            }
        }/**while**/
        count_operation[1] = count;
    }/**buble**/
}
