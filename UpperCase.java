package ToUpperCase;

public class UpperCase {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

        public static void main(String[] args) {
            toUppercase("Hello, World!");
        }
        public static void toUppercase(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
                    result += Character.toUpperCase(ch);
                } else {
                    result += ch;
                }
            }
            System.out.println(result);
        }
}
