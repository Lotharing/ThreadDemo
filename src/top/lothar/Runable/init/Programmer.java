package top.lothar.Runable.init;
/**
 * ʹ��Runable�����߳�
 * ��ʵ�ָýӿڣ� ��дRun  ��ʵ��ɫ��
 * �������߳�ʹ�þ�̬���� 1.������ʵ��ɫ 2.���������ɫ+��ʵ��ɫ���� 3.����start��������
 * 
 * 1.�����˵��̳еľ����ԣ��߳�ռ�ü̳�λ�ã����ڳ�����չ
 * 2.���ڹ��������Դ
 * @author Lothar
 *
 */
public class Programmer implements Runnable{

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0 ;i < 110 ; i++){
			System.out.println("д����");
		}
	}

}
