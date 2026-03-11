public class FindSubs {
    public static void main(String[] args) {
        System.out.println(findSubstr("a raposa cacou um sapo no largo lago", "sapo"));
    }

    public static boolean findSubstr(String main, String taishou){
        System.out.println(main);
        if(main.isEmpty()||main.length()<taishou.length())
            return false;
        if(main.substring(0, taishou.length()).equals(taishou))
            return true;
        
        return findSubstr(main.substring(1), taishou);
    }
}
