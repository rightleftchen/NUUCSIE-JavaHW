//�����

public class Square extends Quadrilateral
{
	Square(double...inputXY) //�h���غc�l
	{
		super(inputXY); //�N�y���I �@�p8�ӰѼ� �ǵ�superclass
	}
	
	@Override
	public double getArea() //�л\superclass ����getArea()
	{
		return super.getDownLength()*super.getHightNum();
	}
	
	@Override
	public String toString() //�л\superclass ����toString()
	{
		return String.format("����ήy�Ф��O�� %s ����� %.2f ���׬� %.2f ���n�� %.2f", super.showAll(), super.getDownLength(), super.getHightNum(), this.getArea());
	}
}
