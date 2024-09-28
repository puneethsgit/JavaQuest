/* Give a route containing 4 direction(N,S,E,W) find the shortest path to reach destination */
public class P3shortestpath {
    public static float getShortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            char direction = path.charAt(i);
            //South
            if(direction == 'S'){
                y--;
            }
            //NORTH
            else if(direction == 'N'){
                y++;
            }
            //EAST
            else if(direction == 'E'){
                x++;
            }
            //WEST
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2= y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENN";
        System.out.println(getShortestPath(path));
    }
}
