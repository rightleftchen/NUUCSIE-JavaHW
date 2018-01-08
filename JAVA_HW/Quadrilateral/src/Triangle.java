//Copyright @ U0324017_rightleft. All rights reserved
public class Triangle extends TwoDimensionalShape
{
    public Triangle(double len, double wid){
        super(len, wid);
    }

    @Override
    public double getArea(){
        return 0.5*super.getLength()*super.getWidth();
    }

    @Override
    public String toString(){
        return String.format("Triangle\nHeight: %.2f\nBase: %.2f\n",
            super.getLength(), super.getWidth());
    }
}
