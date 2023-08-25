class HorzLine extends Shape {
    private int length;
    HorzLine(int length){
        this.length = length; //長さ
    }
    void draw(){
        for(int i = 1; i <= length; i++)
            System.out.print('-');
            System.out.println();
    }
    //toStringは省略
    int getLength(){
        return length;
    }

    void setLength(int length){
        this.length = length;
    }
}

class VertLine extends Shape {
    private int length; //長さ
    VertLine(int length){
        this.length = length;
    }
    void draw(){
        for(int i = 1; i <= length; i++)
            System.out.println('|');
    }
    //toStringは省略
    int getLength(){
        return length;
    }

    void setLength(int length){
        this.length = length;
    }
}

public class PreLine {
    
}

