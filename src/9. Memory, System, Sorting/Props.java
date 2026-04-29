/* 
	Props.java
	Last modified by j.finn: 4-Apr-2026
	The java System properties are like the environment
	but refer to properties of the java runtime
 */

import java.util.Properties;
import java.util.Set;
// 컴퓨터(자바 환경)의 설정값들을 전부 출력하는 코드.
public class Props {
    public static void main (String[] args) {
		Properties m = System.getProperties();
		
		System.out.println("\nThe whole property list:");
		Set<String> keys = m.stringPropertyNames();
		for (String s: keys)		// iterate over all properties
			System.out.println(s + " : " + m.getProperty(s));
	}
}