public class Main {

    public static void main(String[] args) {
        String[] book = new String[10];
        book[0] = "«Война́ и мир» (рус. дореф. «Война и миръ»)";
        book[1] = "— роман-эпопея Льва Николаевича Толстого,";
        book[2] = "описывающий русское общество в эпоху войн";
        book[3] = "описывающий русское общество в эпоху войн";
        book[4] = "против Наполеона в 1805—1812 годах.";
        book[5] = "против Наполеона в 1805—1812 годах.";
        checkBookDoublet(book);
        System.out.println();
        System.out.println(printFullText(book));
    }

    public static void checkBookDoublet(String book[]){
        for (String voina : book
        )
            for (int i = 0; i < book.length; i++) {

                for (int j = 1; j < book.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (book[i] == book[j]) {
                        book[i] = null;
                    }
                }
            }


    }
    public static String printFullText(String[] book1){
        String fullText="";
        for (int i = 0; i < book1.length ; i++) {
            if (book1[i]==null){continue;}
            fullText+=book1[i];

        }return fullText;
    }
}