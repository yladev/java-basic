package jdc.You_Tube;

public class SameNameMethods {

    public static void main(String[] args) {

        Paper paper = new Paper();
        takeNote("This is java",paper);
        System.out.println(paper.message);

        NoteBook noteBook = new NoteBook();
        takeNote("This is noteBook",noteBook);
        System.out.println(noteBook.message);



    }

    static void takeNote(String message, Paper paper) {
        paper.message = message;
    }

    static void takeNote(String message, NoteBook noteBook){
        noteBook.message = message;
    }




}



//create Paper class
class Paper {
    String message;
}

//create NoteBook class
class NoteBook {
    String message;
}

