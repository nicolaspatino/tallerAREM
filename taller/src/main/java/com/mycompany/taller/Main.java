/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.taller;

/**
 *
 * @author 2112712
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {
    public static void main(String []args ) throws MalformedURLException{
        URL google = new URL("http://www.google.com/");
        try (BufferedReader reader= new BufferedReader(new InputStreamReader(google.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
                System.out.println("----------------------------------------------------------------");
                
            }
            /*System.out.println("protocol  "+google.getProtocol());
            System.out.println("Authority  "+google.getAuthority());
            System.out.println("Host "+google.getHost());
            System.out.println("Port  "+google.getPort());
            System.out.println("Path  "+google.getPath());
            System.out.println("Query  "+google.getQuery());
            System.out.println("File  "+google.getFile());
            System.out.println("Ref  "+google.getRef());
            */
        } catch (IOException x) {
            System.err.println(x);
 }
        Escaner();
        
    }
    private String protocol(URL url){
        return url.getProtocol();
    }
    private String Query(URL url){
        return url.getQuery();
    }
    private String Host(URL url){
        return url.getHost();
    }
    private String File(URL url){
        return url.getFile();
    }
    private String Ref(URL url){
        return url.getRef();
    }
    private int Port(URL url){
        return url.getPort();
    }
    private String Authority(URL url){
        return url.getAuthority();
    }
    private String Path(URL url){
        return url.getPath();
    }
    public static void Escaner(){
        try (Scanner reader = new Scanner(System.in) 
        ) {
            System.out.println("Ingrese la direccion URL ");
            String n = reader.next(); 
        }
        escritura();
    }
   public static void escritura(){
       FileOutputStream archivo;
       String texto="texto";
       PrintStream p;
	try {
		archivo= new FileOutputStream("resultado.html");
		//archivo= new FileOutputStream("archivo.txt");
		p= new PrintStream(archivo);
		p.println(texto);
		p.close();
	} catch (FileNotFoundException e) {		
}
       System.out.println("escribio");
   }
}

   
    

