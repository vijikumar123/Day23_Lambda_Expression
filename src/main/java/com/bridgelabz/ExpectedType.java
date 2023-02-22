package com.bridgelabz;

        public class UserRegistrationMain extends Exception {
         public ExpectedType type;

public enum ExpectedType {
    FIRSTNAME, LASTNAME, MOBILENUMBER, EMAIL, PASSWORD
}

            public  UserRegistrationMain(String message, ExpectedType type) {
                super(message);
                this.type = type;
            }
}

