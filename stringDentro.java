public class stringDentro{
    public static void main(String[] args){
        System.out.println(findSubStr("rato bateu na mae","nas"));
    }

    public static boolean findSubStr(String str, String match){
        if(str.length()<match.length()){return false;}
        if (str.substring(0, match.length()).equals(match)){            
            return true;
        }
        return findSubStr(str.substring(1), match);
    }
}

// . Implemente um método recursivo para determinar se um string ocorre dentro de outro.
// 	  ``` 
//          boolean findSubStr(String str, String match)
// 	  ``` 