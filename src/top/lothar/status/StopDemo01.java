package top.lothar.status;
/**
 * ���� ���� ���� ���� ����  ����״̬
 * ֹͣ�̵߳ķ�ʽ��
 * 1.��Ȼ��ֹ���߳���ִ�����
 * 2.�ⲿ����
 * 		1.�߳����ж��嶨���߳���ʹ�õı�ʶ
 * 		2.while �߳���ʹ�øñ�ʶ
 * 		3.�ṩ���ⷽ���ı�ñ�ʶ
 * 		4.�����ⲿ�������ø÷���
 * @author Lothar
 *
 */
public class StopDemo01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Study s = new Study();
		
		new Thread(s).start();
		
		for(int i =0 ;i<100;i++){
			if(80==i){
				s.stop();
			}
			System.out.println("main - -"+i);
		}
	}

}
class Study implements Runnable{

	private boolean flag = true;
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(flag){
			System.out.println("study ...");
		}
	}
	
	public void stop(){
		this.flag = false;
	}
}
