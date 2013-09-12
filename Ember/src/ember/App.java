package ember;

public class App
{
    private static App app = new App();
    
    private String TITLE;
    
    private App()
    {}
    
    public static App Instance()
    {
        return app;
    }
    
    public void start(String title)
    {
        TITLE = title;
        Clock.Instance().start();
        Input.Instance().start();
        init();
    }
    
    public final void init()
    {
        
    }
    
    public void update()
    {
        Clock.Instance().update();
        Input.Instance().update();
    }
    
    public void render()
    {
        Vector2 A = new Vector2(100, 100);
        Vector2 B = new Vector2(150, 200);
        Vector2 C = new Vector2(200, 200);
        Vector2 D = new Vector2(250, 100);
        Vector2 lastPoint = new Vector2(A.X(), A.Y());

        float a = 1.0f;
        float b = 1.0f - a;

        int SEGMENT_COUNT = 10;
        for(int i = 1; i <= SEGMENT_COUNT; i++)
        {
            a = (float)(SEGMENT_COUNT - i) / SEGMENT_COUNT;
            b = 1.0f - a;
            Vector2 point = new Vector2();
            
            point.X(A.X()*a*a*a + B.X()*3*a*a*b + C.X()*3*a*b*b + D.X()*b*b*b);
            point.Y(A.Y()*a*a*a + B.Y()*3*a*a*b + C.Y()*3*a*b*b + D.Y()*b*b*b);

            Render.Line(8, lastPoint, point, new Vector4(0.22f, 1, 0, 1));
            lastPoint.X(point.X());
            lastPoint.Y(point.Y());
        }
    }
    
    // Getters
    public String TITLE() { return TITLE; }
    
    // Setters
    public void TITLE(String value) { TITLE = value; }
}
