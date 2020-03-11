package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    //public WebDriver driver;

    public static WebDriver getDriver(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().version("79.0").setup();
            return new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            return new SafariDriver();
        } else {
            return null;
        }
    }
}//}else if (browser.equalsIgnoreCase("opera")){
//WebDriverManager.operadriver().setup();
//return new OperaDriver();
//}else if (browser.equalsIgnoreCase("edge")){
//WebDriverManager.edgedriver().version("80.0.361.66").setup();
//return null; //new EdgeDriver();

//WebDriverManager.safaridriver.setup();

//type in "edge" in the driver and you get null