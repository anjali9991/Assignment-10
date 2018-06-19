import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileTransfer {
	public static void transfer() throws IOException
	{
		File f=new File("C:\\Users\\Anjali\\Desktop\\assignments\\abc.txt");
		File transferfile=new File("C:\\Users\\Anjali\\Desktop\\assignments\\xyz.txt");
		FileInputStream fin=new FileInputStream(f);
		FileOutputStream fout=new FileOutputStream(transferfile);
		try
		{
			int c;
			while((c=fin.read())!=-1)
			{
				fout.write((char)c);
			}
			FileInputStream finn=new FileInputStream(transferfile);
			int m;
			while((m=finn.read())!=-1)
			{
				System.out.print((char)m);
			}
			finn.close();
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
		finally
		{
			fin.close();
			fout.close();
		}
	}
public static void main(String[] args)throws IOException
{
	transfer();
}
}
