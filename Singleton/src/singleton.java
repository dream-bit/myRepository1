//����ʽ 
public class singleton {
	
	//����ʽ
	private singleton(){}
	private static singleton s = new singleton();
	public static singleton getA (){
		
		return s;
	}
}
