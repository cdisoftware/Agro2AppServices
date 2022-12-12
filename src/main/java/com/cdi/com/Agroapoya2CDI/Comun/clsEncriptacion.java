package com.cdi.com.Agroapoya2CDI.Comun;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.util.Base64;

/**
 *
 * @author Juan José Gutiérrez // Metodos para encriptar y desencriptar en
 * BASE64
 */
public class clsEncriptacion {

    public static String Encriptar(String texto) throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException {

        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encoded = encoder.encode(texto.getBytes());
        return new String(encoded);

    }

    public static String Desencriptar(String texto) {

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(texto);
        return new String(decoded);

    }
}
