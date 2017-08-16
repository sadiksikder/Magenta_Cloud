package com.magenta_cloud;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

public class Upload_1und1 {
	private static final String PATH = "https://webdav.office.1und1.de/";
	//private static final String PATH = "https://cloud.1und1.de/";
	
	public static void main(String[] args) throws IOException {
		
		
		
		Sardine sardine = SardineFactory.begin("zacloud@online.de","a1s2d3f4");
		 System.out.println("\n \t***Login Successfull***");
		 
		 /**FILE upload code*/
		 
		 String home = System.getProperty("user.home"); 
		 File file = new File(home+"//Downloads//apache-maven-3.5.0-bin.zip");
		// File file = new File(args[0]);
		 //File file = new File("C:\\Users\\ssikder\\Downloads\\sikder_samsuddin.jpg");
         InputStream myInputStream = new FileInputStream(file);
         //InputStream myInputStream = new FileInputStream(new File("H:\\Encoder_en.exe"));
         System.out.println("uploading reqest is starting...\n \n\tUploading....");
         sardine.put(PATH+"/apache-maven-3.5.0-bin.zip",myInputStream);
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
