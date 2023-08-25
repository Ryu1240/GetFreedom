class RightBottomIsoscelesRightTriangle extends IsoscelesRightTriangle {
    public RightBottomIsoscelesRightTriangle(int length){
            super(length);
        }

    public void draw(){
        int l = getLength(); 
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l ;j++){
                if(j < l - i){
                    System.out.print(" ");
                }else{
                    System.out.print("◼︎");
                }
            }
                
            System.out.println();
        }
    }

    public String toString(){
        return "RightUpperIsoscelesRightTriangle(length:" + getLength() + ")";
    }
}
