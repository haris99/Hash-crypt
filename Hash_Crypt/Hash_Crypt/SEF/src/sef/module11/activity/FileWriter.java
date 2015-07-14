package sef.module11.activity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class FileWriter {

	public static void main(String args[]) {
		PrintWriter writer;
		boolean done = false;
		Scanner scanIn = new Scanner(System.in);
		  
		try {
			writer = new PrintWriter(
					"C:\\SEF - Participants Workspace\\Hash_Crypt\\Hash_Crypt\\SEF\\bin\\sef\\module11\\activity\\"
							+ args[0],
					"UTF-8");
			while (!done) {
				System.out.println("Input text ");
				String s = scanIn.nextLine();
				System.out.println("Input:"+s+"/");
				writer.println(s);
				if (s.equals("END")) {
					writer.close();
					done = true;
					scanIn.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
