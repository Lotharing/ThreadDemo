package top.lothar.status;
/**
 * �̵߳�ֹͣ
 * sleepҲ��ֹͣ��һ�ַ�ʽ  ֱ�ӿ�������ʱ��
 * @author Lothar
 *
 */
public class YieldDemo01 extends Thread{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		YieldDemo01 y = new YieldDemo01();
		Thread t = new Thread(y); //����
		t.start();				//����
		//cpu��������
		for(int i = 0 ; i < 100 ; i++){
			if(i%20==0){
				Thread.yield();  //��ͣ���߳�
			}
			System.out.println("main--"+ i);
		}
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("Yield--"+i);
		}
	}
}
