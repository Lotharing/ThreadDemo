package top.lothar.status;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �߳���������ʱ
 * @author Lothar
 *
 */
public class SleepDemo01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO �Զ����ɵķ������
		Date endTime = new Date(System.currentTimeMillis()+10*1000);
		long end = endTime.getTime();
		
		while(true){
			String time = new SimpleDateFormat("mm:ss").format(endTime);
			System.out.println(time);
			//������һ��ʱ��
			endTime = new Date(endTime.getTime()-1000);
			//�̵߳ȴ�һ��
			Thread.sleep(1000);
			//10�����ڼ����������˳�ѭ��
			if(end-10000>endTime.getTime()){
				break;
			}
		}
	}
	
	public static void test1() throws InterruptedException{
		int num = 10 ;
		while(true){
			System.out.println(num--);
			Thread.sleep(1000);
			if(num<=0){
				break;
			}
		}
	}

}
