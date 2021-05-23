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


##Enumerations(enum)

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


##Polymorphism

Method Overloading


<h3>Constructor Overloading</h3>

When we have a more than one constructor in same class it's called 
overloading.But the arguments must be differ from each other.

