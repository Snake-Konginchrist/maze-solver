import java.util.Random;

public class MazeGenerator {
    public static void generate(Maze maze) {
        Random rand = new Random();

        // 简化的迷宫生成逻辑：随机填充
        for (int y = 0; y < maze.getHeight(); y++) {
            for (int x = 0; x < maze.getWidth(); x++) {
                maze.setCell(x, y, rand.nextBoolean() ? Maze.WALL : Maze.PATH);
            }
        }

        // 设定起点和终点
        maze.setCell(0, 1, Maze.START);
        maze.setCell(maze.getWidth() - 1, maze.getHeight() - 2, Maze.END);
    }
}