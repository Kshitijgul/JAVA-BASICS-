package JAVA_Programs.Arrays;

public class Water_trapping {
    public static int trapped_rain_water(int numbers[]){
        int n=numbers.length;

        // Finding the Left Max Boundary Element in Array
        int Left_max[]=new int[n];
        Left_max[0]=numbers[0];
        for (int i=1;i<n;i++){
            Left_max[i]=Math.max(Left_max[i-1],numbers[i] );
        }

        // Finding the right Max Boundary Element in Array
        int Right_max[]=new int[n];
        Right_max[n-1]=numbers[n-1];
        for (int i=n-2;i>=0;i--){
            Right_max[i]=Math.max(Right_max[i+1],numbers[i] );
        }

        int trapped_water=0;
        for (int i=0;i<n;i++){
            int water_level=Math.min(Left_max[i],Right_max[i] );
            trapped_water += water_level - numbers[i];
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapped_rain_water(height));
    }
}
