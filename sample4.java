public class sample4 {
    static int x=5;
    int y=67;
    static void access(){
        System.out.println("x="+x);
    }
    void empty(){
        System.out.println("y="+y);   
    }
    
}
    class demo1{
        public static void  main(String args[]){
            sample4 s=new sample4();
             sample4.access();
             s.empty();


        }
    }
