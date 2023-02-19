package day12.Interface;

public interface Workable {
    void doIt();
}

class exampleInterface implements Workable{
    @Override
    public void doIt() {
        System.out.println("This is doIT");
    }
    public static void main(String[] args) {
        exampleInterface e = new exampleInterface();
        e.doIt();
    }
}