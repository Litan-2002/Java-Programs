class sample2 {
    double sum(double num1 ,double num2 ){
        double res = num1 +num2;
        return res;
    }
}

class method{
    public static void main(String args[]){
        sample2 s =new sample2();
        double x=s.sum(10,12.5);
        System.out.println("sumof the rwo numbers is ="+x);
    }
} 


    

