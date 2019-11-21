package ex03operator;

public class BitOperator {

	/*
	 비트연산자
	 	&(And) : A와 B가 둘 다 1일때만 1을 반환. 나머지는0
	 	|(Or) : A와 B둘 중 하나만 1이면 1을 반환. 둘 다 0일때 0반환
	 	^(Xor) : 둘이 같으면0, 다르면 1반환
	 	~(Not) : 반전된 값 반환. 1이면 0, 0이면 1
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5; //00000000 00000000 00000000 00000101
		int num2 = 3; //00000000 00000000 00000000 00000011
		int num3 = -1; //11111111 11111111 11111111 11111111
		
		//비트연산결과 : 00000001
		System.out.println("비트AND : "+ (num1 & num2)); //결과 1
		//비트연산결과 : 00000111
		System.out.println("비트OR : "+ (num1 | num2)); //결과 7
		//비트연산결과 : 00000110
		System.out.println("비트XOR : "+ (num1 ^ num2)); //결과 6
		//비트연산결과 : 00000000
		System.out.println("비트Not : "+ (~num3)); //결과 0
		
		
	}

}
