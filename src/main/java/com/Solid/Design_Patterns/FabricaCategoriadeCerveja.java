package com.Solid.Design_Patterns;

public class FabricaCategoriadeCerveja {

	public static CategoriaCerveja criacategoriaCerveja(String c) {
	    switch (c) {
	        case "Larger":
	            return new Larger();
	        case "Ale":
	            return new Ale();
	        case "Weissbier":
	            return new Weissbier();
	        default:
	            throw new IllegalArgumentException("Categoria de cerveja inválida: " + c);
	    }
	}
}