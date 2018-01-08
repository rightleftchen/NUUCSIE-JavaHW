package fancyTime;
//Copyright @ U0324017_rightleft. All rights reserved
public class fancyTime_Test {

	public static void main(String[] args) {
		fancyTime time1 = new fancyTime(11,41,59,"am");
		time1.displayTime();
		fancyTime time2 = new fancyTime(11,41,59);
		time2.displayTime();
		fancyTime time3 = new fancyTime(11,41);
		time3.displayTime();

	}

}
