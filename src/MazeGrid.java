import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MazeGrid extends JPanel
{
	private Cell[][] arr;
	private int row, col;
	private Cell cell;
	private int gWidth, gHeight;
	private int width, height;

	public MazeGrid(int row, int col)
	{
		gWidth = 1080;
		gHeight = 1080;
		this.row = row;
		this.col = col;
		width = gWidth / row;
		height = gHeight / col;
		arr = new Cell[row][col];
		buildMaze(0,0);

	}
	
	public void buildMaze(int x, int y)
	{
		ArrayList<Cell> tempList = new ArrayList<Cell>();
		int chance = (int)(Math.random() * tempList.size());
		
		cell = new Cell(gWidth / row, gHeight / col, 0 , 0);
		cell.setColor(Color.gray);
		arr[0][0] = cell;
		//start buildMaze at 0,0
		if(cellTop())
		{
			tempList.add(new Cell(gWidth / row, gHeight / col, x, y - height));
		}
		//iterate over list and pick a random cell
		
		
		
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				arr[i][j].draw(g);
			}
		}
	}
	
	public boolean cellTop()
	{
		//check if cellTop gives indexOutOfBounds exception
		if(arr[row][col - 2] == null && arr[row][col - 1] == null
				&& arr[row + 1][col] == null && arr[row - 1][col] == null)
		{
			return true;
		}
		return false;
	}
}
