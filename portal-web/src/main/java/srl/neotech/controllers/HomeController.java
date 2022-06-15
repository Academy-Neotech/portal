package srl.neotech.controllers;

import org.apache.logging.log4j.core.util.UuidUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Controller
public class HomeController {

    @Value("classpath:appConfig.json")
    Resource appConfig;


    @RequestMapping (value="/", method= RequestMethod.GET)
    public String home() {
        return "home";
    }


    @ResponseBody
    @GetMapping(value="/getAppConfig")
    public String getAppConfig() throws IOException {
        String appConfigFile=new String(appConfig.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        appConfigFile= appConfigFile.replace("{clientId}", UuidUtil.getTimeBasedUuid().toString());
        return appConfigFile;
    }



}
