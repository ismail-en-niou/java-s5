public class rotate {
    public void rotate(int[] nums, int k) {
           reverse(nums, 0, nums.length -1 );
        //    reverse(nums, 0, k - 1);
        //    reverse(nums, k, nums.length -1 );
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
    }

}
    public static void main(String[] args) {
        int []test ={1,2,3,4,5,6,7};
        rotate tata = new rotate();
        for(int i =0 ;i < test.length ;i++ )
        {
            System.out.println(test[i]);
        }
        System.out.println("mora mehzala");
        tata.rotate(test, 3);
        for(int i =0 ;i < test.length ;i++ )
        {
            System.out.println(test[i]);
        }

}}
