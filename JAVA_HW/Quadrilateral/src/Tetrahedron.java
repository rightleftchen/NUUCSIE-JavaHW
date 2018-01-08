//Copyright @ U0324017_rightleft. All rights reserved
public class Tetrahedron extends ThreeDimensionalShape
{
    public Tetrahedron(double len){
        super(len);
        super.setHeight(Math.sqrt(2.0/3.0)*len);
    }

    @Override
    public double getArea(){
        return Math.sqrt(3.0)*super.getLength()*super.getLength();
    }

    @Override
    public double getVolume(){
        return 1.0/3.0*getArea()*super.getHeight();
    }

    @Override
    public String toString(){
        return String.format("Regular Tetrahedron\nEdge: %.2f\n",
            super.getLength());
    }
}
