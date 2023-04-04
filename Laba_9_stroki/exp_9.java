package Laba_9_stroki;

public class exp_9 {

    public static void main(String[] args) {
        String text = "Это обычный текст. \n" +
                "_А это комментарий, который нужно удалить._\n" +
                "Это продолжение текста. \n" +
                "-Еще один комментарий, который нужно удалить.-\n" +
                "Это конец текста.\n" +
                "=И еще один комментарий, который нужно удалить.=";

        String result = removeComments(text);
        System.out.println(result);
    }

    public static String removeComments(String text) {
        String pattern = "(=.*?=)|(_.*?_)|(-.*?-)";
        return text.replaceAll(pattern, "");
    }

}
