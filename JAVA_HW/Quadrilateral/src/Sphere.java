//Copyright @ U0324017_rightleft. All rights reserved
public class Sphere extends ThreeDimensionalShape
{
    private final double PI=3.14159;

    public Sphere(double len){
        super(len);
    }

    @Override
    public double getArea(){
        return 4*PI*super.getLength()*super.getLength();
    }

    @Override
    public double getVolume(){
        return 4.0/3.0*PI*super.getLength()*super.getLength()*super.getLength();
    }

    @Override
    public String toString(){
        return String.format("Sphere\nRadius: %.2f\n", super.getLength());
    }
}
