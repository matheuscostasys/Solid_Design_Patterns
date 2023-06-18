package com.Solid.Design_Patterns;

public class Larger  implements  CategoriaCerveja {
        
    @Override
    public boolean possuiFreteGratis(String C, int quant) {
		if(C.equals("brasil" )&& quant >= 2) {
			return true;
		}else {
			return false;
		}

    }

    @Override
    public double calcularFreteGratis(String X, int quant) {
    	// se a  for menor ou igual a cinco frete gratis 
    	if(X.equals("brasil")&& quant <= 2) {
    		return 0.0;
    		
    	}else{
    		/*se a qauntidade for maior que 2  e  se for um  pedido nacional ou internacional frete pago */
    		
    		return (quant * 2);
    		
    	}
        
    }
        
}
