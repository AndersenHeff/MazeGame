import java.awt.Color;
import java.awt.Graphics;

public class Cell extends GameResource
{
	private Color c;
	
	public Cell(int width, int height, int x, int y)
	{
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		c = Color.black;
	}
	
	
	
	public void draw(Graphics g)
	{
		g.setColor(c);
		g.fillRect(x, y, width, height);
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getX()
	{
		return x;
	}
	
	public Color getColor()
	{
		return c;
	}
	
	public void setColor(Color c)
	{
		this.c = c;
	}
}
