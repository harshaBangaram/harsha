package biConsumer;
import java.util.function.*;
public class BiConsumer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiConsumer<Integer,Integer> b=(a,c)->a.compareTo(c);{
	
	System.out.println(b);
	
}b.accept(2, 5);

	}

}
