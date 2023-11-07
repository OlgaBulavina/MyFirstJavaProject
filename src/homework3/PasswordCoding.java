package homework3;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;



public class PasswordCoding {
//    HARD
//    Шифровка пароля.
//    Условие. еобходимо написать программу, которая принимает на вход пароль из 5 символов (строка из латинских букв и цифр) и шифрует его. ароль должен быть зашифрован следующим образом: каждая буква
//    должна быть заменена на код символа, а каждая цифра должна быть
//    увеличена на 1. Зашифрованный пароль должен быть выведен на экран.Требования:
//      1) программа должна считывать строку из латинских букв и цифр.
//      2) программа изменяет строку согласно условию.
//      3) программа должна выводить результат шифрования.

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String password = console.nextLine();

        char[]passwordNewLength = new char[5];
        password.getChars(0,5,passwordNewLength,0);
        System.out.println("Ваш пароль из 5 символов: " + Arrays.toString(passwordNewLength));

        System.out.println("Результат шифрофания: ");

        for (int i = 0; i < passwordNewLength.length; i++) {
            int temp = (int)passwordNewLength[i] +1;
            System.out.println(temp);
        }




    }
}
