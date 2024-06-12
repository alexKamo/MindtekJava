package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {


    public static void main(String[] args) {

        Integer[] nums = {2,6,4,10,2,3,3,3,10};

        //Convert Array to ArrayList
        List<Integer> list = new ArrayList<>(List.of(nums));

        Integer dup = 0;
        for (int i = 0; i< list.size(); i++) {
            for (int a=i+1; a<list.size(); a++){
                if (list.get(i).equals(list.get(a))){
                    list.remove(a);
                    a--;
                }
            }
        }
        // Convert ArrayList back to Array
        nums=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(nums));

    }

}
