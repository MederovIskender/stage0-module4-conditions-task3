package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        checkLayout(symbol);
    }

    public static void checkLayout(char character) {
        if (isEnglish(character)) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
        public static boolean isEnglish ( char character){
            String englishLayout = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
            return englishLayout.indexOf(character) != -1;
        }

}
