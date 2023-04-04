package Laba_9_stroki;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
public class exp_10 {
    public static void main(String[] args) {
        // заданный текст
        String text = "Иванов;Иван;Иванович;М;Украинец;180;75;1986,3,12;+380971234567;Динамо;9;нападающий;30;100." +
                "Петров;Петр;Петрович;М;Русский;175;70;1987,5,23;+380931234567;Шахтер;5;защитник;5;70." +
                "Сидоров;Сергей;Александрович;М;Белорус;190;90;1988,8,5;+375291234567;Динамо;2;вратарь;0;20." +
                "Коваленко;Ольга;Николаевна;Ж;Украинка;170;65;1990,1,20;+380991234567;Спартак;8;полузащитник;15;70." +
                "Шевченко;Андрей;Михайлович;М;Украинец;185;80;1976,9,29;+380631234567;Милан;7;нападающий;120;300.";

        // разбиваем текст на строки по разделителю "."
        String[] objects = text.split("\\.");
        int count = 0;
        // список футболистов


        // заполняем список футболистов
        for (String obj : objects) {
            String[] data = obj.split(";");
            String surname = data[0];
            String name = data[1];
            String patronymic = data[2];
            String gender = data[3];
            String nationality = data[4];
            int height = Integer.parseInt(data[5]);
            int weight = Integer.parseInt(data[6]);
            String[] birthdate = data[7].split(",");
            int year = Integer.parseInt(birthdate[0]);
            int month = Integer.parseInt(birthdate[1]);
            int day = Integer.parseInt(birthdate[2]);
            String phone = data[8];
            String team = data[9];
            int number = Integer.parseInt(data[10]);
            String position = data[11];
            int goals = Integer.parseInt(data[12]);
            int games = Integer.parseInt(data[13]);



            if(phone.startsWith("+38") && phone.endsWith(String.valueOf((2023 - year)%10 ))){
                count++;
            }
            if (games > 50 && goals > 20){
                System.out.println(obj);
            }
        }
        System.out.println("Количество людей: " + count);
    }
}
