public class inttobin {
    public static void main(String[] args) throws Exception{
        System.out.println(convbase2(3));
    }

    public static String convbase2 (int n) throws Exception{
        if (n<0){throw new Exception ("Número inválido");}
        if (n==0){return "0";}
        return convbase2(n/2)+(String.valueOf(n%2));
    }
}
