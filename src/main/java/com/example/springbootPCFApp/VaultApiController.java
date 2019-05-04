package com.example.springbootPCFApp;


import com.newrelic.api.agent.NewRelic;
import org.springframework.stereotype.Service;


import java.util.HashMap;

@Service
public class VaultApiController {
    Integer count = 1;

    public void add(){
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("Count",count);
        NewRelic.getAgent().getInsights().recordCustomEvent("Service Call Count",hashMap);
        count++;
    }
}
