package patterns;

public class JSingleton {
	JSingleton singleton;

	private JSingleton() {

	}

	void create() {
		if (singleton != null) {
			singleton = new JSingleton();
		}
	}
}
