package practica2;

interface Imprimible {
    String imprimir();
}

public class Documento implements Imprimible {
    private String enviar;
    private String contenido;

    public Documento (String enviar, String contenido) {
        this.enviar = enviar;
        this.contenido = contenido;

    }

    public String getEnviar() {
        return enviar;
    }

    public String imprimir(){
        return this.contenido;
    }
}
public class Reporte implements Imprimible {
    private String enviar;
    private String contenido;

    public Reporte (String enviar, String contenido){

    }

}

class Test {
    public static void main(String[] args){

    }
}
