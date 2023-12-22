
public class DailyWage {

	public static void main(String[] args) {
		int FULL_TIME=1;
		int RATE_PER_HOUR=20;
		int FULL_DAY_HOUR=0;
		double emp_check=Math.floor(Math.random()*10)%2;
		if(emp_check==FULL_TIME)
			FULL_DAY_HOUR=8;
		else
			FULL_DAY_HOUR=0;
		
		double wage=FULL_DAY_HOUR * RATE_PER_HOUR;
		
		System.out.println("Daily wage of employee is : "+wage);

	}

}
