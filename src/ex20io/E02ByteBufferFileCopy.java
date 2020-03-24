package ex20io;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 1바이틋힉 읽어서 저장하는 것보다 1024바이트씩 읽을 수 잇는 
 버퍼를 이용하므로 복사속도가 빨.
 */


public class E02ByteBufferFileCopy {

	public static void main(String[] args) {

		try {
			InputStream in = new FileInputStream
					("src/ex20io/A38Http2.zip");
			OutputStream out = new FileOutputStream
					("src/ex20io/A38Http2_copy2.zip");

			int copyByte = 0;
			int readLen;

			/*
			 1Kbyte씩 읽어서 저장하기 위한 버퍼 생성
			 */
			byte buffer[] = new byte[1024];

			while(true) {
				readLen = in.read(buffer);
				if(readLen==-1) {
					break;
				}
				out.write(buffer, 0, readLen); 
				copyByte += readLen;
			}
			if(in!=null) in.close();
			if(out!=null) out.close();

			System.out.println("복사된 파일크기:" + copyByte + "byte");
			System.out.println("복사된 파일크기:" + (copyByte/1024) + "Kbyte");
			System.out.println("복사된 파일크기:" + (copyByte/(1024*1024)) + "Mbyte");
		}

		catch(FileNotFoundException e) {
			System.out.println("파일이 없ㅅ흡니다.");
		}
		catch(IOException e) {
			System.out.println("IO작업중 예외");
		}
		catch(Exception e) {
			System.out.println("알수없는 예외");
		}
	}

}
