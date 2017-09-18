package zw.co.tinashechinyanga.test.Utils;

import com.gargoylesoftware.htmlunit.DefaultCredentialsProvider;
import com.gargoylesoftware.htmlunit.WebClient;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Created by Tinashe.Chinyanga on 8/20/2017.
 */
public class DriverUtils {
    public static WebDriver driver, headlessDriver;

    public static WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriver getHeadlessDriver(){
        if(headlessDriver == null){
            headlessDriver = new HtmlUnitDriver(true);
        }
        return headlessDriver;
    }

    public static WebDriver getPhantomDriver(){
        if(driver == null){
            System.setProperty("phantomjs.binary.path", "C:\\Users\\tinashe.chinyanga\\Documents\\Exe\\phantomjs.exe");
            driver = new PhantomJSDriver();
        }
        return driver;
    }
}
