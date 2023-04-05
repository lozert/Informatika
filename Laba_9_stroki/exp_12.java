package Laba_9_stroki;


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

        String[] pastternReplace = {"короче","типа","туто","ну","катка","кекают","краш","дноклы","лол","нуб","падра",
                                    "омг","\\Dстрим\\D","флексит","чиллим","\\s+"};




        // Применяем замены ко всем строкам
        for( String message: messages) {
            System.out.println("Исходный текст: " + message);

            for (int i = 0; i < pastternReplace.length; i++) {
                message = message.toLowerCase().replaceAll(pastternReplace[i], " ");

            }
            System.out.println("Исправленный текст: " + message);
            System.out.println("");
        }

    }

}

