/**
 * Animated_Bubbles.java
 * @author Garrett J. Beasley
 * 10/06/2014
 * Draws a House Picture
 */

/** Imports for the project */
import java.awt.Color;
import acm.graphics.*;
import acm.program.GraphicsProgram;


public class Animated_Bubbles extends GraphicsProgram
{
	/**Constant Window Size*/
	public static final int WINDOW_X = 500;
	public static final int WINDOW_Y = 400;
	
	/**Bubble 1 Variables*/
	double bubbleSizeIncrease = 0.03;
	int bubbleSize = 50;
	int bubbleSpeed = -2;
	int bubbleStartY = 300;
	
	/**Bubble 2 Variables*/
	double bubbleSizeIncrease2 = 0.03;
	int bubbleSize2 = 25;
	int bubbleSpeed2 = -1;
	int bubbleStartY2 = 330;
	
	/**Init Method*/
	public void init()
	{
		/**Set the size of the applet*/
		setSize(WINDOW_X,WINDOW_Y);
		
		/**Sets the background of the applet to the image specified as background in the root directory*/
		GImage image = new GImage("Background.png");
		
		/** Adds the image to the project*/
		add(image);
	}
	
	/**Run method*/
	public void run()
	{
		//setBackground(image);
		bubble();
		
		
		
	}
	
	
	
	/**Bubble 1/2 Method*/
	public void bubble()
	{
	
		/** Creates new bubbles 1/2 with a random x coordinate thats withen the applet window, a set size for each bubble and
		 *  a set y coordinate for it start at*/
		GOval bubble = new GOval((int) (Math.random( )*(WINDOW_X-bubbleSize)),bubbleStartY,bubbleSize,bubbleSize);
		GOval bubble2 = new GOval((int) (Math.random( )*(WINDOW_X-bubbleSize)),bubbleStartY,bubbleSize,bubbleSize);
		
		/**Creates a new Variable for colors called rand/rand2 and uses the math.random *255 colors to randomize the color of the bubbles*/
		Color rand = new Color((int) (Math.random( )*255),(int) (Math.random( )*255),(int) (Math.random( )*255),(int) (Math.random( )*255));
		Color rand2 = new Color((int) (Math.random( )*255),(int) (Math.random( )*255),(int) (Math.random( )*255),(int) (Math.random( )*255));
		
		/** Sets the bubble 1/2 filled so they have a color*/
		bubble.setFilled(true);
		bubble2.setFilled(true);
		
		/** sets the bubble 1/2 a random color every time the program is started */
		bubble.setFillColor(rand);
		bubble2.setFillColor(rand);
		
			while(true)
			{
				
				
				/**Bubble 1 Section of the code*/
				bubbleSizeIncrease+=0.18;
				
				/**Add bubble 2 to the window*/
				add(bubble);
				
				/**Sets the size of the bubble2 according to the variables at the start of the program, ALlows the bubbles to slow increase in size*/
				bubble.setSize(bubbleSize+bubbleSizeIncrease ,bubbleSize+bubbleSizeIncrease);
				
				/**Moves the bubbles up according to the programmed speed*/
				bubble.move(0, bubbleSpeed);
				
				/**Pause the program just enough so the bubble slow goes up the window*/
				pause(20);
				
				
				/**Checks the bubble 1 to see if its hitting the top to start the bubble1 over again*/
				if(bubble.getY() <= 0)
				{
					/**Changes the bubble size back to zero again to start over growing as it goes up*/
					bubbleSizeIncrease=0;
					
					/**Sets the default size of the bubble according to the variables*/
					bubble.setSize(bubbleSize, bubbleSize);
					
					/**Adds the bubble to the program again and resets the size of the bubble to the default specified in the variables*/
					add(bubble, (int) (Math.random( )*(WINDOW_X-bubbleSize)), bubbleStartY);
				}
				
				
				/**Checks Bubble 1 to see if its hitting the edge of the applet*/
				if(bubble.getX() + bubble.getHeight() >= WINDOW_X)
				 {
					/**Moves the bubble2 over from the edge of the applet to stop it from going outside the window*/
					 bubble.move(-3, 0);
				 }
				
				
				
				
				/**Bubble 2 Section of the code*/
				bubbleSizeIncrease2+=0.18;
				
				/**Add bubble 2 to the window*/
				add(bubble2);
				
				/**Sets the size of the bubble2 according to the variables at the start of the program, ALlows the bubbles to slow increase in size*/
				bubble2.setSize(bubbleSize2+bubbleSizeIncrease2 ,bubbleSize2+bubbleSizeIncrease2);
				
				/**Moves the bubbles up according to the programmed speed*/
				bubble2.move(0, bubbleSpeed2);
				
				/**Checks the bubble 2 to see if its hitting the top to start the bubble2 over again*/
				if(bubble2.getY() <= 0)
				{
					/**Changes the bubble size back to zero again to start over growing as it goes up*/
					bubbleSizeIncrease2=0;
					
					/**Sets the default size of the bubble according to the variables*/
					bubble2.setSize(bubbleSize2, bubbleSize2);
					
					/**Adds the bubble to the program again and resets the size of the bubble to the default specified in the variables*/
					add(bubble2, (int) (Math.random( )*(WINDOW_X-bubbleSize2)), bubbleStartY2);
				}
				
				/**Checks Bubble 2 to see if its hitting the edge of the applet*/
				if(bubble2.getX() + bubble2.getHeight() >= WINDOW_X)
				 {
					/**Moves the bubble2 over from the edge of the applet to stop it from going outside the window*/
					 bubble2.move(-3, 0);
				 }
				
			}
			
			
			
	}
}