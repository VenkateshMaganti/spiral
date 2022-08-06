package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
//        int[][] s = new int[rows][columns];
//        int value = 1;
//
//        int minCol = 0;
//
//        int maxCol = columns-1;
//
//        int minRow = 0;
//
//        int maxRow = rows-1;
//
//        while (value <= rows*columns) {
//            for (int i = minCol; i <= maxCol; i++) {
//                s[minRow][i] = value;
//
//                value++;
//            }
//
//            for (int i = minRow + 1; i <= maxRow; i++) {
//                s[i][maxCol] = value;
//
//                value++;
//            }
//
//            for (int i = maxCol - 1; i >= minCol; i--) {
//                s[maxRow][i] = value;
//
//                value++;
//            }
//
//            for (int i = maxRow - 1; i >= minRow + 1; i--) {
//                s[i][minCol] = value;
//
//                value++;
//            }
//
//            minCol++;
//
//            minRow++;
//
//            maxCol--;
//
//            maxRow--;
//        }
//        return s;

        // Initialize value to be filled in matrix
        int m = rows;
        int n = columns;
        int val = 1;
        int[][] a = new int[m][n];
    /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index */
        int k = 0, l = 0;
        while (k < m && l < n)
        {
        /* Print the first row from the remaining
          rows */
            for (int i = l; i < n; ++i)
                a[k][i] = val++;

            k++;

        /* Print the last column from the remaining
          columns */
            for (int i = k; i < m; ++i)
                a[i][n-1] = val++;
            n--;

        /* Print the last row from the remaining
           rows */
            if (k < m)
            {
                for (int i = n-1; i >= l; --i)
                    a[m-1][i] = val++;
                m--;
            }

        /* Print the first column from the remaining
           columns */
            if (l < n)
            {
                for (int i = m-1; i >= k; --i)
                    a[i][l] = val++;
                l++;
            }
        }
        return a;
    }
}
