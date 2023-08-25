public class ExtendedCar extends Car {
    private double totalRun = 0;
    ExtendedCar(String name,int width, int height, int length, double fuel, Day purchaseDay){
        super(name,width,height,length,fuel,purchaseDay);
    }

    public double getTotalRun(){
        return totalRun;
    }
    
    @Override public boolean move(double dx,double dy){
        double dist = Math.sqrt(dx * dx + dy * dy);
        double f = getFuel();
        if(dist > f)
            return false;
        else{
            setFuel(f - dist);
            setX(getX() + dx);
            setX(getY() + dy);
            totalRun += dist;
            return true;
        }
    }
}
