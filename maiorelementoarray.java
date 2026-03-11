
import java.util.ArrayList;

public class maiorelementoarray {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(5);
        ar.add(2);
        ar.add(10);
        ar.add(20);
        ar.add(6);
        System.out.println(findBiggest(ar));

    }

    public static int findBiggest(ArrayList<Integer> ar){
        if (ar.size()==1){return ar.get(0);}
        if(ar.get(0)>ar.get(1)){
            ar.remove(1);
            return findBiggest(ar);
        }
        ar.remove(0);
        return findBiggest(ar);
    }
}

// 1. Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
//     ``` 
//          int findBiggest(ArrayList<Integer> ar) 
//     ``` 