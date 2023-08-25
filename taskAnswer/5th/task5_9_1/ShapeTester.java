import java.util.Scanner;
public class ShapeTester {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("図形は何個:");int n = stdIn.nextInt();
        Shape[] shape = new Shape[n];
        int l;
        int w;
        int h;
        int kind;

        for(int i = 0; i < shape.length; i ++){
             System.out.print("図形の種類（１… 点/2 … 水平直線/3 … 垂直直線/4… 長方形:"); kind = stdIn.nextInt();
             switch(kind){
                case 1: 
                    shape[i] = new Point();
                    break;
                case 2: 
                    System.out.print("長さ:"); l = stdIn.nextInt();
                    shape[i] = new HorzLine(l);
                    break;
                case 3: 
                    System.out.print("長さ:"); l = stdIn.nextInt();
                    shape[i] = new VertLine(l);
                    break;
                case 4:
                    System.out.print("幅:");  w = stdIn.nextInt();
                    System.out.print("高さ:"); h = stdIn.nextInt();
                    shape[i] = new Rectangle(w, h);
                    break;
                case 5:
                    System.out.print("幅:");  w = stdIn.nextInt();
                    System.out.print("高さ:"); h = stdIn.nextInt();
                    shape[i] = new Parallelogram(w, h);
             }
        }
        for (Shape s : shape){
            s.print();
            if(s instanceof Rectangle)
                System.out.println("面積:"+ ((Rectangle)s).getArea());
            if(s instanceof Parallelogram)
                System.out.println("面積:"+ ((Parallelogram)s).getArea());
            System.out.println();

        }

    }
}
