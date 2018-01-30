package sure;

import java.util.ArrayList;
import java.util.List;

public class Newclass 
{

}
class Secondclass extends Newclass
{
	void listExample() {
		List<String> obj = new ArrayList();
		obj.add("a");
		
		for(String x:obj)
			System.out.println(x);
	}
}