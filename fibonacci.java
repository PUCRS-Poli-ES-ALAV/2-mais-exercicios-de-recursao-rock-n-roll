public class fibonacci {
    public static void main(String[] args) throws Exception {
        System.out.println(fib(5));
    }

    public static int fib(int n) throws Exception{
        //System.out.println(n);
        if (n==0){return 0;}
        if(n==1){return 1;}
        if (n<1){throw new Exception("Número invalido");}
        return (fib(n-1)+fib(n-2));//achar solucao mlhr???
    }
}
