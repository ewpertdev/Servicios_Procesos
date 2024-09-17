package practica0;

import java.util.Date;

class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible = true;

    void Prestamo(){

    }
    void devolucion() {

    }
    void informacion () {

    }
}

class Usuario {
    String idUsuario;
    String nombre;
    String telefono;
    String email;

    void registrar() {
        System.out.println("Nuevo usuario registrado");

    }
    void actualizarInfo() {
        System.out.println("Información del usuario actualizada");
    }
    void consultarPrestamos() {

    }
}

class Prestamo {
    String idPrestamo;
    Date fechaPrestamo;
    Date fechaDevolucion;

    void realizarPrestamo() {

    }
    void finalizarPrestamo() {

    }
}

class ProbarBiblioteca1 {
    public static void main (String[] args) {


    }
}

class ProbarBiblioteca2 {
    public static void main(String [] args) {

    }
}
