package day35_OOP_Encapsulation.Credentials;

public class Credentials {
    private String username, password;

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrongPassWord(password)){
            System.err.println("Password \""+password+"\" is not a strong password");
            System.exit(1);
        }
        this.password = password;
    }

    public boolean isStrongPassWord(String password) {
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;

        for (char each : password.toCharArray()) {
            r2 = (Character.isUpperCase(each)) ? true : (Character.isSpaceChar(each)) ? true : (Character.isDigit(each)) ? true : (Character.isLowerCase(each)) ? true : false;
        }

        return r1 && r2;

    }


    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

/*
2. create a class named Credentials
            Variables:
                username, password
            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit
                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password
                toString():
            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
 */
