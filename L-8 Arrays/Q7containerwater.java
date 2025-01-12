public class Q7containerwater {
     //Brute force Approach
     public static int maxArea(int[] height) {
        int maxWater = 0;
        int n = height.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int w = j-i; //width 
                int ht = Math.min(height[i], height[j]);//height
                int currWater = w * ht;
                maxWater = Math.max(currWater, maxWater);
            }
        }
        return maxWater;
    }   

    //2 pointer approach
    public static int maxArea2(int[] height) {
        int maxWater = 0;
        int n = height.length;
        int lp = 0; //leftpointer
        int rp = n-1; //rightpointer
        while(lp<rp){
            int w = rp-lp; //width
            int ht = Math.min(height[lp],height[rp]); //min height
            int currentWater = w * ht;
            maxWater = Math.max(currentWater, maxWater);
           if(height[lp] < height[rp]){  //water level controlled by min height so min lp so lp++
            //which bar has minimum height will increment that (if lp > rp then rp--)
                lp++;
           }else{
                rp--;
           }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
