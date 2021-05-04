package interfaces;

public class Utils {

	public static void runLoggers(Logger[] loggers , String message) {
		
		for (Logger logger : loggers) {
			logger.log(message);
		}
		
		
	}
}

//bir classi static yapamayiz ama inner classlarda yapabilirz.   neden her seyi static yapamayiz ogren?????