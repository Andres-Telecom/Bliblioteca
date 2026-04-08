public class Principal {
    public static void main(String[] args) {
        Libro l1=new Libro("Pinocho","Carlo Collodi","Cuento", 1881,3);
        Libro l2=new Libro();

        System.out.println("Libro 1 :"+l1.mostrarInformacion());
        System.out.println("Prestando Libro...");
        if (l1.prestar()<0){
            System.out.println("No hya ejemplares");
        }else{
            System.out.println("Ejemplar prestado");
        }

        System.out.println("Prestando Libro...");
        if (l1.prestar()>0){
            System.out.println("NO hay ejemplares");
        }else{
            System.out.println("Ejemplar prestado");
        }

        System.out.println("Libro 1 :"+l1.mostrarInformacion());
        System.out.println("Libro 2 :"+l2.mostrarInformacion());
    }

}
