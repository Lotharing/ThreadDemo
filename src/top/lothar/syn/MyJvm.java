package top.lothar.syn;

public class MyJvm {
/**
 * 懒汉式
 */
	private static MyJvm instance;
	
	private MyJvm(){
		
	}
	
	public static MyJvm getInstance(){
		if(null==instance){   //提供效率
			synchronized (MyJvm.class) {
				if(null==instance){   //安全保障
					instance = new MyJvm();
				}
			}
		}
		return instance;
	}

}


class MyJvm2 {
/**
 * 饿汉式
 * 1.构造器私有化
 * 2.声明私有静态属性，同时创建对象
 * 3.对我提供方法访问静态属性
 */
	private static MyJvm2 instance = new MyJvm2();
	
	private MyJvm2(){
		
	}
	
	public static MyJvm2 getInstance(){
		
		return instance;
	}

}

class MyJvm3{
	//延缓类的加载时间
	private static class JvmHandle{
		private static MyJvm3 instance = new MyJvm3();
	}
	
	private MyJvm3(){
		
	}
	
	public static MyJvm3 getInstance(){
		
		return JvmHandle.instance;
	}
}
