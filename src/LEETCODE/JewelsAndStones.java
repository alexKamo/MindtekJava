package LEETCODE;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        int i = 0;
        for(String s : stones){
            if (jewels.contains(s)){
                i++;
            }
        }
        return i;
    }

}
