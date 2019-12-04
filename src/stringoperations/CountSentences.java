package stringoperations;

public class CountSentences {

    public static void main(String[] args) {
        Data data = new Data();
        String text = data.text;
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char textChar = text.charAt(i);
            if (textChar == '.' || textChar == '!') {
                count++;
            }
        }
        System.out.println(count);
    }
}
