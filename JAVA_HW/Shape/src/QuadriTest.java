
public class QuadriTest //���ըC�Ӥ��P������class�\��
{

	public static void main(String[] args)
	{

		Trapezoid trap = new Trapezoid(2, 2, 4, 2, 0, 0, 6, 0); //��Ϊ��إ�
		System.out.println(trap); //��ε��G���

		Parallelogram para = new Parallelogram(2, 2, 6, 4, 0, 0, 4, 0); //����|��Ϊ��إ�
		System.out.println(para); //����|��ε��G���

		Square squ = new Square(0, 4, 4, 4, 0, 0, 4, 0); //����Ϊ��إ�
		System.out.println(squ); //����ε��G���

		Rectangle rect = new Rectangle(0, 5, 10, 5, 0, 0, 10, 0); //����Ϊ��إ�
		System.out.println(rect); //����Ϊ����G���
	}
}
