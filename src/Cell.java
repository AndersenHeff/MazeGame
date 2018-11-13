import java.awt.Color;
import java.awt.Graphics;

public class Cell extends GameResource
{
	private Color c;
	
	public Cell(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	
	
	public void draw(Graphics g)
	{
		g.setColor(c);
		g.fillRect(x, y, width, height);
	}
	
	
	
	
	
	public void setColor(Color c)
	{
		this.c = c;
	}
}
