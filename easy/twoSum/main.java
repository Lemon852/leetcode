package easy.twoSum;

public class main{
    public static int[] solution(int nums[], int target){
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if((nums[i]+nums[j])== target){
                    
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int[] newArr = solution(nums,9);
        for(int i:newArr){
            System.out.print(nums[i]+" ");
        }

}


}