package package2;
import package1.A;

public class D extends A {
	public D() {
		super();              //(o)
		this.field = "value"; //(o)
		this.method();        //(o)
	}
}