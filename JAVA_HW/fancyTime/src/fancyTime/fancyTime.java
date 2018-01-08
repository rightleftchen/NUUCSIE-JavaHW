package fancyTime;
//Copyright @ U0324017_rightleft. All rights reserved
public class fancyTime
{
	private int hour=0;
	private int minute=-1;
	private int second=-1;
	private int flag=0;
	private String meridiem="";
	
	public fancyTime(int hour,int minute,int second,String meridiem)
	{
		flag = 1;
		this.meridiem = meridiem;
		
		if( hour>0 && hour <=12) 
			this.hour = hour;
		if( minute>=0 && minute <=59) 
			this.minute = minute;
		if( second>=0 && second <=59) 
			this.second = second;		
	}
	
	public fancyTime(int hour,int minute,int second)
	{
		flag = 2;		
		if( hour>=0 && hour <24) 
			this.hour = hour;
		if( minute>=0 && minute <=59) 
			this.minute = minute;
		if( second>=0 && second <=59) 
			this.second = second;		
	}
	
	public fancyTime(int hour,int minute)
	{
		flag = 3;		
		if( hour>=0 && hour <24) 
			this.hour = hour;
		if( minute>=0 && minute <=59) 
			this.minute = minute;		
	}
	
	public void displayTime()
	{
		switch(flag)
		{
			case 1: 
					System.out.println(hour+":"+minute+":"+second+" "+meridiem);
					break;
			case 2: 
				    System.out.println(hour+":"+minute+":"+second);
					break;
			case 3: 
					System.out.println(hour+":"+minute);
					break;
		}
	}
}
