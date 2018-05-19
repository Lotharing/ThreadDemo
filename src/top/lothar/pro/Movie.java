package top.lothar.pro;
/**
 * һ����������ͬ����Դ
 * ������������ģʽ���źŵƷ�
 * notifyAll  �����ڴ˶���������µ������߳�
 * wait �����̵߳��ô˶����notify����ʱ  ���̵߳ȴ�  �ȴ��ͷ���
 * @author Lothar
 *
 */
public class Movie {
	
	private String pic;
	//�źŵ�    true ʱ����  �����ߵȴ�  �������֪ͨ������
	//		flase  ���� �����ߵȴ� �������֪ͨ������
	
	private boolean flag = true;
	public synchronized void play(String pic){
		if(!flag){  //�����ߵȴ� 
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		System.out.println("������"+pic);
		//�������
		this.pic=pic;
		//֪ͨ����
		this.notify();
		//������ͣ��
		this.flag=false;
	}
	
	public synchronized void watch(){
		if(flag){  //�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
		System.out.println("������"+pic);
		//������ϣ�֪ͨ����
		this.notifyAll();
		//����ֹͣ��������ʼ
		this.flag=true;
	}
}
