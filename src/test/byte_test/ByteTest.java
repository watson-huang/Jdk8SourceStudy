package byte_test;

public class ByteTest {
    public static void main(String[] args) {
        byte b = (byte)277;
        /**
         * Java中byte类型占用8位（1字节），取值范围是-128到127。
         * 当一个超过byte范围的整数被强制转换为byte时，实际上只保留了该整数的低8位。
         * 277的二进制表示为 100010101，低8位是 00010101，对应的十进制值是21。因此，(byte)277 的结果是21。
         */
        System.out.println("byte: "+b);
        System.out.println("extend: "+(277-Byte.MAX_VALUE));
    }
}
