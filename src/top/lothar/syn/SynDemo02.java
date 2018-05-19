package top.lothar.syn;
/**
 * 测试时把下边的静态方法1234 数字逐一抹去
 * @author Lothar
 *
 */
public class SynDemo02 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//在多线程中部syn会造成同一个对象实例后地址不一致,实例时加syn地址就会一直
		 JvmThread jv1 = new JvmThread(100);
		 JvmThread jv2 = new JvmThread(100);
		 jv1.start();
		 jv2.start();
	}

}

class JvmThread extends Thread{
	
	private long time;
	
	public JvmThread(long time){
		this.time=time;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println(Thread.currentThread().getName()+"创建"+Jvm.getInstance(time));
	}
}

class Jvm{
	/**
	 * 单利模式
	 * 确保一个类只有一个对象
	 * 懒汉式
	 * 1.构造器私有化
	 * 2.声明私有静态变量
	 * 3.创建一个对外公共的静态方法，访问该变量，如果该变量没有对象则创建对象
	 */
	private static Jvm instance = null;
	//构造器私有化，避免外部直接创建对象
	private Jvm(){
		
	}
	//创建一个对外公共的静态方法，访问该变量，如果该变量没有对象则创建对象
	public static synchronized Jvm getInstance2(long time){
		if(null==instance){
			try {
				Thread.sleep(time); //延时
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}
	
	//创建一个对外公共的静态方法，访问该变量，如果该变量没有对象则创建对象   
	//同步块 效率不高
		public static Jvm getInstance1(long time){
			synchronized (Jvm.class) {
				if(null==instance){
					try {
						Thread.sleep(time); //延时
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					instance = new Jvm();
				}
			}
			return instance;
		}
		
		
		public static Jvm getInstance(long time){
				//效率  存在对象也需要等待
				if(null==instance){
					
					synchronized (Jvm.class) {
						try {
							Thread.sleep(time); //延时
						} catch (InterruptedException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
						instance = new Jvm();
					}
				}
			return instance;
		}
}
