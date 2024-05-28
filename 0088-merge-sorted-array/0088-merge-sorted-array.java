class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []CombinedArray=new int [n+m];
        for(int i = 0; i < m; i++)
            CombinedArray[i]=nums1[i];
        for(int j = 0; j < n; j++)
            CombinedArray[m+j]=nums2[j];
        Arrays.sort(CombinedArray);
        for(int k = 0; k<CombinedArray.length;k++)
            nums1[k]=CombinedArray[k];
    }
}