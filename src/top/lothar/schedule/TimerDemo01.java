package top.lothar.schedule;
/*
 *定时器
 *指定时间执行，指定任务，指定间隔重复执行
 *schedule(TimerTask task,Date time)
 *schedule(TimerTask task,Date time,long period间隔多少执行一次)
 */
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				System.out.println("12312313");
			}
		}, new Date(System.currentTimeMillis()+1000),200);
	}

}
