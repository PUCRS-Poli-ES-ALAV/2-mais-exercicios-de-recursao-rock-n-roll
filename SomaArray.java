import java.util.ArrayList;

public class SomaArray {

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        if(args.length>0){
            for (int i = 0; i < Integer.valueOf(args[0]); i++) {
                x.add(i);
            }
        } else {
            x.add(1);
            x.add(10);
        }
        

        System.out.println(somaArray(x));
    }

    public static int somaArray(ArrayList<Integer> arr){
        if(arr.size()==0)
            return 0;
        return arr.removeFirst() + somaArray(arr);
    }
}