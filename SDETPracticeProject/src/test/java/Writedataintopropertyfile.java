import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writedataintopropertyfile {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Commondata.properties");
		Properties pObj=new Properties();
		pObj.setProperty("browser", "Chrome");
		pObj.setProperty("url", "http://localhost:8888");
		pObj.setProperty("username", "admin");
		pObj.setProperty("password", "admin");
		
		FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\Commondata.properties");
		pObj.store(fout,"data");
		
	}

}
