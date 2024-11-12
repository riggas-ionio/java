public class ArrayLoop {
    
    public static void main(String[] args){
        
        int[] nums = new int[10];
        
        for (int i=0; i<10; i++) {
            nums[i] = i* 100;
        }
        
        int i = 9;
        while ( i >= 0) {
            System.out.println(nums[i--]);
        }

        for ( i=0; i<nums.length; i++) {
            nums[i] = i* 10;
        }
        
        i = nums.length-1;
        while ( i >= 0) {
            System.out.println(nums[i--]);
        }

        for ( int element: nums) {
            System.out.println("Element "+element);
        }
        
    }
}