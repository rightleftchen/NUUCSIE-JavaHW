
public class QuadriTest //測試每個不同類型的class功能
{

	public static void main(String[] args)
	{

		Trapezoid trap = new Trapezoid(2, 2, 4, 2, 0, 0, 6, 0); //梯形的建立
		System.out.println(trap); //梯形結果顯示

		Parallelogram para = new Parallelogram(2, 2, 6, 4, 0, 0, 4, 0); //平行四邊形的建立
		System.out.println(para); //平行四邊形結果顯示

		Square squ = new Square(0, 4, 4, 4, 0, 0, 4, 0); //正方形的建立
		System.out.println(squ); //正方形結果顯示

		Rectangle rect = new Rectangle(0, 5, 10, 5, 0, 0, 10, 0); //長方形的建立
		System.out.println(rect); //正方形的結果顯示
	}
}
