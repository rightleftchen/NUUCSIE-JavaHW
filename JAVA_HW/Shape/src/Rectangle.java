
//�����

public class Rectangle extends Quadrilateral
{
	Rectangle(double...inputXY) //�h���غc�l
	{
		super(inputXY); //�N�y�аѼƶǵ�superclass �@�p8�ӰѼ�
	}
	
	@Override
	public double getArea() //�л\superclass����getArea()
	{
		return (super.getDownLength())*super.getHightNum();
	}
	
	@Override
	public String toString() //�л\superclass����toString()
	{
		return String.format("����ήy�Ф��O�� %s ����� %.2f ���׬� %.2f ���n�� %.2f", super.showAll(), super.getDownLength(), super.getHightNum(), this.getArea());
	}
}