package javacoreten;

public class ReplaceLoudLetters {

    public static void main(String[] args) {

        Data data = new Data();
        String text = data.text;
        System.out.println(text);
        System.out.println(text.replaceAll("[aeiouAEIOU]", "-"));
    }
}
