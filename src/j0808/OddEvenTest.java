package j0808;

import java.util.Scanner;

class Odd{	
	int num;
	int sumEven;
	int sumOdd;
	
	void print(){
		for(int i=1; i<=num; i+=2) {
			sumOdd=sumOdd+i;
        }
		System.out.println("홀수의 합 : "+sumOdd);
		
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSumEven() {
		return sumEven;
	}

	public void setSumEven(int sumEven) {
		this.sumEven = sumEven;
	}

	public int getSumOdd() {
		return sumOdd;
	}

	public void setSumOdd(int sumOdd) {
		this.sumOdd = sumOdd;
	} 
}

class OddEven extends Odd {
	void print(){
		for(int i=2; i<=num; i=i+2) {
			sumEven=sumEven+i;
		}
		System.out.println("짝수의 합 : "+sumEven);
    }
	
}

public class OddEvenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s1 = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int num=s1.nextInt();
		
		Odd od=new Odd();
		
		od.setNum(num);
		
		od.print();
		
		OddEven oe=new OddEven();
		oe.setNum(num);
		oe.print();
		


	}

}
