//¶öººÊ½ 
public class singleton {
	
	//¶öººÊ½
	private singleton(){}
	private static singleton s = new singleton();
	public static singleton getA (){
		
		return s;
	}
}
