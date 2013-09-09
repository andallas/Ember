package ember;

public class Vector4
{
    // Attributes
    private float X;
    private float Y;
    private float Z;
    private float W;
    
    public Vector4()
    {
        X = 0.0f;
        Y = 0.0f;
        Z = 0.0f;
        W = 0.0f;
    }
    
    public Vector4(float x, float y, float z, float w)
    {
        X = x;
        Y = y;
        Z = z;
        W = w;
    }
    
    public Vector4(int x, int y, int z, int w)
    {
        X = (float)x;
        Y = (float)y;
        Z = (float)z;
        W = (float)w;
    }
    
    public Vector4(Vector4 vec)
    {
        X = vec.X();
        Y = vec.Y();
        Z = vec.Z();
        W = vec.W();
    }
    
    // Getters
    public float X() { return X; }
    public float Y() { return Y; }
    public float Z() { return Z; }
    public float W() { return W; }
    // Setters
    public void X(float value)   { X = value; }
    public void X(int value)     { X = (float)value; }
    public void X(double value)  { X = (float)value; }
    public void Y(float value)   { Y = value; }
    public void Y(int value)     { Y = (float)value; }
    public void Y(double value)  { Y = (float)value; }
    public void Z(float value)   { Z = value; }
    public void Z(int value)     { Z = (float)value; }
    public void Z(double value)  { Z = (float)value; }
    public void W(float value)   { W = value; }
    public void W(int value)     { W = (float)value; }
    public void W(double value)  { W = (float)value; }
    
    // Static
    public static Vector4 Add(Vector4 left, Vector4 right)
    {
        return new Vector4(left.X() + right.X(),
                           left.Y() + right.Y(),
                           left.Z() + right.Z(),
                           left.W() + right.W());
    }
    
    public static Vector4 Sub(Vector4 left, Vector4 right)
    {
        return new Vector4(left.X() - right.X(),
                           left.Y() - right.Y(),
                           left.Z() - right.Z(),
                           left.W() - right.W());
    }
    
    public static Vector4 Mult(Vector4 left, Vector4 right)
    {
        return new Vector4(left.X() * right.X(),
                           left.Y() * right.Y(),
                           left.Z() * right.Z(),
                           left.W() * right.W());
    }
    
    public static Vector4 Mult(Vector4 vec, float value)
    {
        float x = vec.X() * value;
        float y = vec.Y() * value;
        float z = vec.Z() * value;
        float w = vec.W() * value;
        return new Vector4(x, y, z, w);
    }
    
    public static Vector4 Mult(Vector4 vec, int value)
    {
        float x = (float)(vec.X() * value);
        float y = (float)(vec.Y() * value);
        float z = (float)(vec.Z() * value);
        float w = (float)(vec.W() * value);
        return new Vector4(x, y, z, w);
    }
    
    public static Vector4 Mult(Vector4 vec, double value)
    {
        float x = (float)(vec.X() * value);
        float y = (float)(vec.Y() * value);
        float z = (float)(vec.Z() * value);
        float w = (float)(vec.W() * value);
        return new Vector4(x, y, z, w);
    }
    
    public static Vector4 Div(Vector4 left, Vector4 right)
    {
        return new Vector4(left.X() / right.X(),
                           left.Y() / right.Y(),
                           left.Z() / right.Z(),
                           left.W() / right.W());
    }
    
    public static Vector4 Div(Vector4 vec, float value)
    {
        float inverseValue = 1.0f / value;
        float x = (float)(vec.X() * inverseValue);
        float y = (float)(vec.Y() * inverseValue);
        float z = (float)(vec.Z() * inverseValue);
        float w = (float)(vec.W() * inverseValue);
        return new Vector4(x, y, z, w);
    }
    
    public static Vector4 Div(Vector4 vec, int value)
    {
        float inverseValue = (float)(1.0f / value);
        float x = (float)(vec.X() * inverseValue);
        float y = (float)(vec.Y() * inverseValue);
        float z = (float)(vec.Z() * inverseValue);
        float w = (float)(vec.W() * inverseValue);
        return new Vector4(x, y, z, w);
    }
    
