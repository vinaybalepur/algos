package serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeIsARelation 
{

	
	public static void main(String[] args) {
		Mercedes e = new Mercedes(4, "AS400");
		FileOutputStream f= null;
		try {
			f = new FileOutputStream(new File("/tmp/mercedes.ser"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(e);
			o.flush();
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
