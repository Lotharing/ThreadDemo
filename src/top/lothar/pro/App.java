package top.lothar.pro;

public class App {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//共同资源
		Movie m = new Movie();
		
		Player p = new Player(m);
		Watcher w = new Watcher(m);
		
		new Thread(p).start();
		new Thread(w).start();
	}

}
