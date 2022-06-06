package JavaAssignments;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	
	
        public class ArmStrong {
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int Number = Integer.parseInt(br.readLine());
			int Temp = Number;
			int A =0;
			while(Number>0) {
				 int rem = Number % 10;
		            A = (A) + (rem * rem * rem);
		            Number = Number / 10;	
			}
			if (Temp == A) {
				System.out.println(Temp+" Is a Armstrong Number");
			}
			else {
				System.out.println(Temp + " Is not a ArmStrong Number");
			}
		}
        }


