import javax.swing.*;
import java.awt.*;

public class MazeGUI extends JPanel {
    private Maze maze;

    public MazeGUI(Maze maze) {
        this.maze = maze;
        this.setPreferredSize(new Dimension(400, 400)); // 设置绘制面板的首选大小
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMaze(g);
    }

    private void drawMaze(Graphics g) {
        int cellSize = Math.min(getWidth() / maze.getWidth(), getHeight() / maze.getHeight());
        for (int i = 0; i < maze.getHeight(); i++) {
            for (int j = 0; j < maze.getWidth(); j++) {
                int cell = maze.getCell(j, i);
                if (cell == Maze.WALL) {
                    g.setColor(Color.BLACK);
                } else if (cell == Maze.PATH || cell == Maze.SOLUTION) {
                    g.setColor(Color.WHITE);
                } else if (cell == Maze.START) {
                    g.setColor(Color.GREEN);
                } else if (cell == Maze.END) {
                    g.setColor(Color.RED);
                }
                g.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);

                if (cell == Maze.SOLUTION) {
                    g.setColor(Color.BLUE);
                    g.fillRect(j * cellSize, i * cellSize, cellSize, cellSize);
                }
            }
        }
    }

    public void updateMaze(Maze maze) {
        this.maze = maze;
        repaint();
    }
}