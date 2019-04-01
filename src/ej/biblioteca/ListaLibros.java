package ej.biblioteca;

/**
 * Lista de libro de una biblioteca
 * 
 * @author orodicio
 * @version 01/04/2019
 */
public class ListaLibros {
	Libro primero;

	/**
	 * Constructor for objects of class ListaNodos
	 */
	public ListaLibros() {
		primero = null;
	}

	// Completar los metodos

	// Incluye un nuevo libro en la lista
	public void pon(Libro valor) {
		valor.siguiente = primero;
		primero = valor;
	}

	public boolean estaVacia() {
		return (primero == null);

	}

	// Devuelve un libro que es eliminado de la lista o null si no exite
	public Libro quitar(int id) {
		Libro paux, paux2;
		paux = primero;
		paux2 = primero.siguiente;

		if (paux.id == id) {
			primero = primero.siguiente;
			return paux;
		}

		while (paux2.siguiente != null) {
			if (paux2.id == id) {
				paux.siguiente = paux2.siguiente;
				paux2.siguiente = null;
				return paux2;
			}
			paux = paux2;
			paux2 = paux2.siguiente;
		}
		if (paux2.id == id) {
			paux.siguiente = null;
			return paux2;
		}
		return null;
	}

	// Devuelve el id del libro o -1 si no esta
	public int buscarId(String titulo) {
		Libro paux;
		paux = primero;
		while (paux != null) {
			if (paux.titulo.equals(titulo)) {
				return paux.id;
			}
			paux = paux.siguiente;
		}
		return -1;
	}

	// Muestra los libros almacenados
	public void verCatalogo() {
		int numLibros = 0;
		Libro aux = primero;
		System.out.println("------------------------");
		while (aux != null) {
			numLibros++;
			System.out.println(numLibros + " : " + aux);
			aux = aux.siguiente;
		}
		System.out.println("------------------------");

	}

}
