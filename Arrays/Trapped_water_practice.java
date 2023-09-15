package JAVA_Programs.Arrays;

public class Trapped_water_practice {
    public static int trap(int[] height) {
        int n= height.length;
//        First We have to Find the Right max Boundary and Leftmost Boundary
        int right_max[]=new int[n];
        right_max[0]=height[0];
        for (int i=1;i<n;i++){
//            right_max[i]=Math.max(height[i],right_max[i-1] );
            right_max[i] = Math.max(height[i], right_max[i - 1]);
        }
//        Now we have to Find the Leftmost Boundary
        int left_max[]=new int[n];
        left_max[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--){
//            left_max[i]=Math.max(height[i],left_max[i+1] );
            left_max[i] = Math.max(height[i], left_max[i + 1]);
        }
        int trap_water=0;
        for (int i=0;i<n;i++) {
            int water_lvl = Math.min(right_max[i], left_max[i]);
            trap_water += water_lvl - height[i];
        }
        return trap_water;


    }
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        trap(height);
        System.out.println(trap(height));

    }
}
