package Q3;

public class Saving extends Account{
private int fixed_deposite;

public int getFixed_deposite() {
	return fixed_deposite;
}

public void setFixed_deposite(int fixed_deposite) {
	this.fixed_deposite = fixed_deposite;
}
@Override
public float get_total_amt() {
	return deposite+fixed_deposite;
}
}
