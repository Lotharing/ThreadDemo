package top.lothar.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * call����
 * �����߳��ʺϲ�������
 * �����׳��쳣����ȡ����ֵ
 * ������Դ
 * �ʺϴ������
 * 
 * 1.����Callableʵ���࣬��дcall����
 * 2.ִ�е��ȷ���ExecutorService��ȡFuture����
 * 2.result.get()��ȡֵ
 * 4.ser.shutdownNow()ֹͣ����
 * @author Lothar
 *
 */
public class Programmer {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//�����߳�  
		ExecutorService ser = Executors.newFixedThreadPool(2);
		
		Race tortoise = new Race("�ڹ�",1000);
		Race rabbit = new Race("����", 500);
		
		//��ȡֵ���첽���㣬����������˽�ִ�����
		Future<Integer> result1 = ser.submit(tortoise);
		Future<Integer> result2 = ser.submit(rabbit);
		
		Thread.sleep(2000);//����ֹͣ
		tortoise.setFlag(false);//ֹͣ�߳���ѭ��
		rabbit.setFlag(false);
		
		int num1 = result1.get();
		int num2 = result2.get();
		
		System.out.println("�ڹ�"+num1);
		System.out.println("����"+num2);
		
		//ֹͣ����
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
		// TODO �Զ����ɵķ������
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