//Copyright @ U0324017_rightleft. All rights reserved
public abstract class TwoDimensionalShape extends Shape
{
    public TwoDimensionalShape(double len){
        super(len);
    }

    public TwoDimensionalShape(double len, double wid){
        super(len, wid);
    }

    public abstract double getArea();
}
