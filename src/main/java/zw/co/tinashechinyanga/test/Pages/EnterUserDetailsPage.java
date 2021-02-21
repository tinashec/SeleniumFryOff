package zw.co.tinashechinyanga.test.Pages;

import zw.co.tinashechinyanga.test.Utils.CommonUtils;

/**
 * Created by Tinashe.Chinyanga on 8/23/2017.
 */
public class EnterUserDetailsPage extends CommonUtils {
//    public WebElement nicknameField, firstNameField, surnameField, cellphoneField, emailField, submitButton;

    public void enterNickname(String nickname){
        getElement("Nickname").sendKeys(nickname);

    }

    public void enterFirstname(String firstname){
        getElement("FirstName").sendKeys(firstname);
    }

    public void enterSurname(String surname){
        getElement("Surname").sendKeys(surname);
    }

    public void enterCellphone(String mobileNumber){
        getElement("Cell").sendKeys(mobileNumber);
    }

    public void enterEmail(String email){
        getElement("Email").sendKeys(email);
    }

    public void clickSubmitButton(){
        getElementByCss("[class='pay-button']").click();
    }
}
