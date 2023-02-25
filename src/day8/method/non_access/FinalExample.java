package day8.method.non_access;

public class FinalExample {
    // doesn't change2
    void ok(){
        System.out.println("OK");
    }
    public static void main(String[] args) {
        final int a;
        a = 7;
    }
}
class NoFinal extends FinalExample{
    @Override
    void ok() {
        super.ok();
    }
}