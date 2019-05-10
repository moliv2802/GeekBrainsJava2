package lesson2;

public class MyArrayDataException extends Exception {

    MyArrayDataException(int stroka, int stolbec){

        super("В ячейке = [" + stroka + "][" + stolbec + "]" + "лежат неверные данные");

    }




}
