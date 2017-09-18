package zw.co.tinashechinyanga.test.UserProfiles;

/**
 * Created by Tinashe.Chinyanga on 9/1/2017.
 */
public enum TinasheProfile{
    NICKNAME("T6"), NAME("Tinashe"), SURNAME("Chinyanga"), EMAIL("chinyangatj@gmail.com"), NUMBER("0777222134");

    private String value;

    private TinasheProfile(String value){
        this.value = value;
    }

    public String getProfileValue(){
        return value;
    }
}
