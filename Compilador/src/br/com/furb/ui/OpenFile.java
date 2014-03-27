package br.com.furb.ui;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;


public class OpenFile {
	public String OpenFilePanel() {
		String filePath;
		JFileChooser file = new JFileChooser();
		file.setCurrentDirectory(new File("C:\\"));
		file.setFileSelectionMode(JFileChooser.FILES_ONLY);
		
		if (file.showOpenDialog(file) == JFileChooser.APPROVE_OPTION) {
			filePath = file.getSelectedFile().getPath();
		} else {
			filePath = "";
		}
		 return filePath;
	}
	
	public String textFileRead(String filePath){
		String text="";
		BufferedReader br = null;
		try {
			
			br = new BufferedReader(new FileReader(filePath));  
            while(br.ready()){  
                text+= br.readLine() +"\n";  
                
            }  
            br.close();  
        }catch(IOException ioe){  
            ioe.printStackTrace();
            text= "";
            
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return text;
		
	}
}
