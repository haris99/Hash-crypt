import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Cypher {

	public static ArrayList<String> encrypt(File file, int key) {
		String oldString = "";
		FileInputStream fstream = null;
		BufferedReader br = null;
		ArrayList<String> listOfLines = new ArrayList<String>();
		try {
			fstream = new FileInputStream(file);
			br = new BufferedReader(new InputStreamReader(fstream));
			while ((oldString = br.readLine()) != null) {
				String newString = "";
				char arr[] = oldString.toCharArray();
				for (char c : arr) {
					int intValue = (int) (Integer.valueOf(c) + key);
					if (intValue > 126)
					{
						intValue = intValue - 126 + 33;
					}
					if (intValue < 33)
					{
						intValue = intValue + 126 - 33;
					}
					c = (char) (int) (Integer.valueOf(c) + key);
					newString = newString + String.valueOf(c);
				}
				listOfLines.add(newString);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOfLines;
	}
	
	public static File createNewFile (ArrayList<String> listOfLines, String fileName){
		PrintWriter  writer;
		
		File file=null;
		try {
			file = new File("c://Eclipse//SEF//SEF//src//files//encrypted//"+fileName+".txt");
			writer = new PrintWriter(file, "UTF-8");
			writer.write("");
			for (String str: listOfLines){
				writer.println(str);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}
	
	public static boolean checkEncrypt (File oldFile,File newFile, int key){
		ArrayList<String> listOfFile = encrypt (newFile, -key);

		Scanner s;
		ArrayList<String> list=new ArrayList<String>();
		try {
			s = new Scanner(oldFile);
			while (s.hasNext()){
			    list.add(s.nextLine());
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String str:listOfFile){
		System.out.println (str);
	}
	for (String str:list){
		System.out.println (str);
	}
	
		if (list.equals(listOfFile)){
			return true;
		} else
		{
		return false;
		}
	}
	
	  public static File[] finder( String dirName){
	    	File dir = new File(dirName);

	    	return dir.listFiles(new FilenameFilter() { 
	    	         public boolean accept(File dir, String filename)
	    	              { return filename.endsWith(".txt"); }
	    	} );

	    }
	
	public static void main(String[] args) {
		int key = 3;
		/*ArrayList<String> listOfLines = encrypt(new File("C:\\Eclipse\\SEF\\SEF\\src\\files\\file.txt"), key);
		File file = createNewFile (listOfLines, "file2");
		if (checkEncrypt (new File("C:\\Eclipse\\SEF\\SEF\\src\\files\\file.txt"), file, key)){
			System.out.println("Encryption succesful");
		}else
		{
			System.out.println("Encryption failed");
		}
		*/
		File[] files = finder("C:\\Eclipse\\SEF\\SEF\\src\\files");
		for (File file:files){
			ArrayList<String> listOfLines = encrypt(file, key);
			File newFile = createNewFile (listOfLines, file.getName()+"-encrypted");
			if (checkEncrypt (file, newFile, key)){
				System.out.println("Encryption succesful");
			}else
			{
				System.out.println("Encryption failed");
			}
		}
		/*int guessKey;
		boolean finished = false;
		System.out.println(newString);
		String Cypher = newString;
		while (finished == false) {
			newString = Cypher;
			System.out.println("Input cypher");
			guessKey = sc.nextInt();
			char arr[] = newString.toCharArray(); // convert the String object
													// to array of char
			// iterate over the array using the for-each loop.
			newString = "";
			for (char c : arr) {
				c = (char) (int) (Integer.valueOf(c) - guessKey);
				newString = newString + String.valueOf(c);
			}
			System.out.println(newString);
		}
		// Close the input stream
		try {
			br.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
