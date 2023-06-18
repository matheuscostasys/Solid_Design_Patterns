package com.Solid.Design_Patterns;

public class AppCerveja {
    public static void main(String[] args) {
        Cerveja cerveja1 = new Cerveja("Larger" , "Cerveja 1","brasil" );
        cerveja1.setCategoria("Larger");
        cerveja1.setNome("Cerveja 1");
        cerveja1.setOrigem("brasil" );
               int quantidade1 = 10;
        CategoriaCerveja categoria1 = FabricaCategoriadeCerveja.criacategoriaCerveja(cerveja1.getCategoria());
       
        if (cerveja1.getCategoria() == null) {
            
            throw new IllegalArgumentException("Categoria inválida para cerveja1");
        }

        boolean freteGratis1 = categoria1.possuiFreteGratis("brasil", quantidade1);
        double custoFrete1 = categoria1.calcularFreteGratis("brasil", quantidade1);

        System.out.println("Cerveja: " + cerveja1.getNome());
        System.out.println("Frete Gratis: " + freteGratis1); 
        System.out.println("A quantidade adquirida foi: " + quantidade1);
        System.out.println("Custo do Frete: R$" + custoFrete1);
       
        Cerveja cerveja2 = new Cerveja("Ale" , "Cerveja 2","buenos aires" );
        cerveja2.setCategoria("Ale");
        cerveja2.setNome("Cerveja 2");
        cerveja2.setOrigem("buenos aires" );
               int quantidade2 = 6;
        CategoriaCerveja categoria2 = FabricaCategoriadeCerveja.criacategoriaCerveja(cerveja2.getCategoria());
       
        if (cerveja2.getCategoria() == null) {
            
            throw new IllegalArgumentException("Categoria inválida para cerveja2");
        }

        boolean freteGratis2 = categoria2.possuiFreteGratis("buenos aires", quantidade2);
        double custoFrete2 = categoria2.calcularFreteGratis("buenos aires", quantidade2);

        System.out.println("Cerveja: " + cerveja2.getNome());
        System.out.println("Frete Gratis: " + freteGratis2); 
        System.out.println("A quantidade adquirida foi: " + quantidade2);
        System.out.println("Custo do Frete: R$" + custoFrete2);
       
        Cerveja cerveja3 = new Cerveja("Weissbier" , "Cerveja 3","Alemanha" );
        cerveja3.setCategoria("Weissbier");
        cerveja3.setNome("Cerveja 3");
        cerveja3.setOrigem("Alemanha" );
               int quantidade3 = 3;
        CategoriaCerveja categoria3 = FabricaCategoriadeCerveja.criacategoriaCerveja(cerveja3.getCategoria());
       
        if (cerveja3.getCategoria() == null) {
            
            throw new IllegalArgumentException("Categoria inválida para cerveja3");
        }

        boolean freteGratis3 = categoria3.possuiFreteGratis("Alemanha", quantidade3);
        double custoFrete3 = categoria3.calcularFreteGratis("Alemanha", quantidade3);

        System.out.println("Cerveja: " + cerveja3.getNome());
        System.out.println("Frete Gratis: " + freteGratis3); 
        System.out.println("A quantidade adquirida foi: " + quantidade3);
        System.out.println("Custo do Frete: R$" + custoFrete3);
        
    }
}
