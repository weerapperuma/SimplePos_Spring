package lk.ijse.util;

import java.util.UUID;

public class AppUtil {
    public static String createCustomerId(){return "CUSTOMER-"+ UUID.randomUUID();}
    public static String createItemId(){return "ITEM-"+ UUID.randomUUID();}
}
