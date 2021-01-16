public class litan7 {
    //inheritance programms (4)
    litan7(){
        System.out.println("one");
    }
}
class three extends litan7{
    three(){
        System.out.println("two");
    }
}
class super1 {
    public static void main(String args []){
        three l  =new three();
    }
}