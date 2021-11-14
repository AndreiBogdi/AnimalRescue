package AnimalRescue;
public class Animal {
    private String breed;
    private byte age;
    float weight;
    int heightInCm;
    private String name;
    String color;
    int healthCondition;
    int mood;
    String favouriteFood;
    String favouriteActivity;
    int hunger;

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;

    }
    public Byte getAge(){
        return age;
    }
    public void setAge(Byte age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    }

    public void eat() {System.out.println("Eating...");}
    public void sleep() {System.out.println("Sleeping....");}
    public void speak(){System.out.println("Bark!");}
    public void play() {System.out.println("Playing...");}





}
