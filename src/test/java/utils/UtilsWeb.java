package utils;

import webdriver.Driver;

public class UtilsWeb {

    private static final String URL = "https://blogdoagi.com.br";

    public static void inicializar(){
        Driver.getDriver().get(URL);
        Driver.getDriver().manage().window().maximize();
    }

    public static void finalizar(){
        if(Driver.getDriver() != null){
            Driver.getDriver().quit();
            Driver.setDriver(null);
        }
    }
}
