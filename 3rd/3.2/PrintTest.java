class PrintTest{
    public static void main(String[] args){
        //画面出力を行う決まり文句
        System.out.println("println: Hello World");
        System.out.println("改行される");

        System.out.print("print: Hello World");
        System.out.print("改行されない");

        System.out.println();

        //printfの使い方１
        int i =2;
        int j =4;
        System.out.printf("printf1:%3d",i*j);

        System.out.println();
        
        //printfの使い方２
        int x =2;
        System.out.printf("printf2:x = %3d \n",i*j);
        //printfの使い方３
        double y =3.21321412;
        System.out.printf("x=%3d y=%6.2f \n",x,y);
    }
}