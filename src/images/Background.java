package images;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Background {
	private BufferedImage image;

	private int x;
	private int y;
	private int dx = 0;

	public Background()
	{
		this(0, 0);
	}

	public Background(int x, int y)
	{
		this.x = x;
		this.y = y;

		// Try to open the image file background.png
		try
		{
			image = ImageIO.read(new File("res/Background.png"));
		} catch (Exception e)
		{
			System.out.println(e);
		}

	}
	
	public void move()
	{
		x+=dx;

		 
	        // Check to see if the image has gone off stage left
	        if (this.x <= -1 * image.getWidth()) {
	 
	            // If it has, line it back up so that its left edge is
	            // lined up to the right side of the other background image
	            this.x = this.x + image.getWidth() * 2;
	        }
	        if (this.x >= (image.getWidth()))
	        	this.x = -1 * image.getWidth();
	}
	
	public void KeyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		        dx = -5;
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			dx = 5;
	}
	
	public void KeyReleased(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		        dx = 0;
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			dx = 0;
	}

	/**
	 * Method that draws the image onto the Graphics object passed
	 * 
	 * @param window
	 */
	public void paint(Graphics2D g2d)
	{

		// Draw the image onto the Graphics reference
		g2d.drawImage(image, getX(), getY(), image.getWidth(), image.getHeight(), null);
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getX()
	{
		return this.x;
	}

	public int getY()
	{
		return this.y;
	}

	public int getImageWidth()
	{
		return image.getWidth();
	}

	public String toString()
	{
		return "Background: x=&amp;amp;amp;quot;" + getX() + ", y=" + getY() + ", height="
				+ image.getHeight() + ", width=" + image.getWidth();
	}

}