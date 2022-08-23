package com.byj.crypto;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;


public class Base64Test {

    private final static String BASE_64 = "ZW5jb2Rl";
    private final static String TEXTO = "encode";

    @Test
    public void base64encodeTest() {
        assertEquals(BASE_64, Base64.toString(TEXTO.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    public void base64decodeTest() {
        assertEquals(TEXTO, new String(Base64.toBytes(BASE_64)));
    }
}
