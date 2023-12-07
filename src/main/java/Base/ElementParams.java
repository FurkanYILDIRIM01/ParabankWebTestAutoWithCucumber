package Base;

public class ElementParams {
    public static String registerCSS = "#loginPanel > p:nth-child(3) > a";
    public static String registerFirstName = "customer.firstName";
    public static String registerLastName = "customer.lastName";
    public static String registerAddress = "customer.address.street";
    public static String registerCity = "customer.address.city";
    public static String registerState = "customer.address.state";
    public static String registerZipCode = "customer.address.zipCode";
    public static String registerPhoneNumber = "customer.phoneNumber";
    public static String registerSSN = "customer.ssn";
    public static String registerUsername = "customer.username";
    public static String registerPassword = "customer.password";
    public static String registerConfirm = "repeatedPassword";

    public static String registerBtnRegister = "#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input";

    public static String registerSuccessfulText = "#rightPanel > p:nth-child(2)";
    public static String loginSuccessfulText = "html body div#mainPanel div#bodyPanel div#rightPanel div.ng-scope div.ng-scope h1.title";

    public String paramsRead(String fieldName){
        String param = "";
        if (fieldName.equals("Register")) param = registerCSS;

        else if (fieldName.equals("FirstName")) param = registerFirstName;
        else if (fieldName.equals("LastName")) param = registerLastName;
        else if (fieldName.equals("Adress")) param = registerAddress;
        else if (fieldName.equals("City")) param = registerCity;
        else if (fieldName.equals("State")) param = registerState;
        else if (fieldName.equals("ZipCode")) param = registerZipCode;
        else if (fieldName.equals("PhoneNumber")) param = registerPhoneNumber;
        else if (fieldName.equals("SSN")) param = registerSSN;
        else if (fieldName.equals("Username")) param = registerUsername;
        else if (fieldName.equals("Password")) param = registerPassword;
        else if (fieldName.equals("Confirm")) param = registerConfirm;

        else if (fieldName.equals("registerBtnRegister")) param = registerBtnRegister;

        return param;
    }


}
