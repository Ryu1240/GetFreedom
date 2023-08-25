abstract class IsoscelesRightTriangle extends Shape{
    private int length;

    public IsoscelesRightTriangle(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    };

    public void setwidth(int length){
        this.length = length;
    }

    public String toString(){
        return "IsoscelesRightTriangle(length:" + length + ")";
    }
}
