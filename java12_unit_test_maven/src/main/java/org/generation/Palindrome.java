package org.generation;

public class Palindrome {
	
	public boolean isPalindrome(String texto) {
		
		texto = texto.toLowerCase().trim().replace(" ", "");
        String textoReverted = "";
        int textoLenght = texto.length();

        System.out.println("Palabras: " + textoLenght);
        
        for (int i =  textoLenght - 1; i >= 0; i--) {
            textoReverted += texto.charAt(i);
        }

        System.out.println("Texto izq-der: " + texto);
        System.out.println("Texto der-izq: " + textoReverted);

        
        if (texto.equals(textoReverted)) {
            System.out.println("✅😁 Es un palindrome\n");
            System.out.println("-".repeat(40));
            return true;
        } else {
            System.out.println("❌😞 No es un palindrome\n");
            System.out.println("-".repeat(40));
            return false;
        }
	}

}
