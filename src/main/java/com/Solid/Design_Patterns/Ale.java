package com.Solid.Design_Patterns;

public class Ale implements CategoriaCerveja {

    @Override
    public boolean possuiFreteGratis(String C, int quant) {
    	if(quant >= 4) {
    		System.out.println("O seu pedido deve ser retirado no estabelecimento apos a compra  ");
			return true;
		}else {
			System.out.println("O seu pedido nao atingiu a quantidade suficiente <4>");
			return false;
		}

    }

    @Override
    public double calcularFreteGratis(String X, int quant) {
   return 0.0;
}
}