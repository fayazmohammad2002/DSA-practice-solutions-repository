class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int []CombinedArray=new int [n+m];
        // for(int i = 0; i < m; i++)
        //     CombinedArray[i]=nums1[i];
        // for(int j = 0; j < n; j++)
        //     CombinedArray[m+j]=nums2[j];
        // Arrays.sort(CombinedArray);
        // for(int k = 0; k<CombinedArray.length;k++)
        //     nums1[k]=CombinedArray[k];
        int  p = m-1;
        int q = n-1;
        int r = nums1.length-1;
        while(r >= 0)
        {
            if(q<0)
                break;
            if(p >= 0 && nums1[p] >= nums2[q])
                nums1[r--] = nums1[p--];
            else
                nums1[r--] = nums2[q--];
        }
    }
}