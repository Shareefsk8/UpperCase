package ToUpperCase;

//class that consists of a main class,method to convert lowercase to uppercase and the other methods to make test-cases
public class UpperCase {

    //Main method to execute all methods
        public static void main(String[] args) {
            System.out.println(toUppercase("Hello, World!"));

            //Positive Inputs
            System.out.println(tc1_MixOfLowerandUpperCase());
            System.out.println(tc2_IncludesNumbers());
            System.out.println(tc4_IncludesSpecialCharacters());
            System.out.println(tc5_Check_EmptyString());
            System.out.println(tc7_checkWithAllUpperCaseLetters());
            System.out.println(tc8_checkWithSentence());


            //Negative Inputs
            System.out.println(tc3_Verify_Null());
            System.out.println(tc6_check_EmptySpaces());

        }

        //method to convert a string into UpperCase
        public static String toUppercase(String str) {
            String result = "";
            if(str.length()==0){
               return "Cannot be empty";
            }
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
                    result += Character.toUpperCase(ch);
                } else {
                    result += ch;
                }
            }
            return result;
        }
    //method for testcase1 to test with a string cosisting of lowercase and uppercase characters
        public static boolean tc1_MixOfLowerandUpperCase(){
            String input="Shareef";
            String expected="SHAREEF";
            String actual=toUppercase(input);
            if(actual.equals(expected)){
                return true;
            }
            return false;
        }
    //method for testcase2 to test with a string which includes numbers also
    public static boolean tc2_IncludesNumbers(){
            String input="Shareefsk8";
            String expected="SHAREEFSK8";
            String actual=toUppercase(input);
            if(actual.equals(expected)){
                return true;
            }
            return false;
        }
    //method for testcase3 to test with a string which is null
    public static boolean tc3_Verify_Null(){
            String input=null;
            String expected=null;
            String actual=toUppercase(input);
            if(actual.equals(expected)){
                return true;
            }
            return false;
        }
    //method for testcase4 to test with a string which includes special characters also
    public static boolean tc4_IncludesSpecialCharacters(){
            String input="Shareef!!??";
            String expected="SHAREEF!!??";
            String actual=toUppercase(input);
            if(actual.equals(expected)){
                return true;
            }
            return false;
        }
        //method for testcase5 to test with an empty string
        public static boolean tc5_Check_EmptyString(){
            String input="";
            String expected="Cannot be empty";
            String actual=toUppercase(input);
            if(actual.equals(expected)){
                return true;
            }
            return false;
        }
    //method for testcase6 to test with an string of empty spaces
        public static boolean tc6_check_EmptySpaces(){
            String input="  ";
            String expected="Cannot be empty";
            String actual=toUppercase(input);
            if(actual.equals(expected)){
                return true;
            }
            return false;
        }
        //method for testcase7 to check with all uppercase letters
        public static boolean tc7_checkWithAllUpperCaseLetters(){
            String input="SHAREEFSK";
            String expected="SHAREEFSK";
            String actual=toUppercase(input);
            if(actual.equals(expected)){
                return true;
            }
            return false;
        }
        //method for testcase8 to check with a string consisting of a group of words
        public static boolean tc8_checkWithSentence(){
            String input="Shareef is a Good Boy";
            String expected="SHAREEF IS A GOOD BOY";
            String actual=toUppercase(input);
            if(actual.equals(expected)){
                return true;
            }
            return false;
        }
}
