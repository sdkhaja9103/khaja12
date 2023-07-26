package prog1;
import java.util.*;
public class account {
	public static void main(String[] args) {
		long accno=0;
		int balance=10000;
		int b=122;
		Scanner sc=new Scanner(System.in);
		System.out.println("account no:"+accno);
		System.out.println("balance:"+balance);
		System.out.println("remaining balance:"+(b-balance));
		System.out.println("balance:"+(b+balance));
	}
	void withdraw() {
				int b=122;
				int balance=0;
				Scanner sc1=new Scanner("enter withdraw amount:");
				if(b<balance) {
					System.out.println("balance:"+balance);
					if(b>balance) {
						System.out.println("remaining balance:"+(b-balance));
					}
					else
						System.out.println("insufficient funds");
				}
	}
			void deposit() {
				int b=111;
				int balance=0;
				Scanner sc2=new Scanner("enter deposit amount:");
				if(b<=balance) {
					System.out.println("balance");
					if(b>=balance) {
						System.out.println("updated balance:"+(b+balance));
					}
					else
						System.out.println("insufficient funds");
			}
			}

}
