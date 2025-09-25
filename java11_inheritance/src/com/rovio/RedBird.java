package com.rovio;

public final class RedBird extends Bird {
	// Podemos agrega nuevos atributos
	private boolean isLead;
	
	public RedBird(boolean isLead) {
		super("Red Bird", "Rojo");
		this.isLead = isLead;
	}

	public boolean isLead() {
		return isLead;
	}

	public void setLead(boolean isLead) {
		this.isLead = isLead;
	}

	/**
	 *  Sobreescritura de métodos (Override)
	 *  
	 *  Para que un método sea sobreescrito, este debe tener la misma
	 *  firma del método de la clase superior. La sobreescritura permite
	 *  personalizar el comportamiento heredado.
	 *  
	 *  @Override: Anotación que indica que el método está sobreescribiendo
	 *  el comportamiento de una método de la clase heredada.
	 *  Su propósito es hacer una validación en tiempo de
	 *  compilación para asegurarse que la subclase está
	 *  sobreescribiendo correctamente y coincide
	 *  con la firma del método.
	 */
	@Override
	public void useSpecialAbility() {
		System.out.println( super.getName() + " grita, pero no tiene un poder especial" );
		
	}
	

	

}
