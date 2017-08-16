package com.magenta_cloud;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

public class For_Arg_Magenta_Cloud {

    private static final String PATH = "https://webdav.magentacloud.de/";



    public static void main(String[] args) throws IOException {

        //Sardine sardine =SardineFactory.begin();
        Sardine sardine = SardineFactory.begin("dropboxbtest@gmail.com", "BAPONsikder1@");
        System.out.println("\n \t***Successfully Logged in Magenta Cloud :)***\n");


        /**FILE upload code*/
        
        for (String er: args) {
        	

            File file = new File(er);
            InputStream myInputStream = new FileInputStream(file);
            System.out.print("Uploading Reqest is Starting. ");
            String filename = file.getName();
            System.out.println("Uploading... :"+filename);

            sardine.put(PATH + filename, myInputStream);


            //System.out.println("Successfully Uploded: "+filename);
            //System.out.println("Successfully Uploded: " + file.getName() + " \nUploaded content directory: " + file.getAbsolutePath()  );
            System.out.println("Successfully Uploded content directory: " + file.getAbsolutePath()  );
            System.out.println("----------------------------------------------------------------------------------------");
        
        }




        ArrayList < DavResource > res = new ArrayList < DavResource > ();
        res = (ArrayList < DavResource > ) sardine.list(PATH);
        System.out.println("Server contents:");
        System.out.println("----------------");
        for (DavResource dr: res) {
            System.out.println(dr);
        }



    }

}