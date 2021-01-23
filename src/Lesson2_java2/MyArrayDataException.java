package Lesson2_java2;

public class MyArrayDataException extends RuntimeException {

    int i;
    int j;

    public MyArrayDataException(int i, int j) {
        super("Данные не подходят. Строка " + i + ", столбец " + j);
        this.i = i;
        this.j = j;
        }
    }

