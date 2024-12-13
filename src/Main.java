import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Main {
     public static void main (String args[]) throws LWJGLException {
    	 Display.setDisplayMode(new DisplayMode(800,600));
    	 Display.create();
    	 
    	 while (!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			GL11.glLoadIdentity();
			
			Display.update();
    	 }
    	 Display.destroy();
    	 System.exit(0);
    }
}