package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
    static String userFirstName = "^[A-Z][a-zA-Z]{3,}";
    static String userLastName = "^[A-Z][a-zA-Z]{3,}";
    static String userEmail = "^[A-Za-z0-9]+(.[A-Za-z0-9]+)*@[^_\\W]+(.[^_\\W]+)?(?=(.[^_\\W]{3,}$|.[a-zA-Z]{2}$)).*$";
    static String userMobileNumber = "^(91)?[7-9][0-9]{9}";
    static String userPassword = ("^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$");

    //Validate First Name using Lambda Function
    public static ValidateFirstName validateFirstName = (String firstName) ->{
        Pattern pattern = Pattern.compile(userFirstName);
        Matcher matcher = pattern.matcher(firstName);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationMain("Enter Valid First Name ", UserRegistrationMain.ExpectedType.FIRSTNAME);
            }
        } catch (UserRegistrationMain e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    //Validate last Name using Lambda Function
    public static ValiudateLastName validateLastName = (Stringl lastName) ->{
        Pattern pattern = Pattern.compile(userLastName);
        Matcher matcher = pattern.matcher(lastName);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationMain("Enter Valid Last Name ", UserRegistrationMain.ExpectedType.LASTNAME);
            }
        } catch (UserRegistrationMain e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    //Validate Email using Lambda Function
    public static ValidateEmail validateEmail = (String email) ->{
        Pattern pattern = Pattern.compile(userEmail);
        Matcher matcher = pattern.matcher(email);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationMain("Enter Valid Email", UserRegistrationMain.ExpectedType.EMAIL);
            }
        } catch (UserRegistrationMain e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    //Validate MobileNumber using Lambda Function
    public static ValidateMobileNumber validateMobileNumber = (String mobileNumber) ->{
        Pattern pattern = Pattern.compile(userMobileNumber);
        Matcher matcher = pattern.matcher(mobileNumber);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationMain("Enter Valid MobileNumber", UserRegistrationMain.ExpectedType.MOBILENUMBER);
            }
        } catch (UserRegistrationMain e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    //Validate Password using Lambda Function
    public static ValidateEmail validatePassword = (String password) ->{
        Pattern pattern = Pattern.compile(userPassword);
        Matcher matcher = pattern.matcher(password);
        try {
            if(matcher.matches()) {
                return true;
            }else {
                throw new UserRegistrationMain("Enter Valid Password", UserRegistrationMain.ExpectedType.PASSWORD);
            }
        } catch (UserRegistrationMain e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };

    public static void main(String[] args) {

        System.out.println("---------- Welcome To User Registration ----------");

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        String firstName = scannerObject.next();
        try {
            validateFirstName.ValidateFirstName(firstName);
        } catch (UserRegistrationMain e) {
            e.printStackTrace();
        }

        System.out.println("Enter Your Last Name");
        String lastName = scannerObject.next();
        try {
            ValiudateLastName.validateLastName(lastName);
        } catch (UserRegistrationMain e) {
            e.printStackTrace();
        }

        System.out.println("Enter Your Email Address");
        String email = scannerObject.next();
        try {
            validateEmail.validateEmail(email);
        } catch (UserRegistrationMain e) {
            e.printStackTrace();
        }

        System.out.println("Enter Your Mobile Number");
        String mobileNumber = scannerObject.next();
        try {
            validateMobileNumber.validateMobileNumber(mobileNumber);
        } catch (UserRegistrationMain e) {
            e.printStackTrace();
        }

        System.out.println("Enter Your Password");
        String password = scannerObject.next();
        try {
            ValidatePassWord validatePassWord2 = new ValidatePassWord();
            validatePassWord2.validatePassword(password);
        } catch (UserRegistrationMain e) {
            e.printStackTrace();
        }

        scannerObject.close();

    }
}
