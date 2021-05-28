## Encapsulation
<li>It means hiding some sensitive data.</li>

<li>To Achieve this we must declare class,variable and attributes as a <b>Private</b>
     Modifier,which means only same class will have access to all the class members.</li>

<li>We can create  public <b><i>GET and SET</i></b> method which will allow to access variables to other class</li>
<br>
<br>




## Getters and Setters
<br>

<li><b><i>GET and SET</i></b> are special kind of method which we can use to control the access of other programmer.</li>
<li>Get will return the variable value while SET will not return any value it's allow to set the new value.</li>



    public GettersAndSetters(String title, String director, double rating){
        private this.title=title;
        private this.director=director;
        private this.rating=rating;
    }

    public String getTitle(){
        return this.title=title;
    }
    public void setTitle(){
        this.title=title;
    }//

<h4>Why we need Getters and setters</h4>

<li>By using getter and setter, the programmer can control how their important variables are accessed and updated in the 
proper manner, such as changing the value of a variable within a specified range.</li>
<br>
<h5>getter and setters are also called as accessor and mutator</h5>

## Getters and Setters in Array and List and use of clone()


## Enumerations(enum)

<li>when we already know the value and values are final at that time we can use enum</li>
<li>Enum are special type of class can be created by typing
enum  </li>

        enum Level{
         HIGH,MEDIUM,LOW;}
and it's value can be access by Level.HIGH (name.value)

We can run for/foreach loop through enum as well

        for (Level str:Level.values()) {
            System.out.println(str);
        }
We can also se switch/case in enum


        Level  myvar = obj1.size;
            switch (myvar){
                case HIGH:
                    System.out.println("Value is High");
                    break;
                case LOW:
                    System.out.println("Valie is Low");
            }

We can add variables and method inside enum class but cannot create objects.


## Polymorphism

Method Overloading


<h3>Constructor Overloading</h3>

When we have a more than one constructor in same class it's called 
overloading. but the arguments must be differ from each other.
We can call constructor inside another constructor within same class.


        public ConstrutorOverloading(String employeeName, int salary, String employeeId, Department dep) {
        this(employeeName, employeeId, salary);
        this.dep = dep;
    }

    public ConstrutorOverloading(String employeeName, String employeeId, int salary) {
        this(employeeName, employeeId);
        this.salary = salary;
    }

    public ConstrutorOverloading(String employeeName, String employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

We must use this() while referring constructor.
##this(para.) must be the first line in constructor.
we can only refe to the same class constructor.


## Inheritance
When one class acquire all the properties from another class ,it's called 
inheritance.

We can only inheritate public and protected properties.

We can access Private properties.

The class which inherits the other class called SUB CLASS(child class),
and the class whose properties called SUPER CLASS(Parent class).

When we use inheritance we have to use extends word.
See below example




    class Cal{
    public int add(int a,int b){
      return a+b;
    }
    }
    class calAdv extends Cal{
    public int Sub(int a, int b){
    return a-b;
    }
    }
    public class InheritancePractice {

    public static void main(String[] args) {
        calAdv obj1 = new calAdv();
        System.out.println(obj1.add(5, 2));
        System.out.println(obj1.Sub(5, 2));
        }
    }

Here,class calAdv is a subclass of the Cal.Cal is the superclass.

we have to create an object of the Subclass which is calAdv.

When we create an object of the subclass we are also calling  default Construcor of the superclass.

To invoke the SuperClass Constructor inside of the Subclass we can use the 

<b><i>SUPER()</b></i>  keyword  and can pass the parameters.

