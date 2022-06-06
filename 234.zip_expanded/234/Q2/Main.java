package Q2;

public class Main {
public static void main(String[] args) {
	Manager mg=new Manager();
	Labor l=new Labor();
	mg.setIncentive(3000);
	mg.total_salary();
	l.setOver_time(2500);
	l.total_salary();
}
}
