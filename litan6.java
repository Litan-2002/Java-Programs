public class litan6 {
    //inheritance programms (3)
    int id =10;
    void show (){
        System.out.println("id value is"+id);
    }
}
class two extends litan6{
    int id =20;
    void show(){
        System.out.println("id value is="+id);
    super.show();
    System.out.println("id value is="+super.id);
    }
}
class sub{
    public static void main(String args[]){
        two t=new two();
        t.show();
    }
}
