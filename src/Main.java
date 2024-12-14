import static org.lwjgl.opengl.GL11.glRotatef;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.Display.*;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL11.*;

public class Main {
     public static void main (String[] args) throws LWJGLException {  	
    	 Display.setDisplayMode(new DisplayMode(800,600));
    	 Display.create();
    	 while (!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			GL11.glLoadIdentity();
			 
			 GL11.glBegin(GL11.GL_QUADS);
			 	GL11.glColor3f(1, 0, 0);
			 	GL11.glVertex2f(-0.1f,0.1f); 	
			 	GL11.glVertex2f(-0.1f,-0.1f);
			 	GL11.glVertex2f(0.1f,-0.1f);
			 	GL11.glVertex2f(0.1f,0.1f);
			 GL11.glEnd();
			 	
			 	
			 
			Display.update();
    	 }
    	 Display.destroy();
    	 System.exit(0);
    }
}