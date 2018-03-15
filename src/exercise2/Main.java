package exercise2;

public class Main {

    public static void main(String[] args) {
        String s = "apple";
        String s2 = encode(s);
        System.out.println(s2);
    }

    public static String encode(String text) {
        char firstChar = text.charAt(0);
        int num = 0;
        for (int i = 0; i < text.length(); i = i + 1) {
            if (firstChar == text.charAt(i)) {
                num = num + 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i = i + 1) {
            if (((int) text.charAt(i) >= 97) && ((int) text.charAt(i) <= 122)) {
                if (((int) text.charAt(i) + num) > 122) {
                    sb.append((char) ((int) text.charAt(i) + num - 26));
                } else {
                    sb.append((char) ((int) text.charAt(i) + num));
                }
            } else if (((int) text.charAt(i) >= 65) && ((int) text.charAt(i) <= 90)) {
                if (((int) text.charAt(i) + 32 + num) > 122) {
                    sb.append((char) ((int) text.charAt(i) + 32 + num - 26));
                } else {
                    sb.append((char) ((int) text.charAt(i) + 32 + num));
                }

            } else {
                sb.append(text.charAt(i));
            }

        }
        return sb.toString();
    }
}
