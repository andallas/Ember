package ember;

public class Clock
{
    private static Clock clock = new Clock();
    
    private long PREVIOUS_TIME;
    private long ELAPSED_TIME = 0;
    private long TICK_TIME = 0;
    private static float DELTA_TIME = 0;
    private static int TICK = 1;
    private static int FPS = 0;
    
    private Clock()
    {}
    
    public static Clock Instance()
    {
        return clock;
    }
    
    public void start()
    {
        PREVIOUS_TIME = getTime();
    }
    
    public void update()
    {   
        long curTime = getTime();
        ELAPSED_TIME = curTime - PREVIOUS_TIME;
        PREVIOUS_TIME = curTime;
        
        DELTA_TIME = (float)(ELAPSED_TIME / 1000.0);
        
        TICK_TIME += DELTA_TIME;
        
        if(TICK_TIME >= (TICK / 20))
        {
            TICK++;
            if(TICK >= 20)
            {
                TICK_TIME = 0;
                TICK = 0;
            }
        }
        
        if(TICK % 5 == 0)
        {
            FPS = (int)Math.floor(1.0f / DELTA_TIME);
        }
    }
    
    private long getTime() { return System.nanoTime() / 1000000; }
    
    // Getters
    public static float DELTA_TIME() { return DELTA_TIME; }
    public static int TICK() { return TICK; }
    public static int FPS() { return FPS; }
}
