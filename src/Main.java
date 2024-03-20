import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Maze maze = new Maze(20, 20);
            MazeGenerator.generate(maze);

            JFrame frame = new JFrame("Maze Solver");
            MazeGUI mazeGUI = new MazeGUI(maze);
            frame.add(mazeGUI);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            MazeSolver.solve(maze);
            mazeGUI.updateMaze(maze);
        });
    }
}