package top.lothar.pro;

public class App {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��ͬ��Դ
		Movie m = new Movie();
		
		Player p = new Player(m);
		Watcher w = new Watcher(m);
		
		new Thread(p).start();
		new Thread(w).start();
	}

}
