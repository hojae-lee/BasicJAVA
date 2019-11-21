package ex05method;

import java.util.Scanner;

public class QuTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("섭씨: ");
		double Celsius = sc.nextDouble();
		
		System.out.println("화씨: ");
		double Fahrenheit = sc.nextDouble();
		
		myFunc(Celsius);
		myFuncb(Fahrenheit);
		
	}
	
	static double myFunc(double Celsius) {
		
		double Fahrenheit = 1.8*Celsius+32;
		System.out.printf("화씨 = 1.8 * %.2f + 32 = %.2f\n",Celsius,Fahrenheit);
		
		return Fahrenheit;
	}
	
	static double myFuncb(double Fahrenheit) {
		
		double Celsius = (Fahrenheit-32) / 1.8;
		System.out.printf("섭씨 = %.2f - 32 / 1.8 = %.2f",Fahrenheit,Celsius);
		return Celsius;
	}


}