package Lesson2_java2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line;
        int column;

        System.out.println("Введите значения для двумерного массива. Выберите размер. Строка и столбец:");
        line = scanner.nextInt();
        column = scanner.nextInt();

        String[][] newArray = new String[line][column];
        try {

            createArr(newArray, scanner, line, column);

            System.out.println("Сумма " + +calcArr(newArray, line, column));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static void createArr(String[][] array, Scanner scanner, int line, int column) {
        if (line != 4 || column != 4) throw new MyArraySizeException(line, column);
        System.out.println("Создайте массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Строка " + i + " Столбец " + j);
                array[i][j] = scanner.next();
//                array[i][j] = scanner.nextInt();
            }
        }
        printArr(array);
        calcArr(array, line, column);
    }

    private static int calcArr(String[][] array, int line, int column) {
        int sum = 0;
        int[][] arrayInt = new int[line][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    arrayInt[i][j] = Integer.parseInt(array[i][j]);
                    sum += arrayInt[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        printArrInt(arrayInt);
        return sum;
    }

    private static void printArr(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static void printArrInt(int[][] array) {
        System.out.println("4 ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
