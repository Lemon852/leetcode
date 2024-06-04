class Main{

    public static int solution(int[] nums, int val){
        int left=0;
        int right=nums.length;
        while(left<right){
            if(nums[left]==val){
                nums[left] =nums[right-1];
                right--;
            }else{
                left++;
            }
        }
        return right;
    }
    public static void main(String[] args){
        int[] nums = {3,2,2,3,1};
       
        System.out.println(solution(nums, 2));
        for(int num:nums){
            System.out.println(num);
        }
    }
}