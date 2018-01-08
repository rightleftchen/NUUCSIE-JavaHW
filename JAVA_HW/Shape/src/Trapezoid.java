//trapezoid是梯形

public class Trapezoid extends Quadrilateral 
{
	Trapezoid(double...inputXY) //多載建構子
	{
		super(inputXY); //將座標傳給superclass 共計8個參數
	}
	
	@Override
	public double getArea() //覆蓋superclass內的getArea()
	{
		return (super.getUpLength()+super.getDownLength())*super.getHightNum()/2;
	}
	
	@Override
	public String toString() //覆蓋superclass內的toString()
	{
		return String.format("梯形座標分別為 %s 上方邊長為 %.2f 下方邊長為 %.2f 高度為 %.2f 面積為 %.2f", super.showAll(), super.getUpLength(), super.getDownLength(), super.getHightNum(), this.getArea());
	}
}
