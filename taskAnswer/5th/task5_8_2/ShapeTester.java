public class ShapeTester {
    public static void main(String[] args){
        Shape[]p = new Shape[4];

        p[0] = new LeftUpperIsoscelesRightTriangle(5);
        p[1] = new LeftBottomIsoscelesRightTriangle(5);
        p[2] = new RightUpperIsoscelesRightTriangle(5);
        p[3] = new RightBottomIsoscelesRightTriangle(5);
        for(Shape s : p){
            s.print();
            System.out.println();
        }
    }
}
