package arrays_day_3;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;

        int maxArea=0;

        int currentHeight=Math.min(height[left],height[right]);
        int currentWidth=right-left;

        int currentArea=currentHeight*currentWidth;

        if(currentArea>maxArea){
            maxArea=currentArea;
        }
        if(height[left]<height[right]){
            left++;
        }else {
            right--;
        }
        return maxArea;
    }
    public static void main(String[] args) {

    }
}