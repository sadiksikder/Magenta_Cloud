package com.magenta_cloud;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;


public class Netcologne_upload {
	
	private static final String PATH = "https://comcenter.netcologne.de/drive/";
	//private static final String PATH = "https://sync.comcenter.netcologne.de/caldav/31";
	//private static final String PATH = "https://comcenter.netcologne.de/servlet/webdav.infostore/";
	public static void main(String[] args) throws IOException {
		//sardine = SardineFactory.begin(USERNAME, PASSWORD);
		 Sardine sardine = SardineFactory.begin("nc-zafacosu3","H4USRF");
		 System.out.println("\n \t***Login Successfull***");
		 
	//sardine.put(PATH+"b.txt","b".getBytes());
		// sardine.
           System.out.print("\t - directory descriptions which files are in Web-Server -\n");
	          ArrayList<DavResource> res = new ArrayList<DavResource>();
	          res = (ArrayList<DavResource>) sardine.list(PATH);
	            for(DavResource dr : res){
	                System.out.println(dr);
	            }
	            //said forbidden
	            //sardine.createDirectory(PATH+ "SADIK.jpg");
	            
	            
	            
	        /*InputStream is = sardine.get(PATH+"sikder_samsuddin.jpg");
				 System.out.println("-Downloading...");
				 File file = new File("C:\\Users\\Sadik\\Downloads\\sikder_samsuddin.jpg");
				 OutputStream os = new FileOutputStream(file);
				 int len; byte buf[] = new byte[1024]; 
				 while((len=is.read(buf))>0) os.write(buf,0,len); 
				 os.close(); is.close();
				 System.out.println("Successfully Downloaded");*/

	}

}
