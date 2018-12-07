import javax.swing.JFrame;

public class MazeRunner extends GameResource 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(1080, 1080);
		MazeGrid panel = new MazeGrid();
		frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
