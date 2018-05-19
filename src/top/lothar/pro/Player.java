package top.lothar.pro;

public class Player implements Runnable{

	private Movie m;
	
	public Player(Movie m){
		this.m=m;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0 ; i < 20 ; i++){
			if(0==i%2){
				m.play("左边");
			}else{
				m.play("右边");
			}
		}
	}
	
}
