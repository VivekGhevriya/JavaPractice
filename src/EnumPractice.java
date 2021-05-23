public class EnumPractice {
    private String name;
    public Level size;

    public EnumPractice(String name, Level size) {
        this.name = name;
        this.size = size;
    }



    public static void main(String[] args) {

        EnumPractice obj1= new EnumPractice("vivek",Level.HIGH);
        for (Level str:Level.values()) {
            System.out.println(str);
        }

      Level  myvar = obj1.size;
        myvar.number=5;
        myvar.add(5);

        switch (myvar){
            case HIGH:
                System.out.println("Value is High");
                System.out.println(myvar.number);
            case LOW:
                System.out.println("Valie is Low");
        }
    }

}
enum Level{
    HIGH,MEDIUM,LOW;
    int number;
    int sum ;
    public void add(int number){
        sum= sum+number;
    }
}
