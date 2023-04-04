package Laba_9_stroki;


public class exp_5 {
    public static void main(String[] args) {
        String stroka = "aweqicnnisdf", new_stroka = ""; /**заданная строка**/

        for (int i = 0; i < stroka.length(); i++ ){
            if(stroka.charAt(i) == 'a'){
                new_stroka += '@';
            } else if(stroka.charAt(i) == 'd'){
                new_stroka += '$';
            } else if(stroka.charAt(i) == 'n'){
                new_stroka += '№';
            } else if(stroka.charAt(i) == 'z'){
                new_stroka += '*';
            } else {
                new_stroka += stroka.charAt(i);
            }
        }

        System.out.println(new_stroka);
    }
}
