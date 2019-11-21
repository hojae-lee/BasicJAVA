package ex18thread;

class SumMulti{
	
	int num;
	public SumMulti() {
		num=0;
	}
//	public void addNum(int n) {
//		num+=n;
//	}
	public synchronized void addNum(int n) {
		num += n;
	}
	public int getNum() {
		return num;
	}
}

class MultiAdderThread extends Thread{
	/*
	 SumMulti 클래스의 인스턴스가 해당 클래스의 멤버변수로 선언됨.
	 */
	SumMulti sumInst;
	int start,end;
	public MultiAdderThread(SumMulti sum, int s, int e) {
		sumInst = sum;
		start = s;
		end = e;
	}
	@Override
	public void run() {
		for(int i = start; i<=end; i++) {
			/*
			 힙영역에 생성된 객체를 실제로 공유하여 호출하는 코드 부분
			 */
			sumInst.addNum(i);
		}
	}
}

public class Sync01Error {

	public static void main(String[] args) {
		/*
		 SumMulti 인스턴스의 참조 값을 쓰레드 인스턴스에 전달하고 있으므로 각
		 쓰레드는 하나의 인스턴스를 동시에 참조하게 되면 동시 접근이 가능한 상태가 된다.
		 */

		SumMulti s = new SumMulti();
		MultiAdderThread mat1 = new MultiAdderThread(s, 1, 10000);
		MultiAdderThread mat2 = new MultiAdderThread(s, 5001, 10000);
		mat1.start();
		mat2.start();
		
		try {
			/*
			 join() 메소드는 하나의 쓰레드가 작업을 마칠때까지 기다리는 역할을 하지만 Heap영역에 동시 접근을 막을수는
			 없다.
			 */
			mat1.join();
			mat2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~10000까지의 합:"+s.getNum());
	}

}
