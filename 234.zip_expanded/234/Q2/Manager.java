package Q2;

public class Manager extends Employee {
private int incentive;
public int getIncentive() {
	return incentive;
}

public void setIncentive(int incentive) {
	this.incentive = incentive;
}
public void total_salary() {
	System.out.println("Total salary is :"+(basic + incentive));
}
}
