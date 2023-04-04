package Laba_9_stroki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exp_12 {
    public static void main(String[] args) {
        String[] messages = {
                "Привет!    Ну как ты? Туто лол кекают в чате.",
                "Типа мы катали на велике в парке.",
                "Короче, сегодня дноклы собираются на стрим.",
                "Падра сказал, что он флексит в спортзале.",
                "ОМГ, смотри, какой крутой краш на этом стриме!",
                "Чиллим вечером у костра на природе."
        };

        // Замены для исправления текста
        String[] patternsToReplace = {
                "(\\s+)", // Удаление повторяющихся пробелов
                "\\b(будем\\s+говорить|ну|туто|короче|типа)\\b", // Удаление паразитических слов
                "\\b(катка|кекать|краш|дноклы|лол|нуб|падра|ОМГ|стримить|флексить|чилить)\\b"// Замена молодежного сленга
        };

        // Замены для исправления текста
        String[] replacements = {
                " ", // Удаление повторяющихся пробелов
                "", // Удаление паразитических слов
                "[заменено]" // Замена молодежного сленга
        };

        // Применяем замены ко всем строкам
        for (String message : messages) {
            System.out.println("Исходный текст: " + message);

//            for (int i = 0; i < patternsToReplace.length; i++) {
//                Pattern pattern = Pattern.compile(patternsToReplace[i]);
//                Matcher matcher = pattern.matcher(message);
//                message = matcher.replaceAll(replacements[i]);
//
//            }


            System.out.println("Исправленный текст: " + message);
        }
    }
}

