package a7_5;

public class SportCar {
	@Override
	public void speedUp() { speed += 10; }
	
	//�������̵��� �� �� ����
	@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	}
}