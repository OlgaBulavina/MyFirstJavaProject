package homework3;

import java.util.Scanner;

public class Namesackes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        String name2 = console.nextLine();
        if (name1.equalsIgnoreCase(name2)) System.out.println("Вы тезки");
        else System.out.println("у вас разные имена");

        console.close();
    }
}
