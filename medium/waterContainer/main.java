package waterContainer;

public class main {
    public static int solution(int[]height){
        int maxArea = 0,left =0, right = height.length-1;

        while(left<right){
            int localArea = Math.abs(left-right)*Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, localArea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args){

       int height[] = {1,8,6,2,5,4,8,3,7};
      System.out.print( solution(height));

    }
}
