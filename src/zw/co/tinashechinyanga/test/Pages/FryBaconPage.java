package zw.co.tinashechinyanga.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import zw.co.tinashechinyanga.test.Utils.CommonUtils;
import zw.co.tinashechinyanga.test.Utils.DriverUtils;

/**
 * Created by Tinashe.Chinyanga on 8/20/2017.
 */
public class FryBaconPage extends CommonUtils{

    public static WebElement getPanElement(int id){
        return getElement("pan" + id + "val");
    }

    public static void removeReadyPanElement(WebElement pan, WebDriver chromeDriver, String baconType) {
        if(pan.getAttribute("value").contentEquals("4")){
            System.out.println(pan.getAttribute("id") + " " + pan.getAttribute("value"));

            String xpathStart = "//img[@src='images/bacon/";
            String xpathBaconType = baconType;
            String xpathEnd = "-3.gif']";

            WebElement img = chromeDriver.findElement(By.xpath(xpathStart + xpathBaconType + xpathEnd));

            System.out.println("Removing bacon " + pan.getAttribute("id"));
            if(img.isDisplayed()) {
                try {
                    img.click();
                } catch (ElementNotVisibleException notVisible) {
                    System.out.println(notVisible.getMessage());
                }
            }else {
                System.out.println("Element not visible. Trying different element.");
                new WebDriverWait(chromeDriver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathStart +
                xpathBaconType + "-4.gif']"))).click();
            }
        }
    }
}
