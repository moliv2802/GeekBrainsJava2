package lesson3dop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите новый пароль: ");
        String password = reader.readLine();
        checkPassword(password);
    }
    public static void checkPassword(String password){

        char[] arr = password.toCharArray();
        if (arr.length < 8 || arr.length > 20 ) System.out.println("Пароль должен состоять не менее чем из восьми символов и не более чем из двадцати");
        else if (password.matches("^[^0-9]*$")) System.out.println("Пароль должен содержать хотя бы одну цифру");
        else if (password.matches("^[^A-Z]*$")) System.out.println("Пароль должен содержать заглавные буквы");
        else if (password.matches("^[^a-z]*$")) System.out.println("Пароль должен содержать прописные буквы");
        else if (password.matches("^[^$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-]*$")) System.out.println("Пароль должен содержать хотя бы один спец символ");
        else System.out.println("Ваш пароль успешно изменен!");
        // ^(?=.*[a-z])(?=.*[A-Z])(?=.*\d.*)(?=.*\W.*)[a-zA-Z0-9\S]{8,20}$ можно одной строчкой
    }


}