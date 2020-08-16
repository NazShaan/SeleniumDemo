import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) 
	{

		try {
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(new File("C:\\Users\\shahe\\OneDrive\\Documents\\sample.properties"));
			prop.load(fis);
		String key1 =	prop.getProperty("db.host");
		System.out.println(key1);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(" file exception executed");
		}
		

	}

}
