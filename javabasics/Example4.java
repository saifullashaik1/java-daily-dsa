public class Example4 {
    public int removeDuplicates(int[] nums){
        if (nums.length ==0) return 0 ;
        int j =1;

        for (int i = 1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        Example4 sol = new Example4();

        int[] nums ={1,1,2};
        int k1 =sol.removeDuplicates(nums);
        System.out.println("unique elements count :" + k1);
        for (int i = 0;i<k1 ;i++){
            System.out.println(nums[i] + " ");

        }
        System.out.println();
    }
}
