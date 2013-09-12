package ember;

import static org.lwjgl.opengl.GL11.*;

public class Render
{
    //private static Vector4 BG_COLOR = new Vector4(0.078f, 0.616f, 0.8f, 0.1f);
    private static Vector4 BG_COLOR = new Vector4(0f, 0f, 0f, 1f);
    
    public static void Line(float width, Vector2 start, Vector2 end, Vector4 color)
    {
        // Cut width in half, rounding up.
        width = width % 2 == 0 ? width / 2 : (width + 1) / 2;
        
        glEnable(GL_BLEND);
        glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA);
        glMatrixMode(GL_PROJECTION);
        
        glPushMatrix();
        {
            glBegin(GL_TRIANGLE_STRIP);
            {
                if(Math.abs(end.X() - start.X()) > Math.abs(end.Y() - start.Y()))
                {
                    glColor4f(color.X(), color.Y(), color.Z(), 0f);
                    glVertex2f(start.X() - width - 1, start.Y());
                    glVertex2f(end.X() - width - 1, end.Y());

                    glColor4f(color.X(), color.Y(), color.Z(), color.W());
                    glVertex2f(start.X() - width, start.Y());
                    glVertex2f(end.X() - width, end.Y());

                    glVertex2f(start.X(), start.Y());
                    glVertex2f(end.X(), end.Y());

                    glVertex2f(start.X() + width, start.Y());
                    glVertex2f(end.X() + width, end.Y());

                    glColor4f(color.X(), color.Y(), color.Z(), 0f);
                    glVertex2f(start.X() + width + 1, start.Y());
                    glVertex2f(end.X() + width + 1, end.Y());
                }
                else
                {
                    glColor4f(color.X(), color.Y(), color.Z(), 0f);
                    glVertex2f(start.X(), start.Y() - width - 1);
                    glVertex2f(end.X(), end.Y() - width - 1);

                    glColor4f(color.X(), color.Y(), color.Z(), color.W());
                    glVertex2f(start.X(), start.Y() - width);
                    glVertex2f(end.X(), end.Y() - width);

                    glVertex2f(start.X(), start.Y());
                    glVertex2f(end.X(), end.Y());

                    glVertex2f(start.X(), start.Y() + width);
                    glVertex2f(end.X(), end.Y() + width);

                    glColor4f(color.X(), color.Y(), color.Z(), 0f);
                    glVertex2f(start.X(), start.Y() + width + 1);
                    glVertex2f(end.X(), end.Y() + width + 1);
                }
                /*
                if(Math.abs(end.X() - start.X()) > Math.abs(end.Y() - start.Y()))
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
                */
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
