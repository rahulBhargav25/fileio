package fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream stream = null;
		
		try {
			stream = new FileInputStream("fnle");
			int data = stream.read();
			while((data = stream.read()) != -1) {
				System.out.println(data);
			}
			System.out.println(data);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(stream != null) {
				try {
					stream.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

