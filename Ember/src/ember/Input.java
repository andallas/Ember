package ember;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.input.Keyboard;

public class Input
{
    private static Input input = new Input();
    
    private static Map<String, Integer> KEYS;
    
    private Input()
    {}
    
    public static Input Instance()
    {
        return input;
    }
    
    public void start()
    {
        KEYS = new HashMap<>();
        Keyboard.enableRepeatEvents(true);
        initKeyMap();
    }
    
    private void initKeyMap()
    {
        KEYS.put("A", 0);           KEYS.put("B", 0);           KEYS.put("C", 0);
        KEYS.put("D", 0);           KEYS.put("E", 0);           KEYS.put("F", 0);
        KEYS.put("G", 0);           KEYS.put("H", 0);           KEYS.put("I", 0);
        KEYS.put("J", 0);           KEYS.put("K", 0);           KEYS.put("L", 0);
        KEYS.put("M", 0);           KEYS.put("N", 0);           KEYS.put("O", 0);
        KEYS.put("P", 0);           KEYS.put("Q", 0);           KEYS.put("R", 0);
        KEYS.put("S", 0);           KEYS.put("T", 0);           KEYS.put("U", 0);
        KEYS.put("V", 0);           KEYS.put("W", 0);           KEYS.put("X", 0);
        KEYS.put("Y", 0);           KEYS.put("Z", 0);           KEYS.put("0", 0);
        KEYS.put("1", 0);           KEYS.put("2", 0);           KEYS.put("3", 0);
        KEYS.put("4", 0);           KEYS.put("5", 0);           KEYS.put("6", 0);
        KEYS.put("7", 0);           KEYS.put("8", 0);           KEYS.put("9", 0);
        KEYS.put("L_SHIFT", 0);     KEYS.put("R_SHIFT", 0);     KEYS.put("SPACE", 0);
        KEYS.put("TAB", 0);         KEYS.put("ESC", 0);
    }
    
    public static boolean getKeyPressed(String key)
    {
        if(KEYS.containsKey(key))
            return KEYS.get(key) == 1 ? true : false;
        System.out.println("Not a valid Key");
        return false;
    }
    
    public static boolean getKeyHeld(String key)
    {
        if(KEYS.containsKey(key))
            return KEYS.get(key) == 2 ? true : false;
        System.out.println("Not a valid Key");
        return false;
    }
    
    public static boolean getKeyUp(String key)
    {
        if(KEYS.containsKey(key))
            return KEYS.get(key) == 3 ? true : false;
        System.out.println("Not a valid Key");
        return false;
    }
    
    public static boolean getKeyDown(String key)
    {
        return Input.getKeyPressed(key) || Input.getKeyHeld(key);
    }
    
    public static int getKeyState(String key)
    {
        if(KEYS.containsKey(key))
            return KEYS.get(key);
        System.out.println("Not a valid Key");
        return -1;
    }
    
    public void update()
    {
        for (Map.Entry<String, Integer> entry : KEYS.entrySet())
        {
            if(entry.getValue() == 3)
                KEYS.put(entry.getKey(), 0);
        }
        
        while(Keyboard.next())
        {
            // A
            if(Keyboard.getEventKey() == Keyboard.KEY_A)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("A", 2);
                    else
                        KEYS.put("A", 1);
                }
                else
                    KEYS.put("A", 3);
            
            // B
            if(Keyboard.getEventKey() == Keyboard.KEY_B)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("B", 2);
                    else
                        KEYS.put("B", 1);
                }
                else
                    KEYS.put("B", 3);
            
