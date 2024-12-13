package game;
import static org.lwjgl.opengl.GL.createCapabilities;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.glfw.GLFWVidMode;
import static org.lwjgl.glfw.GLFW.*;

public class main {
	public static void main(String[] args) {
		if (!glfwInit()) {
			throw new IllegalStateException("IDK");
		}
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
		long window = glfwCreateWindow(800, 600, "Game Void", 0, 0);
		if (window == 0) {
			throw new RuntimeException("FTCW");
		}
		GLFWVidMode videoMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
		glfwMakeContextCurrent(window);
		
		createCapabilities();
		glfwShowWindow(window);
		glClearColor(0f, 0f, 0f, 1f);
		
		//LOCAL
		float speed = 0.5f;
		//END
		
		glRotatef((float) (glfwGetTime() * 1f), 1f, 1f, 1f);
		
		 while (!glfwWindowShouldClose(window)) {
			 glClear(GL_COLOR_BUFFER_BIT);
			 
			 //OBJECT
			 
			 if (glfwGetKey(window, GLFW_KEY_W) == GL_TRUE) { glRotatef(speed, speed, 0, 0); }
			 if (glfwGetKey(window, GLFW_KEY_S) == GL_TRUE) { glRotatef(speed, -speed, 0, 0); }
			 if (glfwGetKey(window, GLFW_KEY_A) == GL_TRUE) { glRotatef(speed, 0, speed, 0); }
			 if (glfwGetKey(window, GLFW_KEY_D) == GL_TRUE) { glRotatef(speed, 0, -speed, 0); }
			 
			 glBegin(GL_QUADS);
			 	glColor3f(1, 0, 0);
			 	glVertex3f(-0.1f, -0.1f, 0.1f);
			 	glVertex3f(0.1f, -0.1f, 0.1f);
			 	glVertex3f(0.1f, 0.1f, 0.1f);
			 	glVertex3f(-0.1f, 0.1f, 0.1f);
			 	
			 	glColor3f(0, 1, 0);
			 	glVertex3f(-0.1f, -0.1f, -0.1f);
			 	glVertex3f(-0.1f, 0.1f, -0.1f);
			 	glVertex3f(0.1f, 0.1f, -0.1f);
			 	glVertex3f(0.1f, -0.1f, -0.1f);
			 	
			 glEnd();
			 
			 
			 	 
			 //END
			 
			 
			 glfwSwapBuffers(window);
			 glfwPollEvents();
		 }
		 glfwTerminate();
	}
}
