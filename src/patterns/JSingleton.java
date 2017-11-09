package patterns;

public class JSingleton {
	public static JSingleton singleton;

	private JSingleton() {

	}

	public static JSingleton getInstance() {
		if (singleton != null) {
			singleton = new JSingleton();
		}
		return singleton;
	}
}
