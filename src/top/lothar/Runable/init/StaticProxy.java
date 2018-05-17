package top.lothar.Runable.init;
/**
 * 静态代理模式
 * 因为线程实现的是Runable接口，所以代理者和真实角色实现同一个接口，复写接口run方法
 * @author Lothar
 *
 */
public class StaticProxy {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		You you = new You();
		WeddingCompany wc = new WeddingCompany(you);
		wc.marry();
	}
	
}
//共同接口
interface Marry{
	public abstract void marry();
}
//真实角色
class You implements Marry{

	@Override
	public void marry() {
		// TODO 自动生成的方法存根
		System.out.println("关桐和文波结婚了");
	}
	
}
//代理角色
class WeddingCompany implements Marry{
	private Marry you;
	
	public WeddingCompany() {
		
	}
	public WeddingCompany(Marry you){
		this.you=you;
	}
	
	public void before(){
		System.out.println("事前准备");
	}
	public void last(){
		System.out.println("时候收场");
	}
	@Override
	public void marry() {
		// TODO 自动生成的方法存根
		before();
		you.marry();
		last();
	}
	
}