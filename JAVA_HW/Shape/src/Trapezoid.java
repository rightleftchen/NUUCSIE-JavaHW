//trapezoid�O���

public class Trapezoid extends Quadrilateral 
{
	Trapezoid(double...inputXY) //�h���غc�l
	{
		super(inputXY); //�N�y�жǵ�superclass �@�p8�ӰѼ�
	}
	
	@Override
	public double getArea() //�л\superclass����getArea()
	{
		return (super.getUpLength()+super.getDownLength())*super.getHightNum()/2;
	}
	
	@Override
	public String toString() //�л\superclass����toString()
	{
		return String.format("��ήy�Ф��O�� %s �W������� %.2f �U������� %.2f ���׬� %.2f ���n�� %.2f", super.showAll(), super.getUpLength(), super.getDownLength(), super.getHightNum(), this.getArea());
	}
}
