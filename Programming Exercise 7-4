import java.util.*;
public class ValidatePassword 
{
    public static void main(String[] args) 
    {
        boolean validPassword = false;
        boolean check1, check2, check3;
        int lowercount = 0;
        int uppercount = 0;
        int digitcount = 0;
        String password;
        Scanner scan = new Scanner(System.in);

        while(validPassword == false)
            {
                System.out.println("Enter a Password with at least 2 uppercase,3 lowercase charcters and at least one digit");
                password = scan.nextLine();
                for(int x = 0; x < password.length(); ++x)
                    {
                        if(Character.isUpperCase(password.charAt(x)))
                            {
                                ++uppercount;
                            }
                        if(Character.isLowerCase(password.charAt(x)))
                            {
                                ++lowercount;
                            }
                        if(Character.isDigit(password.charAt(x)))
                            {
                                ++digitcount;
                            }
                    }

                if(uppercount >= 2)
                    {
                        check1 = true;
                    }
                else
                    {
                        check1 = false;
                    }
                if(lowercount >= 3)
                    {
                        check2 = true;
                    }
                else
                    {
                        check2 = false;
                    }
                if(digitcount >= 1)
                    {
                        check3 = true;
                    }
                else
                    {
                        check3 = false;
                    }
                
                if(check1 && check2 && check3)
                    {
                        validPassword = true;
                        System.out.println("Valid Password");
                    }
                else
                    {
                        System.out.println("The password did not have enough of the following:");
                        if (check1 == false)
                            {
                                System.out.println("uppercase letters");
                            }
                        if (check2 == false)
                            {
                                System.out.println("lowercase letters");
                            }
                        if (check3 == false)
                            {
                                System.out.println("digits");
                            }
                    }
                
            }
    }
}
