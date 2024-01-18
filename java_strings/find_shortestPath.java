public class find_shortestPath {
    
    public static float getshortcut(String path){
        int x=0,y=0;

        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //Nort
            if(dir=='N'){
                y++;
            }
            //south
            else if(dir=='S'){
                y--;
            }
            //east
            else if(dir=='E'){
                x++;
            }
            //west
            else{
                x--;
            }
        }
        int xSQ= x*x;
        int ySQ = y*y;

        return (float)Math.sqrt(xSQ + ySQ);
    }
    public static void main(String[] args) {

        String path="WNEENESENNN";

        System.out.print("Shortest Path is: "+ getshortcut(path));
    }
}
