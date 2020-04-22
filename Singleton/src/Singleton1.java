//¿¡∫∫ Ω:—”≥Ÿº”‘ÿ
public class Singleton1 {
	private Singleton1() {
	}

	private static Singleton1 singleton = null;

	public static synchronized Singleton1 getinstance() {
		if (singleton == null) {
			singleton = new Singleton1();
		}
		return singleton;
	}

}
