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

<div><p  style=color="red">We can access Private properties.</p></div>

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

## Packages

Packages is a collection of similar type of java entities which can be classes , subclass or interface..etc


It gives unique name of the class,we can't have same name class in same package.

Package name will be in small-letters.

Package name should be reverse order of the public identity(Domain name).
  
    //ibm.com is the public identity so package name could ne 
    com.ibm

## Package must be in first line.

    package io.pragra.employee;

    public class Person {
    }

## Why we need packages

1. Easy to Locate 
2. Avoid naming conflicts.
3. Controlled the access.
4. Reuse the class.

## Two type of Packages
1.User-Defined
2.Built-in(java.util,java.lan,java.io)

We can sub-package in Java and will be treated as  another package.

Now we can learn about access modifier

<table >
<tr style="background-color:grey">
<th>
  </th>
<th>Public</th><th>Private</th><th>Protected</th><th>Default</th></tr>
<tr style="background-color:darkgrey"><th>Same class</th>
<td>  Yes </td>
<td>Yes</td>
<td>Yes</td>
<td>Yes</td>
</tr>
<tr style="background-color:grey"><th>Sub class
same packages</th>
<td>Yes</td>
<td>No</td>
<td>Yes</td>
<td>Yes</td></tr>
<tr style="background-color:darkgrey">
<th>Non-Sub class same Package</th>
<td>Yes</td>
<td>No</td>
<td>Yes</td>
<td>Yes</td></tr>
<tr style="background-color:grey">
<th>Sub class Different Package</th>
<td>Yes</td>
<td>No</td>
<td>Yes</td>
<td>No</td></tr>
<tr style="background-color:darkgrey">
<th>Non-Sub class Different Package</th>
<td>Yes</td>
<td>No</td>
<td>No</td>
<td>No</td></tr>
</table>
 
In the Protected modifier While using in another package subclass we can only aceess by 

Subclass Reference.
    package io.pragra.Employee;
    
    public class Production {
    
    protected void eat(){
    System.out.println("eating");
    }
    }

    package io.pragra.management;
    import io.pragra.Employee.Production;
    public class Finance  extends Production {

    public static void main(String[] args) {

        Finance f1= new Finance();

        f1.eat();
    }
    }

## Relation b/w Classes

1.IS-A (Inheritance)

When we perform inheritance means by using extends keyword


````Java
    class A{
     }
    Class B extends A{
    }

Here we can say that "B" IS-A "A" 
````
## Advantages of IS-A
1.Code reusability
2.Reduce Redundancy

Major drawback is Class A and B are tightly coupled means if I make changes in ClassA
this will affect on Class b as well.


2.HAS-A (Association)

<li>When we have create a object of the another class inside the
    one class is called HAS-A rel.</li>
 
 2.1 Aggregation-Weakly coupled
 2.2 Composition-Strongly coupled
 

```Java
    class Engine{
    };
    class Car{
        String modelName;
       Engine e= new Engine()
    }
```

<li>Car HAS-A Engine</li>
<li>If we make any changes inside of the Engine class doesn't affect 
    to the Car class.That's how we can use only properties that we want.</li>

<li>Inheritance is a Static binding while HAS-A dynamic binding</li>



## Method Overriding

<li>When we have a same name</li>
<li>Different class</li>
<li>Same Arguments,Same type and same argument sequence</li>
<li>Class follow inheritance (IS-A relationship)</li>

it's called Method Overloading.

<li>However,we can have different return type in child class,but retun type in child class can be same or 
    sub-type of Superclass return type .This phenomenon is known 
    as <b><i>covariant</i></b> return type.</li>


<li><b>Object is the Superclass of every class.</b></li>

<li>The access modifier for overriding method allow more , but not less modifier in SubClass.

<li><b>All the Abstract method must be override in subclass from the super class.</b></li>

<li>We can call Superclass method in subclass by using SUPER.method()</li>

We can achieve Dynamic polymorphism by Method Overriding.
public class Test {

    public static void main(String[] args) {
        A a1 =new A();
        B b1= new B();
        System.out.println(result(a1));
    }
    public static String result(A obj){
        return obj.show();
        }
    }

Here,static method result() showing what object we are passing.

We can assign to Parent reference to the child objects.

        A a1 =new A();
        A b1= new B();

Here B is the subclass of the Superclass A.
but we can only access method from the 

