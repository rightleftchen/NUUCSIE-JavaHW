
public abstract class ThreeDimensionalShape extends Shape
{
    private double height=0;
    
    public ThreeDimensionalShape(double len){
        super(len);
    }
    
    public ThreeDimensionalShape(double len, double wid){
        super(len,wid);
    }

    public ThreeDimensionalShape(double len, double wid, double hgt){
        super(len,wid);
        setHeight(hgt);
    }

    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    
    public abstract double getArea();
    
    public abstract double getVolume();
}
