package com.gintophilip.hindigreeting;

import com.gintophilip.core.greeting.contract.GreetingPlugin;

public class HindiGreeting implements GreetingPlugin {

    @Override
    public void greet(String userName) {
        System.out.println("नमस्ते, "+ userName +"  स्वागत है");
    }

    @Override
    public String getLanguage() {
        return "Hindi";
    }
}
