public class TestObject {
    // Primitive Data Types
    private int integerVariable;
    private double doubleVariable;
    private boolean booleanVariable;
    private char charVariable;

    // Reference Data Types
    private String stringVariable;
    private int[] integerArray;
    private Object objectVariable;

    // Other common data types
    private long longVariable;
    private float floatVariable;
    private byte byteVariable;
    private short shortVariable;

    // Constructors
    public TestObject() {
        // Initialize default values for the variables
        integerVariable = 0;
        doubleVariable = 0.0;
        booleanVariable = false;
        charVariable = '\0';
        stringVariable = null;
        integerArray = null;
        objectVariable = null;
        longVariable = 0L;
        floatVariable = 0.0f;
        byteVariable = 0;
        shortVariable = 0;
    }

    public int getIntegerVariable() {
        return integerVariable;
    }

    public void setIntegerVariable(int integerVariable) {
        this.integerVariable = integerVariable;
    }

    public double getDoubleVariable() {
        return doubleVariable;
    }

    public void setDoubleVariable(double doubleVariable) {
        this.doubleVariable = doubleVariable;
    }

    public boolean isBooleanVariable() {
        return booleanVariable;
    }

    public void setBooleanVariable(boolean booleanVariable) {
        this.booleanVariable = booleanVariable;
    }

    public char getCharVariable() {
        return charVariable;
    }

    public void setCharVariable(char charVariable) {
        this.charVariable = charVariable;
    }

    public String getStringVariable() {
        return stringVariable;
    }

    public void setStringVariable(String stringVariable) {
        this.stringVariable = stringVariable;
    }

    public int[] getIntegerArray() {
        return integerArray;
    }

    public void setIntegerArray(int[] integerArray) {
        this.integerArray = integerArray;
    }

    public Object getObjectVariable() {
        return objectVariable;
    }

    public void setObjectVariable(Object objectVariable) {
        this.objectVariable = objectVariable;
    }

    public long getLongVariable() {
        return longVariable;
    }

    public void setLongVariable(long longVariable) {
        this.longVariable = longVariable;
    }

    public float getFloatVariable() {
        return floatVariable;
    }

    public void setFloatVariable(float floatVariable) {
        this.floatVariable = floatVariable;
    }

    public byte getByteVariable() {
        return byteVariable;
    }

    public void setByteVariable(byte byteVariable) {
        this.byteVariable = byteVariable;
    }

    public short getShortVariable() {
        return shortVariable;
    }

    public void setShortVariable(short shortVariable) {
        this.shortVariable = shortVariable;
    }
}
