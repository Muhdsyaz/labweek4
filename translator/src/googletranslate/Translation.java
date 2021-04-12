package googletranslate;

public class Translation {

	String [][] words = {{"Good morning","Selamat Pagi" , "الخير صباح", "좋은 아침"},
						{"Good night", "Selamat malam", "مساؤك طاب", "안녕히 주무세요"},
						{"How are you?", "Apa khabar?", "حالك؟ كيف", "어떻게 지내세요?"},
						{"Thank you","Terima kasih","لك شكرا","감사합니다"},
						{"Goodbye","Selamat tinggal","السالمة مع","안녕"},
						{"What's up?","Ada apa?","أخبارك؟ ما","뭐야?"}};
	

	public String Translate(String text) {
		
		String translated = "" ;
		for(int i = 0;i<words.length;i++) {
			if(words[i][0].equalsIgnoreCase(text)) {
				System.out.print("jumpa");
				for(String word: words[i]) {
					
					translated += word+".";
				
				}
				break;
			}
			
		}
		System.out.print("tak jumpa");
		return translated;
	}
}