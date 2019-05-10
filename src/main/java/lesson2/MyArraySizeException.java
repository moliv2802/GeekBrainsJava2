package lesson2;


public class MyArraySizeException extends Exception {

    MyArraySizeException()
    {
        super("Обнаружен массив с некорректными размерами");
    }

}

