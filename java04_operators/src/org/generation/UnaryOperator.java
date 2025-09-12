package org.generation;

public class UnaryOperator {

	public static void main(String[] args) {
		/*
		 Los operadores unarios requieren un solo operando.
		  
		  +		Unary plus operator; indicates positive value (numbers are positive without this, however)
		  -		Unary minus operator; negates an expression
		  ++	Increment operator; increments a value by 1
		  --	Decrement operator; decrements a value by 1
		  !		Logical complement operator; inverts the value of a boolean
		 
		 */
		int valueA = +20; // por default los valores son positivos
		int valueB = -10; // El valor es negativo
		
		// Opera de preincremento         ++valor
		int valorInicial = 10;
		// valorInicial = valorInicial + 1; 
		// entregar el valor de la variable(valorInicial)
		++valorInicial;
		System.out.println(valorInicial); // 11
		System.out.println(++valorInicial); // 12
				
		// Operador de postIncremento     valor++
		valorInicial = 50;
		// entrega el valor actual de la variable(valorInicial)
		// valorInicial = valorInicial + 1;
		valorInicial++;
		System.out.println(valorInicial); // 51
		System.out.println(valorInicial++); // 51
		System.out.println(valorInicial); // 52
		
		// Ejercicio
		int productsInCart = 5;
		int bonusPoints = 10;
		
		int result = productsInCart++ + ++bonusPoints;
		
        System.out.println("Valor del resultado (result): " + result); // 16
        System.out.println("Valor final de productos (productsInCart): " + productsInCart); // 6
        System.out.println("Valor final de puntos (bonusPoints): " + bonusPoints); // 11

        
        // Ejercicio 2
        
        int increment = 0;
        int iteracion = 0;
        
        /* increment | iteration | comparación <=3 | syso | iteracion = increment++
         *     0             0         true          0          0          0
         *                                                                 1
         *     1             0         true          1          1          1
         *                                                                 2
         *     2             1         true          2          2          2
         *                                                                 3
         *     3             2         true          3          3          3
         *                                                                 4
         *     4             3         false
         *                                                                                                                     
         */
        
        
        for( ; increment <= 3; iteracion = increment++ ) {
        	System.out.println("Increment: " + increment);
        }
        
        System.out.println("Increment: " + increment); // 4
        System.out.println("Iteracion: " + iteracion); // 3
        
	}

}
