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
        Vector2 P0 = new Vector2(100, 100);
        Vector2 P1 = new Vector2(150, 200);
        Vector2 P2 = new Vector2(200, 200);
        Vector2 P3 = new Vector2(250, 100);
        Vector2 lastPoint = new Vector2(P0.X(), P0.Y());
        
        
        /*
        Render.Line(4, p0, p1, new Vector4(0.22f, 1, 0, 1));
        Render.Line(4, p1, p2, new Vector4(0.22f, 1, 0, 1));
        Render.Line(4, p2, p3, new Vector4(0.22f, 1, 0, 1));
        */
        int SEGMENT_COUNT = 4;
        float T;
        
        for(int i = 1; i <= SEGMENT_COUNT; i++)
        {
            T = i / (float)SEGMENT_COUNT;
            Vector2 point = calcBez(T, P0, P1, P2, P3);
            System.out.println("P: " + point.toString());
            Render.Line(4, lastPoint, point, new Vector4(0.22f, 1, 0, 1));
            lastPoint.X(point.X());
            lastPoint.Y(point.Y());
        }
        System.out.println("");
    }
    
    private Vector2 calcBez(float t, Vector2 p0, Vector2 p1, Vector2 p2, Vector2 p3)
    {
        float u = 1 - t;
        float tt = t*t;
        float uu = u*u;
        float uuu = uu*u;
        float ttt = tt*t;
        
        Vector2 p = p0.mult(uuu);
        p = p.add(p1.mult(3 * uu * t));
        p = p.add(p2.mult(3 * u * tt));
        p = p.add(p3.mult(ttt));
        
        return p;
    }
    
    // Getters
    public String TITLE() { return TITLE; }
    
    // Setters
    public void TITLE(String value) { TITLE = value; }
}
