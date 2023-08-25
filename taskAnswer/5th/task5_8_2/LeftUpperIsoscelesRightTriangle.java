class LeftUpperIsoscelesRightTriangle extends IsoscelesRightTriangle {
    public LeftUpperIsoscelesRightTriangle(int length){
            super(length);
        }

    public void draw(){
        for(int i = getLength(); i > 0; i--){
            for(int j = 0; j < i;j++)
                System.out.print("◼︎");
            System.out.println();
        }
    }

    public String toString(){
        return "LeftUpperIsoscelesRightTriangle(length:" + getLength() + ")";
    }
}
