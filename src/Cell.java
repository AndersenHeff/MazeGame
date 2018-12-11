import java.awt.Color;
import java.awt.Graphics;

public class Cell
{
	private Color c;
	private int width, height;
	private int x,y;
	
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
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public int getHeight()
	{
		return height;
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
