class LeftBottomIsoscelesRightTriangle extends IsoscelesRightTriangle {
    public LeftBottomIsoscelesRightTriangle(int length){
            super(length);
        }

    public void draw(){
        for(int i = 0; i < getLength(); i++){
            for(int j = 0; j < i ;j++)
                System.out.print("◼︎");
            System.out.println();
        }
    }

    public String toString(){
        return "LeftUpperIsoscelesRightTriangle(length:" + getLength() + ")";
    }
}
