package com.magenta_cloud;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

public class D_Down_Magenta {
	
	private static final String PATH = "https://webdav.magentacloud.de/";
	
	public static void main(String[] args) throws IOException {
		Sardine sardine = SardineFactory.begin("dropboxbtest@gmail.com", "BAPONsikder1@"); 
		System.out.println("\n \t***Login Successfull***");
		ArrayList<DavResource> res = new ArrayList<DavResource>();
		System.out.println("Server contents:");
        System.out.println("-------------------------------------");
    	res = (ArrayList<DavResource>) sardine.list(PATH);
        for(DavResource dr : res){
            System.out.println(dr);
        	}
		
		/*Scanner name = new Scanner(System.in);
		System.out.println("\nwrite file name with format to DOWNLOAD and then press ENTER");
		String filename = name.nextLine();
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;*/
		 
        //InputStream is = sardine.get(PATH+"sikder_samsuddin.jpg");
        InputStream is = sardine.get(PATH+"test.txt");
		//InputStream is = sardine.get(PATH+"jdk"+ext);
		
		 System.out.println(is);
		 System.out.println("-Downloading...");
		 
		 
		 String home = System.getProperty("user.home"); 
		 File file = new File(home+"//Downloads//"+"test.txt");
		 //File file = new File("C:\\Users\\Samsuddin\\Downloads\\" +dateFormat.format(date) +ext);
		 //File file = new File("C:\\Users\\Samsuddin\\Downloads\\sikder_samsuddin.jpg");
		 //File file = new File("C:\\Users\\Samsuddin\\Downloads\\test.txt");
		 //System.out.println("-File Path: C:\\Users\\Samsuddin\\Downloads\\" +dateFormat.format(date) +ext );
		 //System.out.println("-File Path: "C:\\Users\\Samsuddin\\Downloads\\filename" );
		 OutputStream os = new FileOutputStream(file);
		 int len; byte buf[] = new byte[1024]; 
		 while((len=is.read(buf))>0) os.write(buf,0,len); 
		 os.close(); is.close();
		 System.out.println("Successfully Downloaded");
		 System.out.println("download path: "+file.getAbsolutePath());
		 //SardineUtil mySardineUtil = SardineUtil;
		

	}

}
