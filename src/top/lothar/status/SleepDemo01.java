package top.lothar.status;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程阻塞倒计时
 * @author Lothar
 *
 */
public class SleepDemo01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO 自动生成的方法存根
		Date endTime = new Date(System.currentTimeMillis()+10*1000);
		long end = endTime.getTime();
		
		while(true){
			String time = new SimpleDateFormat("mm:ss").format(endTime);
			System.out.println(time);
			//构建下一秒时间
			endTime = new Date(endTime.getTime()-1000);
			//线程等待一秒
			Thread.sleep(1000);
			//10秒以内继续，否则退出循环
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
