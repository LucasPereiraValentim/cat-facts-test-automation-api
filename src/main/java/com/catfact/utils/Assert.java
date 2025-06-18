package com.catfact.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class Assert {

    private static final Logger log = LoggerFactory.getLogger(Assert.class);

    public static void checkEquals(Object obj1, Object obj2) {
        log.info("Comparando valores: esperado = {}, atual = {}", obj1, obj2);
        try {
            assertEquals(obj1, obj2);
            log.info("Sucesso: {} é igual a {}", obj1, obj2);
        } catch (AssertionError e) {
            log.error("Falhou: {} não é igual a {}", obj1, obj2);
            throw e;
        }
    }


        public static void checkNotNull(Object value) {
            log.info("Validando que o objeto não é nulo: {}", value);
            try {
                assertNotNull(value);
                log.info("Sucesso: valor '{}' não é nulo.", value);
            } catch (AssertionError e) {
                log.error("Falha: o objeto é nulo.");
                throw e;
            }
        }

    public static void checkFalse(boolean condition) {
        log.info("Validando que a condição é falsa: {}", condition);
        try {
            assertFalse(condition);
            log.info("Sucesso: condição é falsa (valor recebido: {}).", condition);
        } catch (AssertionError e) {
            log.error("Falha: a condição não é falsa.");
            throw e;
        }
    }

    public static void checkTrue(boolean condition) {
        log.info("Validando que a condição é verdadeira: {}", condition);
        try {
            assertTrue(condition);
            log.info("Sucesso: condição é verdadeira (valor recebido: {}).", condition);
        } catch (AssertionError e) {
            log.error("Falha: a condição não é verdadeira.");
            throw e;
        }
    }

}
