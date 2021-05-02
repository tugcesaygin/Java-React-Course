package inheritance2;

public class FilerLogger extends Logger{    //inherit ettik hepsini miras aldik (kalitim)


		@Override          // kedi kodumu kullanabilmek icin base deki kodu eziyorum demek
		public void log() {
			System.out.println("File logged");

		}


}
