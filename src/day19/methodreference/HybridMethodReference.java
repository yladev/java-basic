package day19.methodreference;
interface Addition{
    int add(int a, int b);
}
public class HybridMethodReference {
    int addition(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Addition objAdd = new HybridMethodReference()::addition;
        System.out.println(objAdd.add(4, 9));
    }
}