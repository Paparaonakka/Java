package Q3;

public class Current extends Account {
private int credit_cash;

public int getCredit_cash() {
	return credit_cash;
}

public void setCredit_cash(int credit_cash) {
	this.credit_cash = credit_cash;
}
@Override
public float get_total_amt() {
	return deposite+credit_cash;
}
}
