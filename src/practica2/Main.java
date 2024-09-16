package practica2;


import java.awt.image.ImageProducer;

interface Imprimible {
    String imprimir();
}

public class Documento implements Imprimible {
    private String send;
    private String scan;

    public Documento (String send, String scan) {

    }

}
public class Reporte implements Imprimible {
    private String send;
    private String scan;

    public Reporte (String send, String scan){

    }

}

class ProbarImprimir {
    public static void main(String[] args){

    }
}
