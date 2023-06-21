package com.cn.IOstreamDemo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Reader;

public class IostreamDemo {
	public static void main(String[] args) {
		try {
			BufferedOutputStream outfile=new BufferedOutputStream(new FileOutputStream("Input.txt"));
			BufferedOutputStream infile=new BufferedOutputStream(new FileOutputStream("Input.txt"));
			Reader readfile=new FileReader("ReadFrom.txt");
			Reader writefile=new FileReader("Writeto.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
