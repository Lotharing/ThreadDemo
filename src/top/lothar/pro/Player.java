package top.lothar.pro;

public class Player implements Runnable{

	private Movie m;
	
	public Player(Movie m){
		this.m=m;
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0 ; i < 20 ; i++){
			if(0==i%2){
				m.play("���");
			}else{
				m.play("�ұ�");
			}
		}
	}
	
}
