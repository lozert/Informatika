package Laba_9_stroki;

public class exp_6 {
    public static void main(String[] args){
        String stroka = "mweasdqwe щуц1ыаывацу дуцу юююююююю"
                , new_stroka = "";
        boolean flag = false;
        int count = 0;

        for(int i = 0; i < stroka.length(); i++){
            if(stroka.charAt(i)== 'm' || stroka.charAt(i)=='ь'){
                new_stroka += '0';
                flag = true;
            } else if(stroka.charAt(i)== 'o'){
                new_stroka += '1';
                flag = true;
            } else if(stroka.charAt(i)== 'k' || stroka.charAt(i)== 'л') {
                new_stroka += '2';
                flag = true;
            } else if(stroka.charAt(i)== 'д'){
                new_stroka += '3';
                flag = true;
            } else if(stroka.charAt(i)== 'u' || stroka.charAt(i)== 'г') {
                new_stroka += '4';
                flag = true;
            } else if(stroka.charAt(i)== 'i' || stroka.charAt(i)== 'ш'){
                new_stroka += '5';
                flag = true;
            } else if(stroka.charAt(i)== 'о' || stroka.charAt(i)== 'щ'){
                new_stroka += '6';
                flag = true;
            } else if(stroka.charAt(i) == ' ' && flag){
                count++;
                flag = false;
                new_stroka += stroka.charAt(i);

            } else {
                new_stroka += stroka.charAt(i);
            }
        }
        System.out.println("Полученный текст: "+ new_stroka);
        System.out.println("Количество слов в которых заменились буквы "+ count);
    }
}
