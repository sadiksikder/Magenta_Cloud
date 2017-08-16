package com.magenta_cloud;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;


public class Sciebo_Download {
	
	private static final String PATH = "https://th-koeln.sciebo.de/remote.php/webdav/";
	
	public static void main(String[] args) throws IOException {
		 Sardine sardine = SardineFactory.begin("ssikder@th-koeln.de","BAPONsikder1@");
		 System.out.println("\n \t***Login Successfull***");
		 
		 /** Content Dowload*/
		 InputStream is = sardine.get(PATH+"sikder_samsuddin.jpg");
		 File file = new File("C:\\Users\\Samsuddin\\Downloads\\sikder_samsuddin.jpg");
		 System.out.println("\n Downloading....");
		 OutputStream os = new FileOutputStream(file);
		 int len;
		 byte buf[] = new byte[1024];
		 while((len = is.read(buf))>0) os.write(buf, 0, len);
		 is.close(); os.close();
		 
		 System.out.println(" ************************************************************************\n");
		 System.out.println("Downloaded");
		 System.out.println("-file path:C:\\Users\\Samsuddin\\Downloads ");
		 System.out.println(" ************************************************************************");
	}

}
