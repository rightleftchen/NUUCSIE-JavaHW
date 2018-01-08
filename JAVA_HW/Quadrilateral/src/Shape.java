//Copyright @ U0324017_rightleft. All rights reserved
public abstract class Shape {
    private double length=0;
    private double width=0;

    public Shape(double len){
        setLength(len);
    }
    public Shape(double len, double wid){
        setLength(len);
        setWidth(wid);
    }

    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return width;
    }

    public abstract double getArea();
}
