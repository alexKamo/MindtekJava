package LEETCODE;

import java.util.*;

public class IntersectionsOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        int i = 0;
//        int j = 0;
//        List<Integer> list = new ArrayList<>();
//        while (i < nums1.length && j < nums2.length){
//            if (nums1[i] == nums2[j]){
//                list.add(nums1[i]);
//                i++;
//                j++;
//            }else if (nums1[i] < nums2[j]){
//                i++;
//            }else {

//                j++;
//            }
//        }
//        int[] res = new int[list.size()];
//         int k = 0;
//         for (int num : list){
//             res[k++] = num;
//         }
//         return res;

        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        //count elements of nums in map
        for (int el : nums1){
             if (!map.containsKey(el)) map.put(el,1);
             else map.put(el, map.get(el) + 1);
        }

        // go thru elements of nums2 and check if element is in a map and its val > 0 -> add element to res and reduce val by -1
        for (int el : nums2){
            if (map.containsKey(el) && map.get(el) > 0){
                list.add(el);
                map.put(el, map.get(el) - 1);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i<=list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    }

}
