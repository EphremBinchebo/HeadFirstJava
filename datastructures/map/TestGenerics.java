package datastructures.map;

import java.util.ArrayList;

public class TestGenerics {
    public static void main(String[] args) {
        new TestGenerics().go();
    }

    public void go() {
//        Animal[] animals = {new Dog(), new Cat(), new Dog()};
//         Dog[] dogs = {new Dog(), new Dog(), new Dog()};
//         takeAnimals(animals);
//         takeAnimals(dogs);
//        ArrayList<Animal> animals = new ArrayList<Animal>();
//        animals.add(new Dog());
//        animals.add(new Cat());
//        animals.add(new Dog());
//        takeAnimals(animals);
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimals(dogs);
    

    }

    private void takeAnimals(ArrayList<? extends Animal> animals) {
    for (Animal a: animals){
        a.eat();
    }
    }

//    public void takeAnimals(Animal[] animals) {
//     for(Animal a: animals){
//         a.eat();
//     }
//    }
}
