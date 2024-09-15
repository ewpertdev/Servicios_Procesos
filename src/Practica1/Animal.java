package Practica1;

class Animal {

    void hacerSonido() {
        System.out.println();
    }
}

class Perro extends Animal {

    @Override
    void hacerSonido() {
        System.out.println("woof");
        }
}

class Gato extends Animal {

    @Override
    void hacerSonido() {
        System.out.println("meow");
    }
}
