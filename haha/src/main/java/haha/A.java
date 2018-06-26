package haha;

import java.io.UnsupportedEncodingException;

import com.alibaba.fastjson.JSON;

import hehe.B;
public class A {

	public static void main(String[] args) throws Exception {
		System.out.println(System.currentTimeMillis());
			System.out.println("1529840696000");
		
	}
	
	 private static byte[] BinstrToIntArray(String binStr) {  
	        char[] temp = binStr.toCharArray();  
	        byte[] result = new byte[temp.length];  
	        for (int i = 0; i < temp.length; i++) {  
	            result[i] = (byte) (temp[i] - 48);  
	        }  
	        return result;  
	    }  
}
