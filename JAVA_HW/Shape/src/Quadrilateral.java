
//Quadrilateral(四邊形) 是 superclass(最上層)

public class Quadrilateral
{
	private class point //建立一個point的class來儲存他的點的座標
	{
		public point(double d, double e) //用於儲存點的位置
		{
			// TODO Auto-generated constructor stub
			x = d;
			y = e;
		}
		public double x; //紀錄座標的x軸位置
		public double y; //紀錄座標的y軸位置
	}
	
	private static point[] savePoint = new point[4]; //共計4個點
	
	private double upLength; //儲存上方的邊常
	private double downLength; //儲存下方的邊常
	
	private double height; //儲存高度
	
	Quadrilateral(double...inputXY) //建構子
	{
		if (inputXY.length != 8) //如果傳進來的參數 沒有8個 也就是不足4個點的座標的話 跳出
		{
			throw new IllegalArgumentException("您所輸入的參數數量有誤 應該為4個點 8個座標");
		}
		
		for (int counter = 0; counter < 4; ++counter) //放進4個點內
		{
			//逐一放進座標結構內
			savePoint[counter] = new point(inputXY[2*counter], inputXY[2*counter+1]);
		}
		
		getUPAndDownLength(); //計算最上方與最下方的邊長
		getHeight(); //計算高度
	}
	
	public point[] getAllXY() //獲取全部的座標點
	{
		return savePoint; //傳回全部的座標
	}
	
	public point getOneXY(int n) //獲取其中一個座標點
	{
		return savePoint[n]; //傳回其中一個座標
	}
	
	private void getUPAndDownLength() //計算上底和下底
	{
		//a^2+b^2 = c^2
		upLength = Math.sqrt((Math.pow((savePoint[0].x - savePoint[1].x), 2) + Math.pow((savePoint[0].y - savePoint[1].y), 2)));
		downLength = Math.sqrt((Math.pow((savePoint[2].x - savePoint[3].x), 2) + Math.pow((savePoint[2].y - savePoint[3].y), 2)));
	}
	
	private void getHeight() //計算高度
	{
		height = savePoint[0].y - savePoint[2].y;
	}
	
	public double getUpLength() //獲取上方邊長
	{
		return upLength;
	}
	
	public double getDownLength() //獲取下方邊長
	{
		return downLength;
	}
	
	public double getHightNum() //獲取高度
	{
		return height;
	}
	
	public double getArea() //預設的計算面積
	{
		return downLength*height;
	}
	
	public String showAll() //顯示所有的座標點(字串)
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
	
	public String toString() //預設的字串顯示方式
	{
		return String.format("%s 面積為 %.2f", this.showAll(), this.getArea());
	}
}

