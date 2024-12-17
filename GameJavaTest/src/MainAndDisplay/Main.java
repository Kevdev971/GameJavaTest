package MainAndDisplay;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import Object.Player;

public class Main {
     public static void main (String[] args) throws LWJGLException {  	
    	 Display.setDisplayMode(new DisplayMode(1000,800));
    	 Display.create();  	 
    	 
    	 while (!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			GL11.glLoadIdentity();
			Player.CreatePlayer();
			Display.update();
    	 }
    	 System.out.println("Display destroy");
    	 Display.destroy();
    	 System.exit(0);
    }
}