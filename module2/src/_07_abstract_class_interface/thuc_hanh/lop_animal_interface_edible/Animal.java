package _07_abstract_class_interface.thuc_hanh.lop_animal_interface_edible;

abstract class Animal {
    public abstract String makeSound();
}

class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
}




class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

interface Edible {
    String howToEat();
}

abstract class Fruit implements Edible {
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}