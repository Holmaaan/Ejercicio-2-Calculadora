package com.calculadora;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class Calculadora {

    private JexlEngine jexl;

    public Calculadora() {
        this.jexl = new JexlBuilder().create();
    }

    public double evaluar(String expresion) {
        JexlExpression e = jexl.createExpression(expresion);
        return ((Number) e.evaluate(new MapContext())).doubleValue();
    }
}