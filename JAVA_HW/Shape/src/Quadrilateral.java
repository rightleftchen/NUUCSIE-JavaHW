
//Quadrilateral(�|���) �O superclass(�̤W�h)

public class Quadrilateral
{
	private class point //�إߤ@��point��class���x�s�L���I���y��
	{
		public point(double d, double e) //�Ω��x�s�I����m
		{
			// TODO Auto-generated constructor stub
			x = d;
			y = e;
		}
		public double x; //�����y�Ъ�x�b��m
		public double y; //�����y�Ъ�y�b��m
	}
	
	private static point[] savePoint = new point[4]; //�@�p4���I
	
	private double upLength; //�x�s�W�誺��`
	private double downLength; //�x�s�U�誺��`
	
	private double height; //�x�s����
	
	Quadrilateral(double...inputXY) //�غc�l
	{
		if (inputXY.length != 8) //�p�G�Ƕi�Ӫ��Ѽ� �S��8�� �]�N�O����4���I���y�Ъ��� ���X
		{
			throw new IllegalArgumentException("�z�ҿ�J���ѼƼƶq���~ ���Ӭ�4���I 8�Ӯy��");
		}
		
		for (int counter = 0; counter < 4; ++counter) //��i4���I��
		{
			//�v�@��i�y�е��c��
			savePoint[counter] = new point(inputXY[2*counter], inputXY[2*counter+1]);
		}
		
		getUPAndDownLength(); //�p��̤W��P�̤U�誺���
		getHeight(); //�p�Ⱚ��
	}
	
	public point[] getAllXY() //����������y���I
	{
		return savePoint; //�Ǧ^�������y��
	}
	
	public point getOneXY(int n) //����䤤�@�Ӯy���I
	{
		return savePoint[n]; //�Ǧ^�䤤�@�Ӯy��
	}
	
	private void getUPAndDownLength() //�p��W���M�U��
	{
		//a^2+b^2 = c^2
		upLength = Math.sqrt((Math.pow((savePoint[0].x - savePoint[1].x), 2) + Math.pow((savePoint[0].y - savePoint[1].y), 2)));
		downLength = Math.sqrt((Math.pow((savePoint[2].x - savePoint[3].x), 2) + Math.pow((savePoint[2].y - savePoint[3].y), 2)));
	}
	
	private void getHeight() //�p�Ⱚ��
	{
		height = savePoint[0].y - savePoint[2].y;
	}
	
	public double getUpLength() //����W�����
	{
		return upLength;
	}
	
	public double getDownLength() //����U�����
	{
		return downLength;
	}
	
	public double getHightNum() //�������
	{
		return height;
	}
	
	public double getArea() //�w�]���p�⭱�n
	{
		return downLength*height;
	}
	
	public String showAll() //��ܩҦ����y���I(�r��)
	{
		String tempString = "";
		for (int counter = 0; counter < 4; ++counter)
		{
			tempString += savePoint[counter].x;
			tempString += ',';
			tempString += savePoint[counter].y;
			tempString += ' ';
		}
		
		return tempString;
	}
	
	public String toString() //�w�]���r����ܤ覡
	{
		return String.format("%s ���n�� %.2f", this.showAll(), this.getArea());
	}
}

