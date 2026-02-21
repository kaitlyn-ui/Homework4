public class ElevationMap {
    public static void main(String[] args){
        int[] map = {1, 2, 1, 4, 1, 2, 1, 5,0,0, 2, 1, 5};
        System.out.print(computeMax(map));
    }

    public static int computeMax(int[] array){
        //max wall height
        int leftMax = array[0];
        int rightMax = array[array.length - 1];
        //pointers
        int left = 1;
        int right = array.length - 2;

        int water = 0;
        while (left <= right){
            //calculate water based on right wall height
            if(leftMax >= rightMax){
                //add water, use Math.max() to set any negative values to 0
                water += Math.max(0,rightMax - array[right]);
                //update right max
                rightMax = Math.max(rightMax, array[right]);
                //decrement right pointer
                right--;
            } else{
                //calculate water for left wall height
                water += Math.max(0,leftMax - array[left]);
                //update left max
                leftMax = Math.max(leftMax,array[left]);
                //increment left pointer
                left++;
            }
        }
        return water;
    }
}
