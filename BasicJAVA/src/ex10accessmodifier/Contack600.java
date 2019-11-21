package ex10accessmodifier;

//감기 처방과 관련된 약들을 캡슐화
public class Contack600 {
	
	//멤버변수
	SneezeCap sneeze = new SneezeCap();
	SinivelCap sinivel = new SinivelCap();
	SnuffleCap snuffle = new SnuffleCap();
	
	//멤버메소드
	public void take() {
		/*
		 처방된 약의 복용순서가 중요
		 콧물 기침 코막힘 순
		 */
		sinivel.take();
		sneeze.take();
		snuffle.take();
	}

}
