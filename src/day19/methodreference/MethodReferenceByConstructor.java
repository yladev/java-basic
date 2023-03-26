package day19.methodreference;
interface MessageAble{
    void doIt();
}
class Message{
    Message(){
        System.out.println("Hello Everyone, Nice to meet you!");
    }
}
public class MethodReferenceByConstructor {
    public static void main(String[] args) {
        MessageAble obj = Message::new;
        obj.doIt();
    }
}