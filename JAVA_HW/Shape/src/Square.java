//正方形

public class Square extends Quadrilateral
{
	Square(double...inputXY) //多載建構子
	{
		super(inputXY); //將座標點 共計8個參數 傳給superclass
	}
	
	@Override
	public double getArea() //覆蓋superclass 內的getArea()
	{
		return super.getDownLength()*super.getHightNum();
	}
	
	@Override
	public String toString() //覆蓋superclass 內的toString()
	{
		return String.format("正方形座標分別為 %s 邊長為 %.2f 高度為 %.2f 面積為 %.2f", super.showAll(), super.getDownLength(), super.getHightNum(), this.getArea());
	}
}
