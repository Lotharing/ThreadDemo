package top.lothar.schedule;
/*
 *��ʱ��
 *ָ��ʱ��ִ�У�ָ������ָ������ظ�ִ��
 *schedule(TimerTask task,Date time)
 *schedule(TimerTask task,Date time,long period�������ִ��һ��)
 */
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				System.out.println("12312313");
			}
		}, new Date(System.currentTimeMillis()+1000),200);
	}

}
