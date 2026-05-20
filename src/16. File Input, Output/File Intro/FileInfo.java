/*
	FileInfo.java
	Last modified by j.finn: 10-May-2026
	Demo methods in the File class
 */
import java.io.File;

public class FileInfo
{  
    public static void main(String [] args)
    {
    	File f = new File("ifile.txt");
    	System.out.println("ifile.txt information:");
    	System.out.println("Name: " + f.getName());
    	System.out.println("Exists: " + f.exists());
    	System.out.println("Is normal file: " + f.isFile());
    	System.out.println("Is directory: " + f.isDirectory());
    	System.out.println("Executable: " + f.canExecute());
    	System.out.println("Readable: " + f.canRead());
    	System.out.println("Writeable: " + f.canWrite());
    	System.out.println("Full path: " + f.getAbsolutePath());
    	System.out.println("Size in bytes: " + f.length());
    }
 }
 