package top.lothar.Thread.init;
/**
 * main�����߳�
 * ����ͨ������rabbit tortoise ��main ͬʱ�� ���߳�
 * �����Ǿ�̬�Ĵ����
 * ������ִ�д����
 * ����ϵͳ����ͬʱ���ж������
 * һ�����̿��Կ��ٶ��ͨ�����ж���߳�
 * ���̹߳�������е���Դ���ڴ棬��ͬһʱ��Ƭֻ����һ���߳���ִ��
 * @author Lothar
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Rabbit rbt = new Rabbit();
		Tortoise toi = new Tortoise();
		
		rbt.start();
		toi.start();
		
		for(int i = 0 ;i < 110 ; i++){
			System.out.println("main-->"+i);
		}
	}

}
