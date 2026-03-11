public class nroDigitos {
    public static void main(String[] args) {
        System.out.println(nroDigit(5005000));
    }

    public static int nroDigit(int n){
        if (n<10){return 1; }
        return 1 + nroDigit(n/10);
    }
}

// 1. Faça um método recursivo que determina o número de dígitos de um inteiro.
// 	  ``` 
//          int nroDigit(int n)
// 	  ``` 