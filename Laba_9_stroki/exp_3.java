package Laba_9_stroki;

import java.util.ArrayList;
public class exp_3 {
    public static void main(String args[]){
        char[] arr_number = new char[] {'0','1','2','4','5','6','7','8','9'};
        char[] myArray = new char[] {'в','в','0','0',','};
        int kol_propisnie = 0, kol_Iy=  0, kol_zapatai = 0;
        String returns = "", number= "0" , odin_bukv ="1";

        for(int i =0; i < myArray.length;i++){
            if(Character.isUpperCase(myArray[i])){
                kol_propisnie++;
            }
            if(myArray[i] == 'Ю' || myArray[i] =='ю'){
                kol_Iy++;
            }
            if(myArray[i] == ','){
                kol_zapatai++;
            }

            try{

                for(char x:arr_number){
                    if(myArray[i] == x && myArray[i+1] ==x){
                        number = "Да, такие числа существуют";
                    }
                }

                if((myArray[i] =='в' && myArray[i+1] =='о') || (myArray[i] =='о' && myArray[i+1] =='в') ){
                    returns = "Сочетания "+ myArray[i]+ myArray[i+1] + " присутствует";
                } else{
                    returns = "Таких сочетаний нет";
                }


            } catch (Exception e){
                System.out.print("");
            }

            try{
                if(myArray[i] == myArray[i+1] && Character.isLetter(myArray[i])){

                    for(int j = 0; j < myArray.length; j++){
                        if(myArray[i]==arr_number[0] && myArray[i+1]==arr_number[0]){
                            odin_bukv = "Да, такие буквы существуют";
                        }
                    }
                }
            } catch (Exception e){
                System.out.print("");
            }



        }

        System.out.println("a)" +kol_propisnie); //a)
        System.out.println("б) "+kol_Iy); //б)
        if(kol_zapatai >=2){ //в)
            System.out.println("в) Да их больше двух, а точнее "+ kol_zapatai);
        } else {
            System.out.println("в)Их меньше");
        }
        System.out.println("г)" +returns); //г)
        if(number.equals("0")){ //д
            System.out.println("д)Таких чисел нет");
        } else{
            System.out.println("д)" +number);
        }
        if(odin_bukv.equals("1")){
            System.out.println("е)Таких цифр не существует");
        }else{
            System.out.println("e)"+ odin_bukv);//е)
        }


    }
}
