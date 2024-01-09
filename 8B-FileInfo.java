import java.io.*;
public class FileInfo{
	public static void main(String args[]) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n Enter a file name:");
		String fname=br.readLine();
		File f=new File(fname);
		String result=f.exists()?"exists":"doesn't exists";
		System.out.println("\n The given file"+result);
		if(f.exists()){
			result=f.canRead()?"Readable":"Not readable";
			System.out.println("\n The file is"+result);
			result=f.canWrite()?"Writeable":"not writeable";
			System.out.println("\n The file is"+result);
			if(fname.endsWith(".jpg")||fname.endsWith(".png")||fname.endsWith(".gif")){
				System.out.println("\n The given file is image file");
			}
			else if(fname.endsWith(".exe")){
				System.out.println("\n The given file is executable file");
			}
			else if(fname.endsWith(".txt")){
				System.out.println("\n The given file is text file");
			}
			else{
				System.out.println("\nUnknown File type");
			}
		}
	}
}
