package Laba_9_stroki;

public class exp_1 {
    public static void main(String[] args) {
        char[][] matrix = {
                {'n', 'o', ' ', 't'},
                {'=', 'e', ' ', 'n'},
                {'o', 'n', 'l', 'y'}
        };

        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        int rowNoCount = 0;
        int colNoCount = 0;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (j <= colCount - 2 && matrix[i][j] == 'n' && matrix[i][j + 1] == 'o') {
                    rowNoCount++;
                }
                if (i <= rowCount - 2 && matrix[i][j] == 'n' && matrix[i + 1][j] == 'o') {
                    colNoCount++;
                }
            }
        }

        System.out.println("Количество совпадений по строке: " + rowNoCount);
        System.out.println("Количество совпадений по столбцу: " + colNoCount);
    }
}
