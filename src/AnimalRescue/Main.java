package AnimalRescue;
public class Main {
    public static void main(String [] args){
        Animal rex = new Animal();
        rex.setName("Rex");
        rex.setBreed("Labrador");
        String breed=rex.getBreed();
        Byte age=rex.getAge();
        rex.setAge((byte) 1);
        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        rex.play();
        rex.setName("Blackie");
        System.out.println(rex.getName());

        Animal freddie = new Animal();
        System.out.println(freddie.getName());
        freddie.setName("Freddie");

        Animal max = new Animal();
        max.setBreed("Buldog");


    }
}