class A for b1 we need to perform object casting.

## Abstraction

<li>Abstraction is hiding internal implementaion and showing only setup service that are we offering</li>

<li>Ex.In Car ,we are only shown to break paddle but the internal strucure in not visible.</li>

We can achieve abstraction by Abstract class and interface.

1.Abstract class- When we have atleast one method without body(Abstract method)it's called Abstract Class 
                  and we cannot create Object of the Abstract class.
We can achieve 0-100% Abstarction.
public abstract class AbstarctionPractice {

    public abstract void abs(); 
    public void print(){
        System.out.println("Hello Abstraction");
    }
    }

If a method is abstract than class must be abstract.

When we inheritate(Extends) any Abstract class into another class all the Abstract method must be implement logic or else will throw an error.
Method overriding can be achieved through extends the Abstract class.

2.Interface-can achieve 100% abstraction.


## Interface

<li>It's used to achieve Abstraction</li>
<li>It's support multiple inheritance</li>
<li>Helped to achieve loose coupling</li>
<li>we can have a class and interface inside of the interface.</li>
<li>All the variable inside interface is static and final.</li>
<li>Static method can also declare inside the interface.</li>

        public interface InterfacePractice {

    //Everything inside interface is public
    // Variable will be public static final
    default void display(){
        System.out.println("Hello Interface");
        }
    }

### in Java 8 we can create static and default method inside of the inteface
### in JAVA 9 we can create private method inside interface.
We have to extends interface into the class.
A single class can extends more than one inteface at a time.
public class InterfacingClass  implements InterfacePractice{

    @Override
    public void print() {
        System.out.println("Hi");
        }
    }

Why Interface is Public?
==>We can not create object of the interface so it must be inheritated to do that it must be public.

<li>When we inhertated class and interface same time than both will be Superclass</li>


###  Polymorphism in Interface

public class Run implements IEat,IPlay{
@Override
public void eat() {
System.out.println("Eating");

    }
    @Override
    public void play() {
        System.out.println("Playing");
    }
    public static void main(String[] args) {
        IEat eat = new Run();
        eat.eat();
        IPlay pl =new Run();
    }

<li>We can assign interface to a class object which is implemnting interface</li>
Here IEat and IPlay are interface which are implement by Run class but we can only access
method which are declare inside the particular interface.

###Difference b/w Abstract and Interface.

###All variable inside interfae are Static and final while in Abstract class we canhave  any type of instance variable.

## Functional Interface

<li>When we have only one abstract method inside of the interface called Functional Interface</li>
But if we add one more abstract method then it is not a Functional Interface.

We can create a object of the interface with "Anonymous class".Where we can implement body.


        interface IPlay {
    void play  ();
    }

        class work{
        public static void main(String[] args) {
        IPlay play =new IPlay() {
        @Override
        public void play() {
        System.out.println("Playing");
        }
        }; play.play();
         }
        }


### In JAVA 8 we can use "LAMBDA EXPPRESSION" to achieve abstract method of the interface.

        @FunctionalInterface
public interface run {
void runs();

    default void eat(){
        System.out.println("Eating");
    }
    }
    
    class test{
    public static void main(String[] args) {
    run r =()-> System.out.println("Lambda");
    r.runs();
    }
    }

## ()-> {....}; Lambda expression

<li>We don't have to specify the modifier ,return type and name of the method.</li>
<li>Type of the lambda expre is the interface which has a method.</li>

## Method Reference

When we have same arguments and return type and static in class and interface and we want to output form the class method in lambda expression we can use
method reference.

```interface run {
    int runs(int x,int y);

    default void eat(){
        System.out.println("Eating");
    }
    }

class test{

    public static int add(int a,int b){return a+b;};
    public static void main(String[] args) {
        run r = test::add;//Method reference
        System.out.println(r.runs(2,3));
    }
```

## ERROR and EXCEPTION

###Error
-Occurs because of lack of System resources.
EX. OutOfMemory , StackOverFlow,HeapOverFlow,Processor

-We cannot handle this kind of errors.

-It's a run-time error.

### Exception

-occurs because of program

-can be handled 

mainly two type of Exception.

1.Checked(Compiled or IException)-When compiler cannot able to compile the file and
becuase exception its Checked excepetion.

2.Unchecked(Run-time)-It happens during run-time(2/0)


