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


    @RequestMapping (value="/ricerca", method= RequestMethod.GET)
    public String ricerca() {
        return "ricerca_risorsa";
    }

    @RequestMapping (value="/inserisci", method= RequestMethod.GET)
    public String inserisci() {
        return "inserisci_risorsa";
    }

    @RequestMapping (value="/ricerca_cliente", method= RequestMethod.GET)
    public String ricerca_cliente() {
        return "ricerca_cliente";
    }


    @RequestMapping (value="/inserisci_cliente", method= RequestMethod.GET)
    public String inserisci_cliente() {
        return "inserisci_cliente";
    }

    @RequestMapping (value="/taskAdd", method= RequestMethod.GET)
    public String taskAdd() {
        return "task_add";
    }

    @RequestMapping (value="/taskSearch", method= RequestMethod.GET)
    public String taskSearch() {
        return "task_search";
    }


    @ResponseBody
    @GetMapping(value="/getAppConfig")
    public String getAppConfig() throws IOException {
        String appConfigFile=new String(appConfig.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
        appConfigFile= appConfigFile.replace("{clientId}", UuidUtil.getTimeBasedUuid().toString());
        return appConfigFile;
    }





}
