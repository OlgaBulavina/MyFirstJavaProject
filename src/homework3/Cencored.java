package homework3;

public class Cencored {
    public static void main(String[] args) {
        String text = "Когда умирают кони — дышат,\n" +
                "Когда умирают травы — сохнут,\n" +
                "Когда умирают солнца — они гаснут,\n" +
                "Когда умирают люди — поют песни.";
        System.out.println(text);
        System.out.println("=======");
        //замена слова умирают на у***т
        String updatedText = text.replace("умирают", "у***т");
        System.out.println(updatedText);

    }
}
