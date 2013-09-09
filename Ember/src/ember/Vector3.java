package ember;

public class Vector3
{
    // Attributes
    private float X;
    private float Y;
    private float Z;
    
    public Vector3()
    {
        X = 0.0f;
        Y = 0.0f;
        Z = 0.0f;
    }
    
    public Vector3(float x, float y, float z)
    {
        X = x;
        Y = y;
        Z = z;
    }
    
    public Vector3(int x, int y, int z)
    {
        X = (float)x;
        Y = (float)y;
        Z = (float)z;
    }
    
    public Vector3(Vector3 vec)
    {
        X = vec.X();
        Y = vec.Y();
        Z = vec.Z();
    }
    
    // Getters
    public float X() { return X; }
    public float Y() { return Y; }
    public float Z() { return Z; }
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
    
    // Static
    public static Vector3 Add(Vector3 left, Vector3 right)
    {
        return new Vector3(left.X() + right.X(),
                           left.Y() + right.Y(),
                           left.Z() + right.Z());
    }
    
    public static Vector3 Sub(Vector3 left, Vector3 right)
    {
        return new Vector3(left.X() - right.X(),
                           left.Y() - right.Y(),
                           left.Z() - right.Z());
    }
    
    public static Vector3 Mult(Vector3 left, Vector3 right)
    {
        return new Vector3(left.X() * right.X(),
                           left.Y() * right.Y(),
                           left.Z() * right.Z());
    }
    
    public static Vector3 Mult(Vector3 vec, float value)
    {
        float x = vec.X() * value;
        float y = vec.Y() * value;
        float z = vec.Z() * value;
        return new Vector3(x, y, z);
    }
    
    public static Vector3 Mult(Vector3 vec, int value)
    {
        float x = (float)(vec.X() * value);
        float y = (float)(vec.Y() * value);
        float z = (float)(vec.Z() * value);
        return new Vector3(x, y, z);
    }
    
    public static Vector3 Mult(Vector3 vec, double value)
    {
        float x = (float)(vec.X() * value);
        float y = (float)(vec.Y() * value);
        float z = (float)(vec.Z() * value);
        return new Vector3(x, y, z);
    }
    
    public static Vector3 Div(Vector3 left, Vector3 right)
    {
        return new Vector3(left.X() / right.X(),
                           left.Y() / right.Y(),
                           left.Z() / right.Z());
    }
    
    public static Vector3 Div(Vector3 vec, float value)
    {
        float inverseValue = 1.0f / value;
        float x = (float)(vec.X() * inverseValue);
        float y = (float)(vec.Y() * inverseValue);
        float z = (float)(vec.Z() * inverseValue);
        return new Vector3(x, y, z);
    }
    
    public static Vector3 Div(Vector3 vec, int value)
    {
        float inverseValue = (float)(1.0f / value);
        float x = (float)(vec.X() * inverseValue);
        float y = (float)(vec.Y() * inverseValue);
        float z = (float)(vec.Z() * inverseValue);
        return new Vector3(x, y, z);
    }
    
    public static Vector3 Div(Vector3 vec, double value)
    {
        float inverseValue = (float)(1.0f / value);
        float x = (float)(vec.X() * inverseValue);
        float y = (float)(vec.Y() * inverseValue);
        float z = (float)(vec.Z() * inverseValue);
        return new Vector3(x, y, z);
    }
    
    public static float Dot(Vector3 vec1, Vector3 vec2)
    {
        return (vec1.X() * vec2.X()) +
               (vec1.Y() * vec2.Y()) +
               (vec1.Z() * vec2.Z());
    }
    
    public static Vector3 Cross(Vector3 vec1, Vector3 vec2)
    {
        return new Vector3((vec1.Y() * vec2.Z()) - (vec1.Z() * vec2.Y()),
                           (vec1.Z() * vec2.X()) - (vec1.X() * vec2.Z()),
                           (vec1.X() * vec2.Y()) - (vec1.Y() * vec2.X()));
    }
    
    public static double Magnitude(Vector3 vec)
    {
        return Math.sqrt((vec.X() * vec.X()) + (vec.Y() * vec.Y()) + (vec.Z() * vec.Z()));
    }
    
    public static Vector3 Normalize(Vector3 vec)
    {
        // Multiply by the inverse length to save on divides
        double inverseLength = 1.0 / Vector3.Magnitude(vec);
        vec.X(vec.X() * inverseLength);
        vec.Y(vec.Y() * inverseLength);
        vec.Z(vec.Z() * inverseLength);
        
        return vec;
    }
    
    public static double angle(Vector3 vec1, Vector3 vec2)
    {
        float dot = Vector3.Dot(Vector3.Normalize(vec1), Vector3.Normalize(vec2));
        return Math.acos(dot);
    }
    
    // Utility
    public Vector3 add(Vector3 vec)
    {
        X += vec.X();
        Y += vec.Y();
        Z += vec.Z();
        return this;
    }
    
    public Vector3 sub(Vector3 vec)
    {
        X -= vec.X();
        Y -= vec.Y();
        Z -= vec.Z();
        return this;
    }
    
    public Vector3 mult(Vector3 vec)
    {
        X *= vec.X();
        Y *= vec.Y();
        Z *= vec.Z();
        return this;
    }
    
    public Vector3 mult(float value)
    {
        X *= value;
        Y *= value;
        Z *= value;
        return this;
    }
    
    public Vector3 mult(int value)
    {
        X *= (float)value;
        Y *= (float)value;
        Z *= (float)value;
        return this;
    }
    
    public Vector3 mult(double value)
    {
        X *= (float)value;
        Y *= (float)value;
        Z *= (float)value;
        return this;
    }
    
    public Vector3 div(Vector3 vec)
    {
        X /= vec.X();
        Y /= vec.Y();
        Z /= vec.Z();
        return this;
    }
    
    public Vector3 div(float value)
    {
        float inverseValue = 1.0f / value;
        X *= inverseValue;
        Y *= inverseValue;
        Z *= inverseValue;
        return this;
    }
    
    public Vector3 div(int value)
    {
        float inverseValue = (float)(1.0f / value);
        X *= inverseValue;
        Y *= inverseValue;
        Z *= inverseValue;
        return this;
    }
    
    public Vector3 div(double value)
    {
        float inverseValue = (float)(1.0f / value);
        X *= inverseValue;
        Y *= inverseValue;
        Z *= inverseValue;
        return this;
    }
    
    public float dot(Vector3 vec)
    {
        return (X * vec.X()) + (Y * vec.Y()) + (Z * vec.Z());
    }
    
    public Vector3 cross(Vector3 vec)
    {
        return new Vector3((Y * vec.Z()) - (Z * vec.Y()),
                           (Z * vec.X()) - (X * vec.Z()),
                           (X * vec.Y()) - (Y * vec.X()));
    }
    
    public double magnitude()
    {
        return Math.sqrt((X * X) + (Y * Y) + (Z * Z));
    }
    
    public void normalize()
    {
        // Multiply by the inverse length to save on divides
        double inverseLength = 1.0f / Vector3.Magnitude(this);
        X *= inverseLength;
        Y *= inverseLength;
        Z *= inverseLength;
    }
    
    public double angle(Vector3 vec)
    {
        float dot = this.dot(Vector3.Normalize(vec));
        return Math.acos(dot);
    }
    
    public String toString()
    {
        return "X: " + X + " Y: " + Y + " Z: " + Z;
    }
}