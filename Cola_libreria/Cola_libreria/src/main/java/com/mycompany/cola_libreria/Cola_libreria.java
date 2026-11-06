/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cola_libreria;

/**
 *
 * @author ESTUDIANTES
 */
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;
import java.util.PriorityQueue;


public class Cola_libreria {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        colas_simples();
        colas_circular();
        colas_prioridad();
        colas_doble();
    }
    
    static void colas_simples(){
       System.out.println("Ejercicio colas simples:primero en llegar primero en salir");
       Queue<String> java= new ArrayDeque <>();
       java.offer("ana");
       java.offer("viviana");
       java.offer("leiner");
        System.out.println("java: "+ java.poll() + ", "+ java.poll() + "\n");
       
       
    }
    static void colas_circular(){
       System.out.println("Ejercicio colas circular:Reutiliza los espacios del arreglo");
       Queue<String> java= new ArrayDeque <>();
       java.offer("ana");
       java.offer("viviana");
       java.offer("leiner");
       System.out.println("sale: "+ java.poll());
       java.offer("Fabio");
       System.out.println("java: "+ java.poll() + ", "+ java.poll() + ", " +java.poll() + "\n");
       
       
    }
    
     static void colas_prioridad(){
       System.out.println("Ejercicio colas prioridad:el menor numero se atiende primero");
       Queue<Integer> java= new PriorityQueue <>();
       java.offer(5);
       java.offer(2);
       java.offer(3);
       System.out.println("java: "+ java.poll() + ", "+ java.poll() + ", " +java.poll() + "\n");
       
       
    }
     
     static void colas_doble(){
       System.out.println("cola doble (deque):permite usar ambos extremos");
      Deque<String> java= new ArrayDeque <>();
       java.offerLast("ana");
       java.offerLast("viviana");
       java.offerFirst("leiner");
       System.out.println("sale: "+ java.poll());
       java.offer("Fabio");
       System.out.println("java: sale del inicio "+ java.pollFirst() + ", sale del final "+ java.pollLast() + ", " +java.pollLast() + "\n");
    }
}
