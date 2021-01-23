package Lesson2_java2;

public class MyArraySizeException extends RuntimeException{
    int line;
    int column;

    public MyArraySizeException(int line, int column) {
        super("Неверный размер, строк и столбцов должно быть по 4. У вас: строк " + line + ", столбцов " + column);
        this.line = line;
        this.column = column;
    }
}
