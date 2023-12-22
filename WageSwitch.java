
public class WageSwitch {
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int RATE_PER_HOUR=20;
	
	
	public static void main(String[] args) {
		
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
		
		double wage=FULL_DAY_HOUR * RATE_PER_HOUR;
		System.out.println("Employee wage is: "+wage);

	}

}
