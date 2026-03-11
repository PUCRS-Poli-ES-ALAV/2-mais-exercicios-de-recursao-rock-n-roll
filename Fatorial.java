import java.util.HashMap;

public class Fatorial{
    private static HashMap<Long, Long> map;
    public static void main(String[] args) throws Exception {
        map = new HashMap<>();
        for(int i=1;i<100;i++){
            System.out.println(fatorial(i));
        }
    }

    public static long fatorial(long n) throws Exception{
        if(n==0)
            throw new Exception("sla");
        if(n==1)
            return 1;
        if(map.containsKey(n))
            return map.get(n);
        long newResult = n*fatorial(n-1);
        map.put(n, newResult);
        return newResult;
    }
}