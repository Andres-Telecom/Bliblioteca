public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private int anio;
    private int cantidadEjemplares;

    //constructor por defecto
    public Libro (){
        titulo="Java para Ingenieros";
        autor="Andres Ugsha";
        categoria="Programacion";
        anio=2014;
        cantidadEjemplares=5;
    }

    public Libro(String t, String a, String c, int an, int can){
        titulo=t;
        autor=a;
        categoria=c;
        anio=an;
        cantidadEjemplares=can;
    }

    public String mostrarInformacion(){
        String aux="";
        aux= "Titulo: "+titulo+"\n";
        aux+="Autor: "+autor+"\n";
        aux+="Categoria: "+categoria+"\n";
        aux+="Año: "+anio+"\n";
        aux+="Cantidad: "+cantidadEjemplares+"\n";
        return aux;
    }

    public int prestar (){
        if (cantidadEjemplares>0){
            cantidadEjemplares--;
            return cantidadEjemplares;
        }
        return -1; //significa que no hay ejemplares
    }

}