    public static Vector4 Div(Vector4 vec, double value)
    {
        float inverseValue = (float)(1.0f / value);
        float x = (float)(vec.X() * inverseValue);
        float y = (float)(vec.Y() * inverseValue);
        float z = (float)(vec.Z() * inverseValue);
        float w = (float)(vec.W() * inverseValue);
        return new Vector4(x, y, z, w);
    }
    
    public static float Dot(Vector4 vec1, Vector4 vec2)
    {
        return (vec1.X() * vec2.X()) +
               (vec1.Y() * vec2.Y()) +
               (vec1.Z() * vec2.Z()) +
               (vec1.W() * vec2.W());
    }
    
    public static double Magnitude(Vector4 vec)
    {
        return Math.sqrt((vec.X() * vec.X()) + (vec.Y() * vec.Y()) + (vec.Z() * vec.Z()) + (vec.W() * vec.W()));
    }
    
    public static Vector4 Normalize(Vector4 vec)
    {
        // Multiply by the inverse length to save on divides
        double inverseLength = 1.0 / Vector4.Magnitude(vec);
        vec.X(vec.X() * inverseLength);
        vec.Y(vec.Y() * inverseLength);
        vec.Z(vec.Z() * inverseLength);
        vec.W(vec.W() * inverseLength);
        
        return vec;
    }
    
    public static double angle(Vector4 vec1, Vector4 vec2)
    {
        float dot = Vector4.Dot(Vector4.Normalize(vec1), Vector4.Normalize(vec2));
        return Math.acos(dot);
    }
    
    // Utility
    public Vector4 add(Vector4 vec)
    {
        X += vec.X();
        Y += vec.Y();
        Z += vec.Z();
        W += vec.W();
        return this;
    }
    
    public Vector4 sub(Vector4 vec)
    {
        X -= vec.X();
        Y -= vec.Y();
        Z -= vec.Z();
        W -= vec.W();
        return this;
    }
    
    public Vector4 mult(Vector4 vec)
    {
        X *= vec.X();
        Y *= vec.Y();
        Z *= vec.Z();
        W *= vec.W();
        return this;
    }
    
    public Vector4 mult(float value)
    {
        X *= value;
        Y *= value;
        Z *= value;
        W *= value;
        return this;
    }
    
    public Vector4 mult(int value)
    {
        X *= (float)value;
        Y *= (float)value;
        Z *= (float)value;
        W *= (float)value;
        return this;
    }
    
    public Vector4 mult(double value)
    {
        X *= (float)value;
        Y *= (float)value;
        Z *= (float)value;
        W *= (float)value;
        return this;
    }
    
    public Vector4 div(Vector4 vec)
    {
        X /= vec.X();
        Y /= vec.Y();
        Z /= vec.Z();
        W /= vec.W();
        return this;
    }
    
    public Vector4 div(float value)
    {
        float inverseValue = 1.0f / value;
        X *= inverseValue;
        Y *= inverseValue;
        Z *= inverseValue;
        W *= inverseValue;
        return this;
    }
    
    public Vector4 div(int value)
    {
        float inverseValue = (float)(1.0f / value);
        X *= inverseValue;
        Y *= inverseValue;
        Z *= inverseValue;
        W *= inverseValue;
        return this;
    }
    
    public Vector4 div(double value)
    {
        float inverseValue = (float)(1.0f / value);
        X *= inverseValue;
        Y *= inverseValue;
        Z *= inverseValue;
        W *= inverseValue;
        return this;
    }
    
    public float dot(Vector4 vec)
    {
        return (X * vec.X()) + (Y * vec.Y()) + (Z * vec.Z()) + (W * vec.W());
    }
    
    public double magnitude()
    {
        return Math.sqrt((X * X) + (Y * Y) + (Z * Z) + (W * W));
    }
    
    public void normalize()
    {
        // Multiply by the inverse length to save on divides
        double inverseLength = 1.0f / Vector4.Magnitude(this);
        X *= inverseLength;
        Y *= inverseLength;
        Z *= inverseLength;
        W *= inverseLength;
    }
    
    public double angle(Vector4 vec)
    {
        float dot = this.dot(Vector4.Normalize(vec));
        return Math.acos(dot);
    }
    
    public String toString()
    {
        return "X: " + X + " Y: " + Y + " Z: " + Z + " W: " + W;
    }
}