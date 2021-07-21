package com.shubham;

public class Islands {

    public static void main(String[] args) {
        int[][] M = new int[][]
                {{1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        System.out.println("Number of islands is: " + countIslands(M));
    }

    private static int countIslands(int[][] m) {
        int res = 0;
        int h = m.length;
        int w = m[0].length;

        boolean[][] visited = new boolean[w][h];

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (!visited[i][j] && m[i][j] == 1) {
                    ++res;
                    DFS(m, i, j, visited);
                }
            }
        }
        return res;
    }

    private static void DFS(int[][] m, int i, int j, boolean[][] visited) {
        int h = m.length;
        int w = m[0].length;

        visited[i][j] = true;
        int[][] sides = new int[][]{{1, 0},
                {0, 1},
                {-1, 0},
                {0, -1}};

        for (int k = 0; k < sides.length; k++) {
            int x = i + sides[k][0];
            int y = j + sides[k][1];

            if (x < w & y < h && x >= 0 && y >= 0 && !visited[x][y] && m[x][y] == 1) {
                DFS(m, x, y, visited);
            }

        }

    }

}
