package top.lothar.status;
/**
 * �ϲ��߳� join
 * @author Lothar
 *
 */
public class JoinDemo01 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		JoinDemo01 join = new JoinDemo01();   
		Thread t = new Thread(join);		//����  
		t.start();							//����
		//cpu��������
		for(int i = 0 ; i < 100 ; i++){
			if(i==80){
				t.join();//main����
			}
			System.out.println("main --"+i);
		}
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("join in ...");
		}
	}

}

