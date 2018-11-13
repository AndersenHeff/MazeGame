
public class MazeGrid extends GameResource
{
	private int[][] arr;
	private int row, col;
	private Cell cell;
	
	public MazeGrid()
	{
		cell = new Cell(gWidth / 10, gHeight / 10);
		row = gWidth / 10;
		col = gHeight / 10;
		arr = new int[row][col];
		buildMaze();
		
	}
	
	public void buildMaze()
	{
		for(int row = 0; row < gWidth; row += gWidth / 10)
		{
			for(int col = 0; col < gHeight; col += gHeight / 10)
			{
				
			}
		}
	}
}
