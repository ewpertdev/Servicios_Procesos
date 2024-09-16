package practica2;


import java.awt.image.ImageProducer;

interface Imprimible {
    String imprimir();
}

public class Documento implements Imprimible {
    private String send;
    private String scan;

}
public class Reporte implements Imprimible {
    private String send;
    private String scan;

}

class ProbarImprimir {
    public static void main(String[] args){

    }
}
