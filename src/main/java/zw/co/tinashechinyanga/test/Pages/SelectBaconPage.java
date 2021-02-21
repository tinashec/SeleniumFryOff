package zw.co.tinashechinyanga.test.Pages;

import zw.co.tinashechinyanga.test.Utils.CommonUtils;

/**
 * Created by Tinashe.Chinyanga on 8/20/2017.
 */
public class SelectBaconPage extends CommonUtils {
    public static final String baseUrl = "http://colcom.co.zw";
    public static final String fryOff = "fryoff";

    public void selectBacon(String bacon){
        switch (bacon){
            case VALUE_BACON:
                getElement(VALUE_BACON).click();
                break;
            case STREAKY_BACON:
                getElement(STREAKY_BACON).click();
                break;
            case MIDDLE_CUT_BACON:
                getElement(MIDDLE_CUT_BACON).click();
                break;
            case PREMIUM_BACON:
                getElement(PREMIUM_BACON).click();
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
    }

    public void navigateToFryOff(){
        navigateTo(baseUrl + "/" + fryOff);
    }
}
