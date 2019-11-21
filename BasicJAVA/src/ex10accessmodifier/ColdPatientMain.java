package ex10accessmodifier;

//시나리오] 감기환자는 아래 1 2 3 순섣로 약을 복용해야한다고 가정.

	//코막힘
	class SnuffleCap{
		public void take() {
			System.out.println("3.코막힘이 치료됩니다.");
		}
	}
	//기침
	class SneezeCap{
		public void take() {
			System.out.println("2.기침이 멈춥니다.");
		}
	}
	//콧물
	class SinivelCap{
		public void take() {
			System.out.println("1.콧물이 멈춥니다.");
		}
	}
	
	//감기환자를 추상화한 클래스
//	class ColdPatient{
//		
//		SneezeCap sneeze = new SneezeCap();
//		SinivelCap sinivel = new SinivelCap();
//		SnuffleCap snuffle = new SnuffleCap();
//		
//		/*
//		 증상에 따라 약의 복용순서가 중요하다고 가정했을때 현재는 환자마음대로 복용하는 것이 가능하다.
//		 즉 캡슐화가 되지않아 순서 없이 복용하는 것이 문법적으로 가능한 상태이다.
//		 */
//		
//		public void take() {
//			sinivel.take();
//			sneeze.take();
//			snuffle.take();
//		}
//	}
	
// == 캡슐화 후===
	
	class ColdPatient{
		/*
		 캡슐화 이전에는 환자가 세가지 증상에 대한 약을 순서없이 마음대로 복용하는 것이 가능했다면
		 캡슐화 이후에는 처방이 이미 안료된 콘택600을 한번만 복용하면 되는 상황으로 바뀌었다.
		 
		 즉 캡슐화는 여러가지 비즈니시로직을 하나로 묶는다는 의미외에도 업무의 순서까지 고려한 형태
		 의 비즈니스로직을 구성한다는 의미도 함께 가지고 있따.
		 */
		Contack600 contack600 = new Contack600();
		
		public void take() {
			contack600.take();
		}
	}
	
	
public class ColdPatientMain {
		

	public static void main(String[] args) {

		ColdPatient patient = new ColdPatient();
		patient.take();
		
	}

}
