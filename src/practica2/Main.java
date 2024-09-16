package practica2;

interface Imprimible {
    String imprimir();
}

public class Documento implements Imprimible {
    private String send;
    private String scan;

    public Documento (String send, String scan) {
        this.send = send;
        this.scan = scan;

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
