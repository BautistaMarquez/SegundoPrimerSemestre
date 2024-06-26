package Punto3;

import java.util.LinkedList;
import java.util.List;
import Punto1.*;
import Punto1.adjList.*;
import Punto1.adjMatrix.*;
import Punto3.mapaCiudades;

public class Prueba {
	public static void main(String[]args) {
		AdjListGraph<String> grafo = new AdjListGraph<String>();
		Vertex vert1 = grafo.createVertex("BSAS");
		Vertex vert2 = grafo.createVertex("LaPlata");
		Vertex vert3 = grafo.createVertex("Berisso");
		Vertex vert4 = grafo.createVertex("San Juan");
		Vertex vert5 = grafo.createVertex("San Luis");
		grafo.connect(vert1, vert2,10);
		grafo.connect(vert2, vert5,99);
		grafo.connect(vert2, vert1,2);
		grafo.connect(vert2, vert3,6);
		grafo.connect(vert3, vert4,3);
		grafo.connect(vert4, vert5,7);
		List<String> r = new LinkedList<String>();
		mapaCiudades ciudades = new mapaCiudades(grafo);
		// creo que deberia usar dos listas en todos los procedimientos.
		r = ciudades.devolverCamino("LaPlata","San Juan");
		System.out.println("aaa");
		System.out.println(r); //de esta forma imprime todo la LinkedList, no tenia idea. 
		
		// -2-
		List<String> r2 = new LinkedList<String>();
		List<String> excepciones = new LinkedList<String>();
		excepciones.add("Berisso");
		r2 = ciudades.devolverCaminoExceptuado("LaPlata","San Luis",excepciones);
		
		System.out.println(r2); // Funciona. Es la mejor manera? Probablemente no. Pero bueno es lo que se me ocurrio a mi. Despues tendria que ver mejores formas.
		
		// -3-
		
		List<String> r3 = new LinkedList<String>();
		r3 = ciudades.caminoMasCorto("BSAS","San Luis");
		
		System.out.println(r3);
		
		// -4-
		
		List<String> r4 = new LinkedList<String>();
		r4 = ciudades.caminoSinCargarCombustible("BSAS","San Luis",50);
		
		System.out.println(r4); //Funciona. Tendria que ver los cortes de control esos que hago adentro del for pero anda.
		// -5-
		
		//el tema con este es saber en que puedo le recargo nafta y como me guardo las veces que carge nafta, ya que me va a pasar lo mismo que con el minimo ya que lo voy a perden en la recursion ya que es un int osea compararia las veces que carge en el camino anterior con este pero no se como guardarlo.
	}
}
