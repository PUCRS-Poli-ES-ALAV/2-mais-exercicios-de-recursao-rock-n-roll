public class somatorio{
    public static void main(String[] args) {
        System.out.println(soma(-2));

    }

    public static int soma (int n){
        if (n==0){return 0;}
        if (n>0){
            return n + soma(n-1);
        }
        return n + soma (n+1);
    }
}

//1. Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.