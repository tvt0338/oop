public class TetrisGrid {

    boolean isFull(boolean[][] grid, int index) {
        int rong=grid.length;
        for(int i=0;i<rong;i++) {
            if(!grid[i][index]) {
                return false;
            }
        }
        return true;
    }

    void clearRows(boolean[][] grid) {
        int rong=grid.length;
        int dai=grid[0].length;
        int hangmoi=dai-1; // để duyệt từng hàng 1 từ dưới lên trên
        for(int i=dai-1;i>=0;i--) {
            if(!isFull(grid,i)) {
                for(int j=0;j<rong;j++) {
                    grid[i][hangmoi]=grid[i][j];
                }
                hangmoi--;
            }
        }
        for(int i=hangmoi;i>=0;i--) {
            for(int j=0;j<rong;j++) {
                grid[j][i]=false;
            }
        }
    }

    boolean[][] getGrid(boolean[][] grid) {
        return grid;
    }
}
