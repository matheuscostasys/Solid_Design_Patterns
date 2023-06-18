package com.Solid.Design_Patterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppCervejaTest {

    @Test
    public void testLagerFreteGratis() {
        Cerveja cerveja1 = new Cerveja("Larger", "Cerveja 1", "brasil");
        cerveja1.setCategoria("Larger");
        cerveja1.setNome("Cerveja 1");
        cerveja1.setOrigem("brasil" );
        int quantidade1 = 2;
        CategoriaCerveja categoria1 = FabricaCategoriadeCerveja.criacategoriaCerveja(cerveja1.getCategoria());
        boolean freteGratis1 = categoria1.possuiFreteGratis(cerveja1.getOrigem(), quantidade1);
        Assertions.assertTrue(freteGratis1);

        Cerveja cerveja2 = new Cerveja("Ale", "Cerveja 2", "Importada");
        cerveja2.setCategoria("Ale");
        cerveja2.setNome("Cerveja 2");
        cerveja2.setOrigem("Importada" );
        int quantidade2 = 3;
        
        CategoriaCerveja categoria2 = FabricaCategoriadeCerveja.criacategoriaCerveja(cerveja2.getCategoria());
        boolean freteGratis2 = categoria2.possuiFreteGratis(cerveja2.getOrigem(), quantidade2);
        Assertions.assertTrue(!freteGratis2);

        Cerveja cerveja3 = new Cerveja("Weissbier", "Cerveja 3", "Importada");
        cerveja3.setCategoria("Weissbier");
        cerveja3.setNome("Cerveja 3");
        cerveja3.setOrigem("Importada" );
        int quantidade3 = 3;
        CategoriaCerveja categoria3 = FabricaCategoriadeCerveja.criacategoriaCerveja(cerveja3.getCategoria());
        boolean freteGratis3 = categoria3.possuiFreteGratis(cerveja3.getOrigem(), quantidade3);
        Assertions.assertFalse(freteGratis3);
    }

    // Outros testes para as demais categorias de cerveja e cenários
}
