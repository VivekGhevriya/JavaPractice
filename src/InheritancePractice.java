class Cal{
    protected String x;
    public int add(int a,int b){
        return a+b;
    }
    public static void print(){
        System.out.println("hello");
    }
//    Cal(){
//        System.out.println("Cal default constructor");

//    }
    Cal(int a){
        System.out.println("This is Prameterised con"+ a);
    }
}
class CalAdv {
    public int Sub(int a, int b){
        return a-b;
    }

    CalAdv(){



    }

}


public class InheritancePractice {

    public static void main(String[] args) {
        CalAdv obj1 = new CalAdv();
        obj1.x="vvk";



    }
}
