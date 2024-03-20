public class Maze {
    private final int width, height;
    private final int[][] grid;
    public static final int WALL = 0;
    public static final int PATH = 1;
    public static final int START = 2;
    public static final int END = 3;
    public static final int SOLUTION = 4;

    public Maze(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new int[height][width];
    }

    public void setCell(int x, int y, int value) {
        grid[y][x] = value;
    }

    public int getCell(int x, int y) {
        return grid[y][x];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // 打印迷宫到控制台
    public void print() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                switch (getCell(x, y)) {
                    case WALL:
                        System.out.print("█");
                        break;
                    case PATH:
                    case START:
                    case END:
                        System.out.print(" ");
                        break;
                    case SOLUTION:
                        System.out.print(".");
                        break;
                }
            }
            System.out.println();
        }
    }
}