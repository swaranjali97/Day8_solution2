
public class LimitWages {

	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int RATE_PER_HOUR=20;
	public static final int TOTAL_DAYS_PER_MONTH=20;
	
	public void calWage() {
		double totalWage=0;
		int time=0;
		while(time<=100 && TOTAL_DAYS_PER_MONTH<=20) {
		for(int i=0;i<TOTAL_DAYS_PER_MONTH;i++) {
			
		int FULL_DAY_HOUR=0;
		double emp_check=Math.floor(Math.random()*10)%3;
		
		switch((int)emp_check) {
		case FULL_TIME:
			FULL_DAY_HOUR=8;
			break;
		case PART_TIME:
			FULL_DAY_HOUR=4;
			break;
		default :
			FULL_DAY_HOUR=0;
			break;
		}
		time=time+FULL_DAY_HOUR;
		double wage=FULL_DAY_HOUR * RATE_PER_HOUR;
		totalWage=totalWage+wage;
		}
	}
		System.out.println("Employee wage is: "+totalWage);
		
	}
	
	
	public static void main(String[] args) {
		
		LimitWages e1=new LimitWages();
		e1.calWage();


}

}


