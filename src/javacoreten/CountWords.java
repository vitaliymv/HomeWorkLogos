package javacoreten;

public class CountWords {

    public static void main(String[] args) {

        Data data = new Data();
        String text = data.sentence;
        System.out.println(text.split(" ").length);
    }
}
