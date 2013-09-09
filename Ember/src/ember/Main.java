package ember;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

public class Main
{
    public enum Context
    {
        GL_2D,
        GL_3D
    };
    
    public static String TITLE = "Ember v0.0.1";
    
    public static void main(String[] args)
    {
        // Initialization
        initDisplay();
        initGL(GL_2D);
        initGame();
        
        // Loop
        gameLoop();
        
        // Clean up
        cleanUp();
    }
    
    private static void initGame() { App.Instance().start(TITLE); }
    
    private static void gameLoop()
    {
        while(!Display.isCloseRequested())
        {
            update();
            render();
        }
    }
    
    private static void update() { App.Instance().update(); }
    
    private static void render()
    {
        glClear(GL_COLOR_BUFFER_BIT);
        
        App.Instance().render();

        Display.update();
        Display.sync(60);
    }
    
    private static void initGL(int context)
    {
        switch(context)
        {
            case GL_2D:
                glMatrixMode(GL_PROJECTION);
                glLoadIdentity();
                
                // Set the view frustrum
                glOrtho(0, Display.getWidth(), 0, Display.getHeight(), -1, 1);
                
                glMatrixMode(GL_MODELVIEW);
                
                // Set the background color
                glClearColor(Render.BG_COLOR().X(), Render.BG_COLOR().Y(), Render.BG_COLOR().Z(), Render.BG_COLOR().W());
                
                glDisable(GL_DEPTH_TEST);
            break;
            case GL_3D:
                System.out.println("No 3D context yet");
            break;
        }
    }
    
    private static void initDisplay()
    {
        try
        {
            Display.setDisplayMode(new DisplayMode(640, 480));
            Display.setTitle(TITLE);
            Display.create();
            Display.setVSyncEnabled(true);
            Keyboard.create();
        }
        catch (LWJGLException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void cleanUp()
    {
        Display.destroy();
        Keyboard.destroy();
    }
}