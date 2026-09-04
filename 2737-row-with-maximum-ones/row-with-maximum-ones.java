class Solution {

    static int getFirstOccIndex(int[][] arr, int rowIndex) {

        int totalCol = arr[0].length;
        int oneCount = 0;

        // Count number of 1s in this row
        for (int col = 0; col < totalCol; col++) {
            if (arr[rowIndex][col] == 1) {
                oneCount++;
            }
        }

        return oneCount;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {

        int totalRow = mat.length;

        int maxi = -1;
        int maxOneWaliRowIndex = -1;

        for (int row = 0; row < totalRow; row++) {

            int oneCount = getFirstOccIndex(mat, row);

            if (oneCount > maxi) {
                maxi = oneCount;
                maxOneWaliRowIndex = row;
            }
        }

        return new int[]{maxOneWaliRowIndex, maxi};
    }
}