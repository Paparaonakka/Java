package Q3;

public class Main {
public static void main(String[] args) {
	Current c=new Current();
	Saving s=new Saving();
	c.setCredit_cash(30010);
	System.out.println(c.get_total_amt());
	s.setFixed_deposite(10000);
	System.out.println(s.get_total_amt());
	System.out.println("Total Amoount in Bank :"+(c.get_total_amt()+s.get_total_amt()));
}
}
