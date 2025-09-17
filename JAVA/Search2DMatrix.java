public class Search2DMatrix {
    public static boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = mat[mid / n][mid % n]; // map 1D index to 2D

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] mat1 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12} };
        int target1 = 8;
        System.out.println(searchMatrix(mat1, target1)); // true

        int[][] mat2 = { {1, 2, 4}, {6, 7, 8}, {9, 10, 34} };
        int target2 = 78;
        System.out.println(searchMatrix(mat2, target2)); // false
    }
}
