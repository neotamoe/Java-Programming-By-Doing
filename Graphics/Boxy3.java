import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **          B O X Y  3 - write and use function - boxes different sizes           **
 ***********************************************************************************/

class Boxy3 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color       x    y   w   h
		drawBox( window, Color.YELLOW, 200, 300, 50, 30 );
		drawBox( window, Color.GREEN,  400, 240, 100, 100 );
    drawBox( window, Color.RED, 300, 100, 160, 50 );
    drawBox( window, Color.GRAY,  550, 250, 130, 300 );
    drawBox( window, Color.CYAN, 375, 500, 60, 60 );
    drawBox( window, Color.BLUE,  10, 20, 100, 110 );
    drawBox( window, Color.BLACK, 30, 250, 160, 50 );
    drawBox( window, Color.ORANGE,  250, 420, 110, 100 );
		// draw six more boxes -- different colors, different places, different sizes
	}

	public void drawBox( Graphics window, Color c, int x, int y, int w, int h )
	{
		// add code to draw a WxH box in color c at (x,y)
    window.setColor(c);
    window.fillRect(x,y,w,h);
    window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,w-20,h-20);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy3();
		JFrame win = new JFrame("Boxy3 - write and use function - boxes different sizes");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}
