package images;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingBackground extends JPanel {

	private static final long serialVersionUID = 468336251775553664L;
	public static int width = 800;
	public static int height = 600;
	Background bg = new Background();
	Background bg2 = new Background(bg.getImageWidth(), 0);

	public MovingBackground()
	{
		KeyListener listener = new MyKeyListener();
		addKeyListener(listener);
		setFocusable(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, WIDTH, HEIGHT);
		bg.paint(g2d);
		bg2.paint(g2d);
	}

	public static void main(String[] args) throws InterruptedException
	{
		JFrame frame = new JFrame();
		MovingBackground mvbg = new MovingBackground();
		frame.add(mvbg);
		frame.setSize(width, height);
		//getContentPane().add(new ScrollingBackground());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		while (true)
		{
			mvbg.bg.move();
			mvbg.bg2.move();
			mvbg.repaint();
			Thread.sleep(10);
		}
	}

//	public class ScrollingBackground extends Canvas {
//
//		private static final long serialVersionUID = 2399031745905586968L;
//		// Two copies of the background image to scroll
//		private Background backOne;
//		private Background backTwo;
//
//		private BufferedImage back;
//
//		public ScrollingBackground()
//		{
//			backOne = new Background();
//			backTwo = new Background(backOne.getImageWidth(), 0);
//
//			//
//			// new Thread(this).start();
//			setVisible(true);
//			// while(!key[39])
//			// if(key[39])
//			// {
//			// repaint();
//			// System.out.println("Right Arrow pressed!");
//			// }
//		}
//
//		// @Override
//		// public void run()
//		// {
//		// try
//		// {
//		// while (true)
//		// {
//		// Thread.currentThread();
//		// Thread.sleep(50);
//		// repaint();
//		// }
//		// } catch (Exception e)
//		// {
//		// }
//		// }
//
//		@Override
//		public void update(Graphics window)
//		{
//			paint(window);
//		}
//
//		public void paint(Graphics window)
//		{
//			Graphics2D twoD = (Graphics2D) window;
//
//			if (back == null)
//				back = (BufferedImage) (createImage(getWidth(), getHeight()));
//
//			// Create a buffer to draw to
//			Graphics buffer = back.createGraphics();
//
//			// Put the two copies of the background image onto the buffer
////			backOne.draw(buffer);
////			backTwo.draw(buffer);
//
//			// Draw the image onto the window
//			twoD.drawImage(back, null, 0, 0);
//
//		}
//
//	}

	public class MyKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e)
		{
			bg.KeyPressed(e);
			bg2.KeyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e)
		{
			bg.KeyReleased(e);
			bg2.KeyReleased(e);
		}

		@Override
		public void keyTyped(KeyEvent e)
		{
			// TODO Auto-generated method stub

		}

	}
}
