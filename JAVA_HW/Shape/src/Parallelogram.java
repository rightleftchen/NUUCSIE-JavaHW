//平行四邊形

public class Parallelogram extends Quadrilateral
{
	Parallelogram(double...inputXY) //多載建構子
	{
		super(inputXY); //將座標傳送給superclass 共計8個參數
	}
	
	@Override
	public double getArea() //覆蓋superclass內的getArea()
	{
		return (super.getDownLength())*super.getHightNum();
	}
	
	@Override
	public String toString() //覆蓋superclass內的toString()
	{
		return String.format("平行四邊形座標分別為 %s 邊長為 %.2f 高度為 %.2f 面積為 %.2f", super.showAll(), super.getDownLength(), super.getHightNum(), this.getArea());
	}
}
