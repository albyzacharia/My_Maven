package exceptions;

import java.io.IOException;

public class CheckedThrows {
	public static void display() throws IOException
	{
		throw new IOException("Exception  ");
	}

	public static void main(String[] args) {
		
		try {
			CheckedThrows.display();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
