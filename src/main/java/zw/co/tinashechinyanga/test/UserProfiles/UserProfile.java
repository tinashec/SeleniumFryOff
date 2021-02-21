package zw.co.tinashechinyanga.test.UserProfiles;

/**
 * Created by Tinashe.Chinyanga on 9/1/2017.
 */
public enum UserProfile {
    NICKNAME("NIC"), NAME("yourName"), SURNAME("yourSurname"), EMAIL("youremail@provider.com"), NUMBER("yourMobileNumber");

    private String value;

    private UserProfile(String value){
        this.value = value;
    }

    public String getProfileValue(){
        return value;
    }
}
