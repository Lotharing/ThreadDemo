package top.lothar.syn;
/**
 * �����ͬ�����������������
 * @author Lothar
 *
 */
public class SynDemo03 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Object g = new Object();
		Object m = new Object();
		
		Test t1 = new Test(g, m);
		Test t2 = new Test(g, m);
		
		Thread poxy1 = new Thread(t1);
		Thread poxy2 = new Thread(t1);
		
		poxy1.start();
		poxy2.start();
	}

}
class Test implements Runnable{
	
	Object goods;
	Object money;
	
	public Test(Object goods , Object money){
		this.goods=goods;
		this.money=money;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		test();
	}
	
	
	public void test(){
		synchronized (goods) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			synchronized (money) {
				
			}
		}
		System.out.println("һ�ָ���");
	}
	
}

class Test2 implements Runnable{
	
	Object goods;
	Object money;
	
	public Test2(Object goods , Object money){
		this.goods=goods;
		this.money=money;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		test();
	}
	
	
	public void test(){
		synchronized (money) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			synchronized (goods) {
				
			}
		}
		System.out.println("һ�ָ�Ǯ");
	}
	
}
