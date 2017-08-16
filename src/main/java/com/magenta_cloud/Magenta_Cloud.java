package com.magenta_cloud;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import com.github.sardine.DavResource;


public class Magenta_Cloud {
	private static final String PATH = "https://webdav.magentacloud.de/";
	public static void main(String[] args) throws IOException {
		Sardine sardine = SardineFactory.begin("dropboxbtest@gmail.com","BAPONsikder1@");
		 System.out.println("\n \t***Login Successfull***");
		 
		 /**FILE upload code*/
		 
		 String home = System.getProperty("user.home"); 
		// File file = new File(home+"//Downloads//sikder_samsuddin.jpg");
		 File file = new File(args[0]);
		 //File file = new File("C:\\Users\\ssikder\\Downloads\\sikder_samsuddin.jpg");
         InputStream myInputStream = new FileInputStream(file);
         //InputStream myInputStream = new FileInputStream(new File("H:\\Encoder_en.exe"));
         System.out.println("uploading reqest is starting...\n \n\tUploading....");
         sardine.put(PATH+"/sikder_samsuddin.jpg",myInputStream);
         //sardine.put(PATH+"/Encoder_en.exe",myInputStream);
        
         System.out.println("\n \t***Upload  Successfull***\n");
         System.out.println("Uploaded file(s): "+file.getName()+" \nUploaded content directory: "+file.getAbsolutePath());
        
         
         ArrayList<DavResource> res = new ArrayList<DavResource>();
         res = (ArrayList<DavResource>) sardine.list(PATH);
         System.out.println("Server contents:");
         System.out.println("-------------------------------------");
         for(DavResource dr : res){
        	 
             System.out.println(dr);
         	}

	}

}
