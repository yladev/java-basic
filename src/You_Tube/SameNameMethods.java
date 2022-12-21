package You_Tube;

public class SameNameMethods {
    public static void main(String[] args) {

        Paper paper = new Paper();
        takeNote("this is java", paper);
        System.out.println(paper.message);

        NoteBook notebook = new NoteBook();
        takeNote("I am yla", notebook);
        System.out.println(notebook.message);


    }

    static void takeNote(String message, Paper paper){
        paper.message = message;
    }

    static void takeNote(String message, NoteBook notebook){
        notebook.message = message;



    }
}

class Paper{
    String message;
}

class NoteBook{
    String message;
}