            // C
            if(Keyboard.getEventKey() == Keyboard.KEY_C)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("C", 2);
                    else
                        KEYS.put("C", 1);
                }
                else
                    KEYS.put("C", 3);
            
            // D
            if(Keyboard.getEventKey() == Keyboard.KEY_D)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("D", 2);
                    else
                        KEYS.put("D", 1);
                }
                else
                    KEYS.put("D", 3);
            
            // E
            if(Keyboard.getEventKey() == Keyboard.KEY_E)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("E", 2);
                    else
                        KEYS.put("E", 1);
                }
                else
                    KEYS.put("E", 3);
            
            // F
            if(Keyboard.getEventKey() == Keyboard.KEY_F)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("F", 2);
                    else
                        KEYS.put("F", 1);
                }
                else
                    KEYS.put("F", 3);
            
            // G
            if(Keyboard.getEventKey() == Keyboard.KEY_G)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("G", 2);
                    else
                        KEYS.put("G", 1);
                }
                else
                    KEYS.put("G", 3);
            
            // H
            if(Keyboard.getEventKey() == Keyboard.KEY_H)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("H", 2);
                    else
                        KEYS.put("H", 1);
                }
                else
                    KEYS.put("H", 3);
            
            // I
            if(Keyboard.getEventKey() == Keyboard.KEY_I)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("I", 2);
                    else
                        KEYS.put("I", 1);
                }
                else
                    KEYS.put("I", 3);
            
            // J
            if(Keyboard.getEventKey() == Keyboard.KEY_J)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("J", 2);
                    else
                        KEYS.put("J", 1);
                }
                else
                    KEYS.put("J", 3);
            
            // K
            if(Keyboard.getEventKey() == Keyboard.KEY_K)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("K", 2);
                    else
                        KEYS.put("K", 1);
                }
                else
                    KEYS.put("K", 3);
            
            // L
            if(Keyboard.getEventKey() == Keyboard.KEY_L)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("L", 2);
                    else
                        KEYS.put("L", 1);
                }
                else
                    KEYS.put("L", 3);
            
            // M
            if(Keyboard.getEventKey() == Keyboard.KEY_M)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("N", 2);
                    else
                        KEYS.put("N", 1);
                }
                else
                    KEYS.put("N", 3);
            
            // O
            if(Keyboard.getEventKey() == Keyboard.KEY_O)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("O", 2);
                    else
                        KEYS.put("O", 1);
                }
                else
                    KEYS.put("O", 3);
            
            // P
            if(Keyboard.getEventKey() == Keyboard.KEY_P)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("P", 2);
                    else
                        KEYS.put("P", 1);
                }
                else
                    KEYS.put("P", 3);
            
            // Q
            if(Keyboard.getEventKey() == Keyboard.KEY_Q)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("Q", 2);
                    else
                        KEYS.put("Q", 1);
                }
                else
                    KEYS.put("Q", 3);
            
            // R
            if(Keyboard.getEventKey() == Keyboard.KEY_R)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("R", 2);
                    else
                        KEYS.put("R", 1);
                }
                else
                    KEYS.put("R", 3);
            
            // S
            if(Keyboard.getEventKey() == Keyboard.KEY_S)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("S", 2);
                    else
                        KEYS.put("S", 1);
                }
                else
                    KEYS.put("S", 3);
            
            // T
            if(Keyboard.getEventKey() == Keyboard.KEY_T)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("T", 2);
                    else
                        KEYS.put("T", 1);
                }
                else
                    KEYS.put("T", 3);
            
            // U
            if(Keyboard.getEventKey() == Keyboard.KEY_U)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("U", 2);
                    else
                        KEYS.put("U", 1);
                }
                else
                    KEYS.put("U", 3);
            
            // V
            if(Keyboard.getEventKey() == Keyboard.KEY_V)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("V", 2);
                    else
                        KEYS.put("V", 1);
                }
                else
                    KEYS.put("V", 3);
            
            // W
            if(Keyboard.getEventKey() == Keyboard.KEY_W)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("W", 2);
                    else
                        KEYS.put("W", 1);
                }
                else
                    KEYS.put("W", 3);
            
            // X
            if(Keyboard.getEventKey() == Keyboard.KEY_X)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("X", 2);
                    else
                        KEYS.put("X", 1);
                }
                else
                    KEYS.put("X", 3);
            
            // Y
            if(Keyboard.getEventKey() == Keyboard.KEY_Y)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("Y", 2);
                    else
                        KEYS.put("Y", 1);
                }
                else
                    KEYS.put("Y", 3);
            
            // Z
            if(Keyboard.getEventKey() == Keyboard.KEY_Z)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("Z", 2);
                    else
                        KEYS.put("Z", 1);
                }
                else
                    KEYS.put("Z", 3);
            
            // 0
            if(Keyboard.getEventKey() == Keyboard.KEY_0)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("0", 2);
                    else
                        KEYS.put("0", 1);
                }
                else
                    KEYS.put("0", 3);
            
            // 1
            if(Keyboard.getEventKey() == Keyboard.KEY_1)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("1", 2);
                    else
                        KEYS.put("1", 1);
                }
                else
                    KEYS.put("1", 3);
            
            // 2
            if(Keyboard.getEventKey() == Keyboard.KEY_2)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("2", 2);
                    else
                        KEYS.put("2", 1);
                }
                else
                    KEYS.put("2", 3);
            
            // 3
            if(Keyboard.getEventKey() == Keyboard.KEY_3)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("3", 2);
                    else
                        KEYS.put("3", 1);
                }
                else
                    KEYS.put("3", 3);
            
            // 4
            if(Keyboard.getEventKey() == Keyboard.KEY_4)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("4", 2);
                    else
                        KEYS.put("4", 1);
                }
                else
                    KEYS.put("4", 3);
            
            // 5
            if(Keyboard.getEventKey() == Keyboard.KEY_5)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("5", 2);
                    else
                        KEYS.put("5", 1);
                }
                else
                    KEYS.put("5", 3);
            
            // 6
            if(Keyboard.getEventKey() == Keyboard.KEY_6)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("6", 2);
                    else
                        KEYS.put("6", 1);
                }
                else
                    KEYS.put("6", 3);
            
            // 7
            if(Keyboard.getEventKey() == Keyboard.KEY_7)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("7", 2);
                    else
                        KEYS.put("7", 1);
                }
                else
                    KEYS.put("7", 3);
            
            // 8
            if(Keyboard.getEventKey() == Keyboard.KEY_8)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("8", 2);
                    else
                        KEYS.put("8", 1);
                }
                else
                    KEYS.put("8", 3);
            
            // 9
            if(Keyboard.getEventKey() == Keyboard.KEY_9)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("9", 2);
                    else
                        KEYS.put("9", 1);
                }
                else
                    KEYS.put("9", 3);
            
            // Left Shift
            if(Keyboard.getEventKey() == Keyboard.KEY_LSHIFT)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("L_SHIFT", 2);
                    else
                        KEYS.put("L_SHIFT", 1);
                }
                else
                    KEYS.put("L_SHIFT", 3);
            
            // Right Shift
            if(Keyboard.getEventKey() == Keyboard.KEY_RSHIFT)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("R_SHIFT", 2);
                    else
                        KEYS.put("R_SHIFT", 1);
                }
                else
                    KEYS.put("R_SHIFT", 3);
            
            // Space
            if(Keyboard.getEventKey() == Keyboard.KEY_SPACE)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("SPACE", 2);
                    else
                        KEYS.put("SPACE", 1);
                }
                else
                    KEYS.put("SPACE", 3);
            
            // Tab
            if(Keyboard.getEventKey() == Keyboard.KEY_TAB)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("TAB", 2);
                    else
                        KEYS.put("TAB", 1);
                }
                else
                    KEYS.put("TAB", 3);
            
            // Escape
            if(Keyboard.getEventKey() == Keyboard.KEY_ESCAPE)
                if(Keyboard.getEventKeyState())
                {
                    if(Keyboard.isRepeatEvent())
                        KEYS.put("ESC", 2);
                    else
                        KEYS.put("ESC", 1);
                }
                else
                    KEYS.put("ESC", 3);
        }
    }
}
