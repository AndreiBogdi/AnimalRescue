package AnimalRescue;
public class Main {
    public static void main(String [] args){
        AnimalRescue.Dog rex = new AnimalRescue.Dog();
        rex.name = "Rex";
        rex.breed = "Labradord";
        rex.age = 1;
        System.out.println(rex.name);
        System.out.println(rex.age);
        rex.play();
        rex.name = "Blackie";
        System.out.println(rex.name);

        Dog freddie = new Dog();
        System.out.println(freddie.name);
        freddie.name = "Freddie";

        Dog max = new Dog();
        max.breed = " Buldog";

    }
}