public class palindrome {
    public static void main(String[] args) throws Exception{
        System.out.println(isPal("abc"));
    }

    public static boolean isPal (String str) throws Exception{
        if (str == null){throw new Exception("String nula");}
        if (str.length()<=1){return true;}
        return str.charAt(0)!=str.charAt(str.length()-1) ? false : isPal(str.substring(1, str.length()-1));
    }
}
