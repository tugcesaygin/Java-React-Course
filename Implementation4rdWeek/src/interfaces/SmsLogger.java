package interfaces;

public class SmsLogger implements Logger{ // implemente etmek logger i smslogger a uyarla demek gerekli olan kodlaeri yaz 


	@Override
	public void log(String message) {
		
		System.out.println("SMS Logged: " +message);
		
	}  
	
}
