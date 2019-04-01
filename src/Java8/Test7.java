package Java8;




interface Messageable{
    void getMessage(int msg);
}
class Message{
    Message(int msg){
        System.out.print(msg);
    }
}
public class Test7 {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage(123);
    }
}