package top.lothar.Runable.init;
/**
 * 使用Runable创建线程
 * 类实现该接口， 重写Run  真实角色类
 * 启动多线程使用静态代理 1.创建真实角色 2.创建代理角色+真实角色引用 3.调用start方法启动
 * 
 * 1.避免了单继承的局限性，线程占用继承位置，利于程序扩展
 * 2.便于共享进程资源
 * @author Lothar
 *
 */
public class Programmer implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0 ;i < 110 ; i++){
			System.out.println("写代码");
		}
	}

}
