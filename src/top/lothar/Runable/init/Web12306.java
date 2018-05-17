package top.lothar.Runable.init;
/**
 * һ���̳�Thread + run 
 *    ����������������󣬶���.start()
 *    
 * ����ʵ��Runnable + run
 * 	     ������������ʵ��ɫ 
 *  	      ���������ɫ Thread+����  
 *  	      �����ɫ.start()
 *  
 *  �Ƽ�ʹ�ýӿڣ�
 *  	1.���ⵥ�̳о�����
 * 		2.������Դ����̬����ģʽ
 * @author Lothar
 *
 */
public class Web12306 implements Runnable{
	
	private int num = 50;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true){
			if(num<1){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"����"+num--);
		}
	}

	public static void main(String[] args) {
		//��ʵ��ɫ
		Web12306 web = new Web12306();
		//�����ɫ
		Thread t1 = new Thread(web,"��");
		Thread t2 = new Thread(web,"��");
		Thread t3 = new Thread(web,"��");
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}
