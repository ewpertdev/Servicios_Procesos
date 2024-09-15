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

class ProbarAnimal {
    public static void main(String[] args){
        Animal perros = new Perro();
        Animal gatos = new Gato();
        perros.hacerSonido();
        gatos.hacerSonido();
    }

}
