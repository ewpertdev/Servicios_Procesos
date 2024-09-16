package practica2;


interface Imprimible{
        void setImprimir( int imprimir);
        public int getImprimir();

        }

    class Documento implements Imprimible{
    private int imprimir;

        @Override
        public void setImprimir(int imprimir) {

        }

        @Override
        public int getImprimir() {
            return 0;
        }
    }

    class Reporte implements Imprimible{
    private int imprimir;

        @Override
        public void setImprimir(int imprimir) {

        }

        @Override
        public int getImprimir() {
            return 0;
        }
    }
