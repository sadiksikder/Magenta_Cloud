import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;




public class Sciebo_Upload {
	
		
		private static final String PATH = "https://th-koeln.sciebo.de/remote.php/webdav/";
		public static void main(String[] args) {
		
		//sardine = SardineFactory.begin(USERNAME, PASSWORD);
		 Sardine sardine = SardineFactory.begin("ssikder@th-koeln.de","BAPONsikder1@");
		 System.out.println("\n \t***Login Successfull***");
		
		
		 
		 
		 try{
			 
			 	/**FILE upload code*/
	           //InputStream myInputStream = new FileInputStream(new File("C:\\Users\\Samsuddin\\Desktop\\sikder_samsuddin.jpg"));
	            InputStream myInputStream = new FileInputStream(new File("C:\\Users\\Samsuddin\\Desktop\\sikder_samsuddin.jpg"));
	            sardine.put(PATH+"sikder_samsuddin.jpg",myInputStream);  
	           
	            //sardine.put(PATH+"b.txt","b".getBytes());
	            //sardine.delete(PATH+ "SADIK.jpg");
	            
	            System.out.println("\tUpload Successfull"); 
	             System.out.print("\t - directory descriptions which files are in Web-Server -\n");
		          ArrayList<DavResource> res = new ArrayList<DavResource>();
		          res = (ArrayList<DavResource>) sardine.list(PATH);
		            for(DavResource dr : res){
		                System.out.println(dr);
		            }
		            
	            
			 	/** Content Download*/
			 /*
			 InputStream is = sardine.get(PATH+"sikder_samsuddin.jpg");
			 System.out.println("-Downloading...");
			 File file = new File("C:\\Users\\Sadik\\Downloads\\sikder_samsuddin.jpg");
			 OutputStream os = new FileOutputStream(file);
			 int len; byte buf[] = new byte[1024]; 
			 while((len=is.read(buf))>0) os.write(buf,0,len); 
			 os.close(); is.close();
			 System.out.println("Successfully Downloaded");  */
	           } 
		 catch (IOException e) {
	            e.printStackTrace();
	        }
		 
		 
		
	
	}

}
