package day11;

public class GenericMethodTest {

	public static <T> T function(T data) {
		T result=null;
		if(data instanceof Integer) {
			result = (T)"����";
			
		}else if(data instanceof Double || data instanceof Float) {
			result = (T)"�Ǽ�";
			
		}else if(data instanceof Character) {
			result = (T)"����";
			
		}else if(data instanceof String) {
			result = (T)"���ڿ�";
			
		}
		
		return result;
		
	}
	
}
