class Solution {
    public int[] rotate(int[] nums, int k) { 
        int n = nums.length;
    int temp[] = new int[n];
    
    for(int i = 0; i<n; i++)
        temp[(i+k)%n] = nums[i];
    
     for (int i = 0; i < nums.length; i++)
    nums[i] = temp[i];
    
    return nums;    
}
}