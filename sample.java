public class sample {
    private double num1, num2;
    sample (double x, double y){
        num1 =x;
        num2=y;
    }
    double sum(){
        double res=num1+num2;
        return res;

    }   
}
class methods{
    public static void main(String args[]){
        sample s= new sample(10,12.5);
        double x=s.sum();
        System.out.println("sum="+x );
    }
}
