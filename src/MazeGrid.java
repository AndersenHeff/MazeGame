import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MazeGrid extends JPanel
{
	private Cell[][] arr;
	private int row, col;
	private Cell cell;
	private int gWidth, gHeight;

	public MazeGrid()
	{
		gWidth = 1080;
		gHeight = 1080;
		row = 50;
		col = 50;
		arr = new Cell[row][col];
		buildMaze();

	}
	
	public void buildMaze()
	{
		//first cell
		mazeChance();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		cell.draw(g);
	}

	public void mazeChance()
	{
		cell = new Cell(gWidth / row, gHeight / col, 0, 0);
		cell.setColor(Color.gray);
		arr[0][0] = cell;
		
		int chance = (int) (Math.random() * 2);
		if(chance == 0)
		{
			cell = new Cell(gWidth / row, gHeight / col, gWidth / (row - 1), 0);
			cell.setColor(Color.gray);
			arr[row - 49][0] = cell;
		}
		else
		{
			cell = new Cell(gWidth / row, gHeight / col, 0, gHeight / (col - 1));
			cell.setColor(Color.gray);
			arr[0][col - 49] = cell;
		}
	}
	
	public void cellTop()
	{
		int chance = (int) (Math.random() * 2);
		if(cell.getX() == 0)
		{
			if(chance == 0)
			{
				
			}
		}
	}
}
