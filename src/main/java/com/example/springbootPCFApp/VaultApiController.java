package com.example.springbootPCFApp;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaultApiController {

    @Value("${vaultSecret:#{null}}")
    private String vault_secret;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/secret")
    public String index(){
        return "Application-name: " +  appName + ", Vault-secret: " + vault_secret;
    }
}
