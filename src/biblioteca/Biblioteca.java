/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package biblioteca;

import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author Leonardo Alvez
 */
public class Biblioteca {


    public static void main(String[] args) {
        //Instanciamos un objeto del tipo servicio así podemos acceder a sus metodos.
        LibroServicio ls = new LibroServicio();
        
        //Instanciamos un objeto libro para alojar el retorno del método.
        Libro l1 = ls.altaLibro();
        
        //Ahora llamamos al método que informa con el objeto por parametro..
        ls.InformarDatos(l1);
        
    }
    
}
