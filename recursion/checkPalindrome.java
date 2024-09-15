    public class checkPalindrome {
        public static void main(String[] args) {
            String s = "madam";
            System.out.println(palindromeNo(0,s));
        }

        public static boolean palindromeNo(int i , String s){
            if (i >= s.length() / 2) {
                return true; 
            }
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
            return palindromeNo( i+1, s);
        }
    }