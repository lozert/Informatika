package Laba_9_stroki;

import static java.lang.Character.*;



public class exp_4 {
    public static void main(String args[]){
        char[][] matrix =  {{'1','+','5','/','3','-','1','=','3'},
                            {'+','+','-','/','2','-','2','=','2'},
                            {'2','+','1','/','2','-','2','=','2'},
                            {'/','+','/','/','2','-','2','=','2'},
                            {'4','+','2','/','2','-','2','=','2'},
                            {'-','+','+','/','2','-','2','=','2'},
                            {'1','+','2','/','2','-','2','=','2'},
                            {'=','+','=','/','2','-','2','=','2'},
                            {'1','+','1','/','2','-','2','=','2'}};


        int result_left_block = 0, result_right_block = 0, result =0;
        for(int i = 0; i< matrix.length;i++) {
            for(int j = 0; j< matrix[i].length; j++) {
                try {
                    if (matrix[i].length == 9 && isDigit(matrix[i][j]) && (matrix[i + 1][j] == '-' || matrix[i + 1][j] == '+') && isDigit(matrix[i + 2][j]) &&
                            matrix[i + 3][j] == '/' && isDigit(matrix[i + 4][j]) && (matrix[i + 5][j] == '-' || matrix[i + 5][j] == '+') &&
                            isDigit(matrix[i + 6][j]) && matrix[i + 7][j] == '=' && isDigit(matrix[i + 8][j])) {

                        if (matrix[i + 1][j] == '-') {
                            result_left_block = digit(matrix[i][j], 10) - digit(matrix[i + 2][j], 10);
                        } else {
                            result_left_block = digit(matrix[i][j], 10) + digit(matrix[i + 2][j], 10);
                        }
                        if (matrix[i + 5][j] == '-') {
                            result_right_block = digit(matrix[i + 4][j], 10) - digit(matrix[i + 6][j], 10);
                        } else {
                            result_right_block = digit(matrix[i + 4][j], 10) + digit(matrix[i + 6][j], 10);
                        }

                        result = result_left_block / result_right_block;
                        if (result == digit(matrix[i + 8][j], 10)) {
                            System.out.println("("+matrix[i][j] + matrix[i+1][j] + matrix[i+2][j]+")"+matrix[i+3][j] +"("+matrix[i+4][j] + matrix[i+5][j] + matrix[i+6][j]
                                                +") = "+matrix[i+8][j] );

                        }
                    }
                } catch (Exception e) {
                    System.out.print("");
                }
            }
        }
        for(int i = 0; i< matrix.length;i++) {
            for(int j = 0; j< matrix[i].length; j++) {
                try {
                    if (matrix[i].length == 9 && isDigit(matrix[i][j]) && (matrix[i][j+1] == '-' || matrix[i][j+1] == '+') && isDigit(matrix[i][j+2]) &&
                            matrix[i][j+3] == '/' && isDigit(matrix[i][j + 4]) && (matrix[i][j + 5] == '-' || matrix[i][j + 5] == '+') &&
                            isDigit(matrix[i][j + 6]) && matrix[i][j + 7] == '=' && isDigit(matrix[i][j + 8])) {

                        if (matrix[i][j + 1] == '-') {
                            result_left_block = digit(matrix[i][j], 10) - digit(matrix[i ][j + 2], 10);
                        } else {
                            result_left_block = digit(matrix[i][j], 10) + digit(matrix[i ][j + 2], 10);
                        }
                        if (matrix[i][j + 5] == '-') {
                            result_right_block = digit(matrix[i][j + 4], 10) - digit(matrix[i ][j + 6], 10);
                        } else {
                            result_right_block = digit(matrix[i][j + 4], 10) + digit(matrix[i][j + 6], 10);
                        }

                        result = result_left_block / result_right_block;
                        if (result == digit(matrix[i][j + 8], 10)) {
                            System.out.println("("+matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]+")"+matrix[i][j+3] +"("+matrix[i][j+4] + matrix[i][j+5] + matrix[i][j+6]
                                    +") = "+matrix[i][j+8] );

                        }
                    }
                } catch (Exception e) {
                    System.out.print("");
                }
            }
        }



    }
}
