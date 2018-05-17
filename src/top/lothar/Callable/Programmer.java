package top.lothar.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * call方法
 * 这种线程适合并发操作
 * 可以抛出异常，获取返回值
 * 共享资源
 * 适合搭建服务器
 * 
 * 1.创建Callable实现类，重写call方法
 * 2.执行调度服务ExecutorService获取Future对象
 * 2.result.get()获取值
 * 4.ser.shutdownNow()停止服务
 * @author Lothar
 *
 */
public class Programmer {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//创建线程  
		ExecutorService ser = Executors.newFixedThreadPool(2);
		
		Race tortoise = new Race("乌龟",1000);
		Race rabbit = new Race("兔子", 500);
		
		//获取值，异步计算，检索结果，了解执行情况
		Future<Integer> result1 = ser.submit(tortoise);
		Future<Integer> result2 = ser.submit(rabbit);
		
		Thread.sleep(2000);//两秒停止
		tortoise.setFlag(false);//停止线程体循环
		rabbit.setFlag(false);
		
		int num1 = result1.get();
		int num2 = result2.get();
		
		System.out.println("乌龟"+num1);
		System.out.println("兔子"+num2);
		
		//停止服务
		ser.shutdownNow();
	}

}
class Race implements Callable<Integer>{
	
	private String name;
	
	private long time;
	
	private int step = 0;
	
	private boolean flag = true;
	
	public Race(){
		
	}
	public Race(String name){
		this.name=name;
	}
	public Race(String name , long time){
		this.name=name;
		this.time=time;
	}
	@Override
	public Integer call() throws Exception {
		// TODO 自动生成的方法存根
		while(flag){
			Thread.sleep(time);
			step++;
		}
		return step;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
}