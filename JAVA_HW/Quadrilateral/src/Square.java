//Copyright @ U0324017_rightleft. All rights reserved
public class Square extends TwoDimensionalShape
{
    public Square(double len){
        super(len);
    }

    @Override
    public double getArea(){
        return super.getLength() * super.getLength();
    }

    @Override
    public String toString(){
        return String.format("Square\nSide: %.2f\n",
            super.getLength());
    }
}
