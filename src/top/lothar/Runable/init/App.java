package top.lothar.Runable.init;

public class App {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Programmer pm = new Programmer();
		
		Thread proxy = new Thread(pm);
		
		proxy.start();
		
		for(int i = 0 ;i < 50 ; i++){
			System.out.println("��QQ");
		}
	}

}
