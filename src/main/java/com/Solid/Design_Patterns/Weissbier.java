package com.Solid.Design_Patterns;

public class Weissbier  implements  CategoriaCerveja{

    @Override
    public boolean possuiFreteGratis(String C, int quant) {
    	if(C.equals("brasil" )&& quant <= 3) {
			return true;
		}else {
			return false;
		}

    }

    @Override
    public double calcularFreteGratis(String X, int quant) {
    	if(X.equals("brasil")&& quant < 3) {
    		return 0.0;
    	}else if(quant > 3)	{
    		return(7.0);
    	}else if(X.equals("brasil")|| X.equals("argentina")){
    		/*se a qauntidade for maior que 5  e  se for um  pedido nacional ou internacional frete pago */
    		
    		return (3.0);
    		
    	}else {
    		return(0.0);
    	}
    
}
}
