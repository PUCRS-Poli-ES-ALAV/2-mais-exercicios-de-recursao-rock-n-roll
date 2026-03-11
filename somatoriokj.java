public class somatoriokj {
    public static void main(String[] args) {
        System.out.println(soma(5,1));
    }

    public static int soma(int k, int j){
        if(k==j){return k;}
        if (k>j){
            return k + soma(k-1,j);
        }
        return j + soma(k,j-1);
    }
}
//1. Modele e implemente um método recursivo que calcule o somatório dos 
// números inteiros entre os números k e j, passados como parâmetro.