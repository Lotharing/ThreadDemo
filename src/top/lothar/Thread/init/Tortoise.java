package top.lothar.Thread.init;

public class Tortoise extends Thread{
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0 ; i < 80 ; i++){
			System.out.println("�ڹ�����"+i+"��");
		}
	}
}
