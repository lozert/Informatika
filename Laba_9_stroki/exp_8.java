package Laba_9_stroki;

public class exp_8  {
    public static void main(String[] args) {
        String text = "Шёл 1900 год, из-за двух гладких нолей казавшийся " +
                "Сане похожим на одноместную коляску-эгоистку. И правда — всё вокруг мелькало, с невиданной прежде быстротой менялось и, вдруг замерев, подпрыгивало. " +
                "Следом подпрыгивало и Санино сердце и, оказавшись где-то в горле, ухало вниз, маленькое, дрожащее и всё-таки — ликующее. " +
                "Саня не был готов к таким переменам — не поспевал. Он стал скверно спать и за несколько недель вытянулся, почти сравнявшись ростом с мамой. " +
                "От детских кудряшек не осталось и следа: волосы Сани потемнели, стали жёсткими, прямыми и — к его ужасу и стыду — опушили даже верхнюю губу и подмышки.";

        String[] words = text.split("\\s+");

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.contains("m") || word.contains("ь")) {
                word = word.replaceAll("[mь]", "0");
                count++;
            }

            if (word.contains("j") || word.contains("о")) {
                word = word.replaceAll("[jо]", "1");
                count++;
            }

            if (word.contains("k") || word.contains("л")) {
                word = word.replaceAll("[kл]", "2");
                count++;
            }

            if (word.contains("l") || word.contains("д")) {
                word = word.replaceAll("[lд]", "3");
                count++;
            }

            if (word.contains("u") || word.contains("г")) {
                word = word.replaceAll("[uг]", "4");
                count++;
            }

            if (word.contains("i") || word.contains("ш")) {
                word = word.replaceAll("[iш]", "5");
                count++;
            }

            if (word.contains("o") || word.contains("щ")) {
                word = word.replaceAll("[oщ]", "6");
                count++;
            }

            words[i] = word;
        }

        String encryptedText = String.join(" ", words);

        System.out.println("Зашифрованный текст: " + encryptedText);
        System.out.println("Количество зашифрованных слов: " + count);
    }
}


