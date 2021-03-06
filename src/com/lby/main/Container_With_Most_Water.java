package com.lby.main;

/**
 * Created with IntelliJ IDEA.
 * User: narutolby
 * Date: 13-10-1
 * Time: 下午1:09
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container.
 */
public class Container_With_Most_Water {
    public int maxArea(int[] height) {
         int max = 0,l = 0, r = height.length-1;
         while (l<r){
             int area;
             if(height[l]<=height[r]){
                area = (height[l]) * (r-l) ;
                l++;
             }else{
                 area = (height[r]) * (r-l) ;
                 r--;
             }
             if(area>max){
                 max = area;
             }
         }
        return max;
    }
}
