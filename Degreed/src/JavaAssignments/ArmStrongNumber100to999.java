package JavaAssignments;

public class ArmStrongNumber100to999 {
	public static void main(String[] args) {
		ArmStrongNumber100to999 obj=new ArmStrongNumber100to999();
		obj.aramstrong(100,999);

	}
	public void aramstrong(int a,int b) {
		for(int i=a;i<=b;i++) {
			int num=i;
			int sum=0;
			while(num>0) {
				int rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
			}
			if(sum==i) {
				System.out.println(sum);
			}
		}
	}


}
