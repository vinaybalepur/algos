package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * This class should be called after serialization. This is used to deseriazlize the serialized class.
 * The object output stream class has readobject method, which reads the data of the file and converts
 * this data to object. We can use this object to perform operations.
 * @author vinay
 *
 */
public class Deserialize 
{
	
	public static void main(String[] args) {
		FileInputStream f;
		Employee e = null;
		try 
		{
			f = new FileInputStream(new File("/tmp/employee.ser"));
			ObjectInputStream o = new ObjectInputStream(f);
			e = (Employee) o.readObject();
			o.close();
		} catch (IOException i) {
				// TODO Auto-generated catch block
				i.printStackTrace();
		}catch(ClassNotFoundException c)
		{
				c.printStackTrace();
		}
		
		System.out.println(e.getAge());
		System.out.println(e.getName());
		Employee.getMessage();
		e.test1();
		
	}

}
