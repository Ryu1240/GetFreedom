abstract class Shape {
    public abstract String toString();
    abstract void draw();

    void print(){
        System.out.print(toString());
        draw();
    }
}

class Point extends Shape{
    Point(){ }
    public String toString(){
        return "Point";
    }
    void draw(){
        System.out.println('+');
    }

    void print(){
        System.out.print(toString());
        draw();
    }

}
//長方形
class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "Rectangle(width:" + width + 
        ", height:"+ height +")";
    }

    void draw(){
        for(int i = 1; i <= height ;i++){
            for (int j = 1; j <= width; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    void print(){
        System.out.print(toString());
        draw();
    }
}
