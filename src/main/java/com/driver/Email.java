package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(!oldPassword.equals(this.password))
        {
            System.out.println("Old password entered is incorrect");
        }
        else if(newPassword.length() < 8)
        {
            System.out.println("Passwords length should be more than or equal to 8 characters");
        }
        else
        {
            boolean upper = false, lower = false, digit = false, special = false;
            for(int i=0 ; i<newPassword.length() ; i++)
            {
                if(lower && upper && digit && special)
                {
                    break;
                }
                char ch = newPassword.charAt(i);
                if(ch >= '0' && ch <= '9')
                {
                    digit = true;
                }
                else if(ch >= 'a' && ch <= 'z')
                {
                    lower = true;
                }
                else if(ch >= 'A' && ch <= 'Z')
                {
                    upper = true;
                }
                else
                {
                    special = true;
                }
            }
            if(lower && upper && digit && special)
            {
                this.password = newPassword;
                System.out.println("Password changed successfully");
            }
            else
            {
                System.out.println("Password should contain atleast one uppercase letter, one lowercase letter, one digit and one special character");
            }
        }
    }
}
