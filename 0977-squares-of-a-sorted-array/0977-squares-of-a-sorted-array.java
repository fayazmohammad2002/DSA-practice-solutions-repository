class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =  nums.length;
        int []res = new int[n];
        int inx = n-1;
        int l = 0;
        int r =  n-1;
        
        
        //bruteforce
        // for (int i = 0 ; i < n ; i++)
        //     nums[i] = nums[i]*nums[i];
        // Arrays.sort(nums);
        
       // twopointer approach
        while(l<=r){
            int sqrofleft = nums[l]*nums[l] ;
            int sqrofright = nums[r]*nums[r] ;
            if (sqrofleft > sqrofright){
                res[inx] = sqrofleft;
                l++;
                }
            else{
                res[inx] = sqrofright;
                r--;
            }
            inx--;
          }      
        return res;
    }
    
}