public class Hurman {
    private String name;    //名前
    private double height;  //身長
    private double weight;  //体重
    private int age;        //年齢

    Hurman(String name, double height, double weight,int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }


    String getName(){
        return name;
    }

    double getHeight(){
        return height;
    }

    double getWeight(){
        return weight;
    }

    int getAge(){
        return age;
    }

    void printInfo(){
        System.out.printf("名前： %s \n 身長： %f \n 体重： %f \n 年齢: %d \n",name,height,weight,age);
    }

}
