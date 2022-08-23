package com.byj.crypto;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleDESTest {

    private final static String TEXTO_CLARO = "texto en claro";
    private final static String CLAVE = "Clave_Dificil@Pruebas-Java2022";
    private final static String ENCRIPTADO = "hBJ8vCRJ+3G+lXgMgyF0Uw==";

    @Test
    public void encryptTest() throws Exception {
        TripleDES tripleDES = new TripleDES(CLAVE);
        assertEquals(ENCRIPTADO, tripleDES.encrypt(TEXTO_CLARO));
    }

    @Test
    public void decryptTest() throws Exception {
        TripleDES tripleDES = new TripleDES(CLAVE);
        assertEquals(TEXTO_CLARO, tripleDES.decrypt(ENCRIPTADO));
    }

}
