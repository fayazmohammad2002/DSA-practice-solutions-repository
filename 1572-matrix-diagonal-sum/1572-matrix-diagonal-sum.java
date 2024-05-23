class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int r = mat.length;
        int c = mat[0].length;
        for( int rowno = 0; rowno < r ; rowno++)
        {
            int primarydiagonal = mat[rowno][rowno];
            int secondarydiagonal = mat[rowno][c-1-rowno];
            sum += primarydiagonal;
            if (rowno != c-1-rowno)
                sum += secondarydiagonal;
        }
        return sum;
    }
}