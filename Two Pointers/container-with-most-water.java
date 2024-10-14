class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int n=height.length;
        int r=n-1;
        int maxarea=0;
        int area=0;
        while(l<r){
            area=Math.min(height[l],height[r])*(r-l);
            maxarea=Math.max(area,maxarea);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }
}
