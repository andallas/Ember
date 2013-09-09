package ember;

public class Vector2
{
    // Attributes
    private float X;
    private float Y;
    
    public Vector2()
    {
        X = 0.0f;
        Y = 0.0f;
    }
    
    public Vector2(float x, float y)
    {
        X = x;
        Y = y;
    }
    
    public Vector2(int x, int y)
    {
        X = (float)x;
        Y = (float)y;
    }
    
    public Vector2(Vector2 vec)
    {
        X = vec.X();
        Y = vec.Y();
    }
    
    // Getters
    public float X() { return X; }
    public float Y() { return Y; }
    // Setters
    public void X(float value)   { X = value; }
    public void X(int value)     { X = (float)value; }
    public void X(double value)  { X = (float)value; }
    public void Y(float value)   { Y = value; }
    public void Y(int value)     { Y = (float)value; }
    public void Y(double value)  { Y = (float)value; }
    
    // Static
    public static Vector2 Add(Vector2 left, Vector2 right)
    {
        return new Vector2(left.X() + right.X(),
                           left.Y() + right.Y());
    }
    
    public static Vector2 Sub(Vector2 left, Vector2 right)
    {
        return new Vector2(left.X() - right.X(),
                           left.Y() - right.Y());
    }
    
    public static Vector2 Mult(Vector2 left, Vector2 right)
    {
        return new Vector2(left.X() * right.X(),
                           left.Y() * right.Y());
    }
    
    public static Vector2 Mult(Vector2 vec, float value)
    {
        float x = vec.X() * value;
        float y = vec.Y() * value;
        return new Vector2(x, y);
    }
    
    public static Vector2 Mult(Vector2 vec, int value)
    {
        float x = (float)(vec.X() * value);
        float y = (float)(vec.Y() * value);
        return new Vector2(x, y);
    }
    
    public static Vector2 Mult(Vector2 vec, double value)
    {
        float x = (float)(vec.X() * value);
        float y = (float)(vec.Y() * value);
        return new Vector2(x, y);
    }
    
    public static Vector2 Div(Vector2 left, Vector2 right)
    {
        return new Vector2(left.X() / right.X(),
                           left.Y() / right.Y());
    }
    
    public static Vector2 Div(Vector2 vec, float value)
    {
        float inverseValue = 1.0f / value;
        float x = (float)(vec.X() * inverseValue);
        float y = (float)(vec.Y() * inverseValue);
        return new Vector2(x, y);
    }
    
    public static Vector2 Div(Vector2 vec, int value)
    {
        float inverseValue = (float)(1.0f / value);
        float x = (float)(vec.X() * inverseValue);
        float y = (float)(vec.Y() * inverseValue);
        return new Vector2(x, y);
    }
    
    public static Vector2 Div(Vector2 vec, double value)
    {
        float inverseValue = (float)(1.0f / value);
        float x = (float)(vec.X() * inverseValue);
        float y = (float)(vec.Y() * inverseValue);
        return new Vector2(x, y);
    }
    
    public static float Dot(Vector2 vec1, Vector2 vec2)
    {
        return (vec1.X() * vec2.X()) +
               (vec1.Y() * vec2.Y());
    }
    
    public static float Cross(Vector2 vec1, Vector2 vec2)
    {
        return (vec1.X() * vec2.Y()) - (vec1.Y() * vec2.X());
    }
    
    public static double Magnitude(Vector2 vec)
    {
        return Math.sqrt((vec.X() * vec.X()) + (vec.Y() * vec.Y()));
    }
    
    public static Vector2 Normalize(Vector2 vec)
    {
        // Multiply by the inverse length to save on divides
        double inverseLength = 1.0 / Vector2.Magnitude(vec);
        vec.X(vec.X() * inverseLength);
        vec.Y(vec.Y() * inverseLength);
        
        return vec;
    }
    
    public static double angle(Vector2 vec1, Vector2 vec2)
    {
        float dot = Vector2.Dot(Vector2.Normalize(vec1), Vector2.Normalize(vec2));
        return Math.acos(dot);
    }
    
    // Utility
    public Vector2 add(Vector2 vec)
    {
        X += vec.X();
        Y += vec.Y();
        return this;
    }
    
    public Vector2 sub(Vector2 vec)
    {
        X -= vec.X();
        Y -= vec.Y();
        return this;
    }
    
    public Vector2 mult(Vector2 vec)
    {
        X *= vec.X();
        Y *= vec.Y();
        return this;
    }
    
    public Vector2 mult(float value)
    {
        X *= value;
        Y *= value;
        return this;
    }
    
    public Vector2 mult(int value)
    {
        X *= (float)value;
        Y *= (float)value;
        return this;
    }
    
    public Vector2 mult(double value)
    {
        X *= (float)value;
        Y *= (float)value;
        return this;
    }
    
    public Vector2 div(Vector2 vec)
    {
        X /= vec.X();
        Y /= vec.Y();
        return this;
    }
    
    public Vector2 div(float value)
    {
        float inverseValue = 1.0f / value;
        X *= inverseValue;
        Y *= inverseValue;
        return this;
    }
    
    public Vector2 div(int value)
    {
        float inverseValue = (float)(1.0f / value);
        X *= inverseValue;
        Y *= inverseValue;
        return this;
    }
    
    public Vector2 div(double value)
    {
        float inverseValue = (float)(1.0f / value);
        X *= inverseValue;
        Y *= inverseValue;
        return this;
    }
    
    public float dot(Vector2 vec)
    {
        return (X * vec.X()) + (Y * vec.Y());
    }
    
    public float cross(Vector2 vec)
    {
        return (X * vec.Y()) - (Y * vec.X());
    }
    
    public double magnitude()
    {
        return Math.sqrt((X * X) + (Y * Y));
    }
    
    public void normalize()
    {
        // Multiply by the inverse length to save on divides
        double inverseLength = 1.0f / Vector2.Magnitude(this);
        X *= inverseLength;
        Y *= inverseLength;
    }
    
    public double angle(Vector2 vec)
    {
        float dot = this.dot(Vector2.Normalize(vec));
        return Math.acos(dot);
    }
    
    public String toString()
    {
        return "X: " + X + " Y: " + Y;
    }
}