package com.gintophilip.englishgreeting;

import com.gintophilip.core.greeting.contract.GreetingPlugin;

public class EnglishGreeting implements GreetingPlugin {

    @Override
    public void greet(String userName) {
        System.out.println("Hello "+ userName+" "+"Welcome");
    }

    @Override
    public String getLanguage() {
        return "English";
    }
}
