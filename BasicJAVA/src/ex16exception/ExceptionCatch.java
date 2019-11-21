package ex16exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCatch {

	public static void main(String[] args) {

		/*
		 예외처리를 할 떄 필요에 따라 여러개의 catch블록을 사용할 수 있다.
		 이 경우 반드시 자식 예외 클래스부터 catch절을 사용해야한다.
		 Exception클래스는 모든 예외 클래스의 부모이므로 처음에 사용하게 되면
		 모든 예외를 catch하기 때문에 아래부분의 catch절에서 에러가 발생한다.
		 -Exception예외처리 클래스는 반드시 가장 마지막에 사용해야 한다.
		 */
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[3];
		
		try {
			for(int i=0; i<array.length; i++) {
				System.out.print("array["+i+"]에 저장할 숫자입력:");
				array[i] = Integer.parseInt(scanner.nextLine());
				//테스트시 '11a'형태로 입력할것.
			}
			//테스트시 0입력할것.
			System.out.println("배열에 저장된 두 숫자나누기:"+ array[0]/array[1]);
			System.out.println("나이를 입력하세요:");
			int age  =scanner.nextInt();
			//나이 입력시 숫자이외의 문자를 입력할 것.
			System.out.println("당신의 나이는:"+ age);
			
			array[3] = age;
			
		} 
		
		catch (InputMismatchException e) {
			System.out.println("숫자로만 입력해야 합니다.");
		}
		catch (ArithmeticException e) {
			System.out.println("산술연산이 불가능합니다.");
		}
		catch (NumberFormatException e) {
			System.out.println("숫자형태의 문자만 입력가능합니다.");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과하였습니다.");
		}
		catch (Exception e) {
			/*
			 예외처리에 있어 디테일한 처리가 필요 없다면 Exception클래스 하나로
			 catch블럭을 구성해도 무방하다.
			 단, 각각의 예외클래스별로 세분화할수 없다는 단점은 있다.
			 */
			System.out.println("예외가 발생하였습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("===프로그램 끝===");
		
	}

}
