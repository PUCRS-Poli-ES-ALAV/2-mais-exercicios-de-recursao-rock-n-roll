import java.util.HashMap;

public class Fibonacci {

    private static HashMap<Long, Long> map;
    public static void main(String[] args){
        map = new HashMap<>();
        for(int i=0;i<10;i++){
            System.out.println(fib(i));
        }
    }

    public static long fib(long n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(map.containsKey(n))
            return map.get(n);
        long newResult = fib(n-1) +fib(n-2);
        map.put(n, newResult);
        return newResult;
    }
}