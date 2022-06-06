package Q2;

public class Labor extends Employee{
	private int over_time;
    
	public int getOver_time() {
		return over_time;
	}

	public void setOver_time(int over_time) {
		this.over_time = over_time;
	}
	public void total_salary() {
		System.out.println("Total salary of Employee "+(basic + over_time));
	}

}
