package inheritance2;

public class LogManager {

	public void log(int logType) {
		if(logType ==1) {
			System.out.println("Logged in Database");
		}
		else if(logType==2){
			System.out.println("Logged in File");
		}
		else {
			System.out.println("Logged in Email");
		}
	}
}


//1.Database
//2.File
//3.Email