package serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/** 
 * @author vinay
 *
 */
public class Serialize 
{
	
	public static void main(String[] args) {
		Employee e = new Employee("Vinay", 32);
		FileOutputStream f= null;
		try {
			f = new FileOutputStream(new File("/tmp/employee.ser"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(e);
			o.close();
			f.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

}
