package com.gintophilip.spanishgreeting;

import com.gintophilip.core.greeting.contract.GreetingPlugin;

public class SpanishGreeting implements GreetingPlugin {

    @Override
    public void greet(String userName) {
        System.out.println("Hola "+ userName+" "+"bienvenido");
    }

    @Override
    public String getLanguage() {
        return "Spanish";
    }
}
