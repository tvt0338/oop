public class CharGrid {
    public static int charArea(char[][] gird, char ch) {
        int m = gird.length;
        int n = gird[0].length;
        int dem = 0;
        int minR = m;
        int maxR = -1;
        int minC = n;
        int maxC = -1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (gird[i][j] == ch) {
                    dem++;
                    minR = Math.min(minR, i);
                    maxR = Math.max(maxR, i);
                    minC = Math.min(minC, j);
                    maxC = Math.max(maxC, j);
                }
            }
        }
        if (dem == 0) {
            return 0;
        } else if (dem == 1) {
            return 1;
        } else {
            return (maxR - minR + 1) * (maxC - minC + 1);
        }
    }

    public static int countPlus(char[][] gird) {
        int m = gird.length;
        int n = gird[0].length;
        int count = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int dem = 0;
                while (true) {
                    if ((i - 1 - dem) < 0 || (i + 1 + dem) > m - 1 || (j - 1 - dem) < 0 || (j + 1 + dem) > n - 1) {
                        break;
                    }
                    if (gird[i][j] == gird[i - 1 - dem][j] && gird[i][j] == gird[i + 1 + dem][j] && gird[i][j] == gird[i][j - 1 - dem] && gird[i][j] == gird[i][j + 1 + dem]) {
                        dem++;
                    } else if (gird[i][j] != gird[i - 1 - dem][j] && gird[i][j] != gird[i + 1 + dem][j] && gird[i][j] != gird[i][j - 1 - dem] && gird[i][j] != gird[i][j + 1 + dem]) {
                        break;
                    } else {
                        dem = 0;
                        break;
                    }
                }
                if (dem != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'A', 'A', 'B', 'A', 'A'},
                {'A', 'B', 'A', 'A', 'A'},
                {'B', 'B', 'B', 'A', 'A'},
                {'A', 'B', 'B', 'B', 'A'},
                {'A', 'A', 'B', 'A', 'A'}
        };

        System.out.println(countPlus(grid));
    }
}
