package ProjectDay;

public class FindTheMajorityElement {
    public static void main(String[] args) {

        int[] nums ={3, 3, 4, 2, 3, 3, 2, 4, 4};
        int repeat = 0;
        int mostRepeat = 0;
        for (int i = 0; i<nums.length; i++){
            int sum = 0;
            for (int j = 0; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum++;
                }
                if (sum>repeat){
                    repeat=sum;
                    mostRepeat=nums[i];
                }
            }
        }
        System.out.println(mostRepeat);

    }
}
