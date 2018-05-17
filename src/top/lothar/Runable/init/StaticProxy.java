package top.lothar.Runable.init;
/**
 * ��̬����ģʽ
 * ��Ϊ�߳�ʵ�ֵ���Runable�ӿڣ����Դ����ߺ���ʵ��ɫʵ��ͬһ���ӿڣ���д�ӿ�run����
 * @author Lothar
 *
 */
public class StaticProxy {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		You you = new You();
		WeddingCompany wc = new WeddingCompany(you);
		wc.marry();
	}
	
}
//��ͬ�ӿ�
interface Marry{
	public abstract void marry();
}
//��ʵ��ɫ
class You implements Marry{

	@Override
	public void marry() {
		// TODO �Զ����ɵķ������
		System.out.println("��ͩ���Ĳ������");
	}
	
}
//�����ɫ
class WeddingCompany implements Marry{
	private Marry you;
	
	public WeddingCompany() {
		
	}
	public WeddingCompany(Marry you){
		this.you=you;
	}
	
	public void before(){
		System.out.println("��ǰ׼��");
	}
	public void last(){
		System.out.println("ʱ���ճ�");
	}
	@Override
	public void marry() {
		// TODO �Զ����ɵķ������
		before();
		you.marry();
		last();
	}
	
}