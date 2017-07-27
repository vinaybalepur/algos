package serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * De
 * @author vinay
 *
 */
public class DeserializeIsARelation 
{
	
	public static void main(String[] args) {
		FileInputStream f;
		Mercedes e = null;
		try 
		{
			f = new FileInputStream(new File("/tmp/mercedes.ser"));
			ObjectInputStream o = new ObjectInputStream(f);
			e = (Mercedes) o.readObject();
			o.close();
		} catch (IOException i) {
				// TODO Auto-generated catch block
				i.printStackTrace();
		}catch(ClassNotFoundException c)
		{
				c.printStackTrace();
		}
		
		e.iAmSpecial();
		System.out.println(e.getName());
		
		
	}

}
