/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class LibroServicio {
    
    public Libro altaLibro(){
        
        // Instanciamos un objeto del tipo Libro.
        Libro l1 = new Libro();
        
        //Instanciamos un objeto del tipo Scanner para solicitar datos.
        Scanner leer;
        leer = new Scanner(System.in);
        
        System.out.println("Por favor introduzca el nombre de usuario");
        l1.setUsuario(leer.next());
        System.out.println("Por favor introduzca el ISBN del libro");
        l1.setIsbn(leer.next());
        System.out.println("Por favor introduzca el título del libro");
        l1.setTitulo(leer.next());
        System.out.println("Por favor introduzca el Autor del libro");
        l1.setAutor(leer.next());
        System.out.println("Por favor introduzca el número de páginas");
        l1.setPaginas(leer.nextInt());
        return l1;
        
    }
    
    public void InformarDatos(Libro l1){
        
        System.out.println("Número de ISBN:" + l1.getIsbn());
        System.out.println("Título:" + l1.getTitulo());
        System.out.println("Autor:" + l1.getAutor());
        System.out.println("Páginas:" + l1.getPaginas());
    }
    
}
