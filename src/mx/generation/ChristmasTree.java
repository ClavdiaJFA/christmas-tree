package mx.generation;

public class ChristmasTree {
	  public static void main(String[] args) {
	    int filas = 10;

	    for (int i = 0; i < filas; i++) {
	      for (int j = 0; j < filas - i; j++) {
	        System.out.print(" ");
	      }
	      for (int k = 0; k <= 2 * i; k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }

	    // tronco
	    for (int i = 0; i < filas / 4 + 1; i++) {
	      for (int j = 0; j < filas - 1; j++) {
	        System.out.print(" ");
	      }
	      System.out.println("**");
	    }

	 // base
	    for (int i = 0; i < filas / 4 + 1; i++) {
	      for (int j = 0; j < filas - 2; j++) {
	        System.out.print(" ");
	      }
	      System.out.println("****");
	    }
	  }
	}