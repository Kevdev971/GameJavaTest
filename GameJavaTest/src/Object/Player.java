package Object;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class Player {
	public static float x = 0;
	public static float y = 0;
	public static float speed = 0.001f;
	public static void CreatePlayer() {
		
		
		if (Keyboard.isKeyDown(Keyboard.KEY_UP)) {
			y+=speed;
		}
		
		if (Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
			y-=speed;
		}
		
		if (Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
			x-=speed;
		}
		
		if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
			x+=speed;
		}
		
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(-0.1f+x, 0.1f+y);
		GL11.glColor3f(1, 0, 0);
		GL11.glVertex2f(0.1f+x, 0.1f+y);
		GL11.glColor3f(0, 1, 0);
		GL11.glVertex2f(0.1f+x, -0.1f+y);
		GL11.glColor3f(0, 0, 1);
		GL11.glVertex2f(-0.1f+x, -0.1f+y);
		GL11.glColor3f(1, 1, 1);
		GL11.glEnd();
	}
}
