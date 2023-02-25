package day13;
class AA {};
class AAA extends AA{};
public class TypeCasting {
    public static void main(String[] args) {
        byte num1 = 7;
        int a = num1; // Widening Casting
        byte num2 = (byte) a; // Narrowing Casting

        // Child Obj
        AA obj = new AA();

        // Parent Obj
        AA aaa = obj; // Up Casting
        AA ob2 = (AA) aaa; // Down Casting
    }
}