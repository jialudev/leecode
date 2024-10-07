
/**
 * 48. 旋转图像
 *
 * @see [https://leetcode.cn/problems/rotate-image/?envType=study-plan-v2&envId=top-100-liked
 */
class Solution {
    public static void rotate(int[][] matrix) {
       int matrixLength=matrix.length;
        int[][] temp = new int[matrixLength][matrixLength];
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                temp[j][matrixLength - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrixLength; i++) {
            System.arraycopy(temp[i], 0, matrix[i], 0, matrix[0].length);
        }
    }
}

