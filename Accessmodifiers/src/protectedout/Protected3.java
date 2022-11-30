package protectedout;//protected outside package by subclass only
import com.acc.accessmodifiers.Protected;
public class Protected3 extends Protected {

	public static void main(String[] args) {
    Protected3 p3=new Protected3();
    p3.show();
    System.out.println(p3.i);
	}

}
