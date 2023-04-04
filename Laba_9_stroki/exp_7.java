package Laba_9_stroki;

public class exp_7 {
    public static void main(String[] args){
        String stroka= "lnasdchexpln", new_stroka= ""; /**заданная строка**/

        for(int i = 0; i < stroka.length();i++) {
            try {
                if (stroka.charAt(i) == 'e' && stroka.charAt(i+1) == 'x' && stroka.charAt(i+2) == 'p'){
                    new_stroka += "expx";
                    i+=2;
                } else if(stroka.charAt(i) == 'l' && stroka.charAt(i+1) == 'n'){
                    new_stroka += "lnx";
                    i++;
                } else if(stroka.charAt(i) == 'c' && stroka.charAt(i+1) == 'h'){
                    new_stroka += "chx";
                    i++;
                } else if(stroka.charAt(i) == 's' && stroka.charAt(i+1) == 'h'){
                    new_stroka += "shx";
                    i++;
                } else {
                    new_stroka += stroka.charAt(i);
                }
            } catch (Exception e){
                System.out.println("");
            }
        }
        System.out.println(new_stroka);
    }
}
