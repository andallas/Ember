package ember;

import static org.lwjgl.opengl.GL11.*;

public class Render
{
    //private static Vector4 BG_COLOR = new Vector4(0.078f, 0.616f, 0.8f, 0.1f);
    private static Vector4 BG_COLOR = new Vector4(0f, 0f, 0f, 1f);
    
    public static void Line(float width, Vector2 start, Vector2 end, Vector4 color)
    {
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        glMatrixMode(GL_PROJECTION);
        
        glPushMatrix();
        {
            glBegin(GL_TRIANGLE_STRIP);
            {
                if(end.X() - start.X() > end.Y() - start.Y())
                {
                    glColor4f(color.X(), color.Y(), color.Z(), 0f);
                    glVertex2f(start.X() - width, start.Y());
                    glVertex2f(end.X() - width, end.Y());

                    glColor4f(color.X(), color.Y(), color.Z(), color.W());
                    glVertex2f(start.X(), start.Y());
                    glVertex2f(end.X(), end.Y());

                    glColor4f(color.X(), color.Y(), color.Z(), 0f);
                    glVertex2f(start.X() + width, start.Y());
                    glVertex2f(end.X() + width, end.Y());
                }
                else
                {
                    glColor4f(color.X(), color.Y(), color.Z(), 0f);
                    glVertex2f(start.X(), start.Y() - width);
                    glVertex2f(end.X(), end.Y() - width);

                    glColor4f(color.X(), color.Y(), color.Z(), color.W());
                    glVertex2f(start.X(), start.Y());
                    glVertex2f(end.X(), end.Y());

                    glColor4f(color.X(), color.Y(), color.Z(), 0f);
                    glVertex2f(start.X(), start.Y() + width);
                    glVertex2f(end.X(), end.Y() + width);
                }
            }
            glEnd();
        }
        glPopMatrix();
        
        glDisable(GL_BLEND);
    }
    
    public static Vector4 BG_COLOR()
    {
        return BG_COLOR;
    }
}
