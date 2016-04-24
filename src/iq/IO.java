package iq;

import java.io.*;
import java.util.Arrays;

public class IO {
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			
//			while ( !(line = br.readLine()).equals("") ){
			while ( !((line = br.readLine()) == null)){
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
