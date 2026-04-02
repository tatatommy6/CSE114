//this program is created by me
public class lab {

    public static double avglist(int [] nums){
        int sum = 0;
        for(int i= 0;i<nums.length;i++){
            sum += nums[i];
        }
        return (double)sum/nums.length;
    }

    public static void main(String[] args) {
        int [] nums = {45,21,45,2,5,41};
        System.out.printf("the average is %.1f\n", avglist(nums));
    }
}