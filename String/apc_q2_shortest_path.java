package JAVA_Programs.String;

public class apc_q2_shortest_path {
    public static float get_shortest_path(String path){
        int x=0;
        int y=0;
        for (int i=0;i < path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y=y+1;
            } else if (dir == 'S') {
                y=y-1;
            }else if(dir == 'W'){
                x=x-1;
            }else{
                x=x+1;
            }
        }
        int X = x*x;
        int Y = y*y;
        return (float)Math.sqrt(X + Y);
    }
    public static void main(String[] args){
        String path = "WNEENESENNN";
        float ans =get_shortest_path(path);
        System.out.println(ans);
    }
}
