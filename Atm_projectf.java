import java.util.*;
import java.io.*;
class Atm_project
{ 
    public static String username;
    public static char[] password = new char[35];
    public static String pass;
    public static int phone_number;
    public static int pincode;
    public static String city;
    public static String address;
    public static int Flag=0;
    public static float balance=0;
    public static float amount;
    public static void Sign_up()
    {
        System.out.println(" ");
        System.out.println("                                        "+java.time.LocalDate.now()+" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* JMD Bank");
        System.out.println("                                        *-*-*-*-*- Welcome To The Registration Page *-*-*-*-*-");
        System.out.println("                                        *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        Console con = System.console();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("                                                      Enter Your Name : ");
        username=sc1.nextLine();
        System.out.println(" ");
        System.out.print("                                                      Enter Your Phone Number : ");
        phone_number=sc2.nextInt();
        System.out.println(" ");
        System.out.print("                                                      Enter Your Address : ");
        address=sc1.nextLine();
        System.out.println(" ");
        System.out.print("                                                      Enter Your City : ");
        city=sc1.nextLine();
        System.out.println(" ");
        System.out.print("                                                      Enter Your Pincode : ");
        pincode=sc2.nextInt();
        System.out.println(" ");
        System.out.print("                                                      Enter Your Password : ");
        char[] password=con.readPassword();
        pass = String.valueOf(password);
        //System.out.println("Password is : "+pass);
        System.out.println(" ");
        System.out.println("                                        | Congratulation "+username+" Your Account Has Been Succesfully Created in JMD Bank, "+city+" Branch at "+java.time.LocalDate.now()+" |");
        int choice1;
        System.out.println(" ");
        System.out.println("                                        +=="+java.time.LocalDate.now()+"==================================JMD Bank+");
        System.out.println("                                        |                 Press 1. For Log In                  |");
        System.out.println("                                        |                 Press 2. For Exit                    |");
        System.out.println("                                        +======================================================+");
        System.out.println(" ");
        System.out.print("                                                      Enter Your Choice : ");
        choice1 = sc3.nextInt();
        if(choice1 == 1)
        {
            Flag=1;
            Log_in();
        }
        else if(choice1 == 2)
        {
            System.out.println("Thank You "+username+" For Creating Account at JMD Bank, "+city);
            System.exit(1);
        }
        else
        {
            System.out.println("                                    Please Enter a Proper Input From Above Option ");
        }
    }
    public static void Log_in() 
    {
        String confirm_username;
        Scanner sc2 = new Scanner(System.in);
        Console con1 = System.console();
        if(Flag == 0)
        {
            username = "admin";
            pass="root";
            city="Ahmedabad";
            address="Main branch, Ahmedabad";
            phone_number=1234554321;
            pincode=321123;
            balance=100000;

        }
        System.out.println(" ");
        System.out.print("                                                      Enter Your Name : ");
        confirm_username = sc2.nextLine();
        System.out.println(" ");
        System.out.print("                                                      Enter Your Password : ");
        String confirm_password = sc2.nextLine();
        System.out.println(" ");
        if(username.equals(confirm_username))
        {
            if(pass.equals(confirm_password))
            {
                System.out.println("                                            Succesfully Logged In !!!");
                System.out.println("                                            Welcome "+username+" to JMD Bank, "+city+" Branch ATM Machine");
                Scanner sc3 = new Scanner(System.in);
                System.out.println(" ");
                System.out.println("                                        +---------------------------------------------------+");
                System.out.println("                                        |               Choose Language                     |");
                System.out.println("                                        |               1. English                          |");
                System.out.println("                                        |               2. Exit                             |");
                System.out.println("                                        +---------------------------------------------------+");
                System.out.println(" ");
                System.out.print("                                                      Enter Your Choice : ");
                int choice2 = sc3.nextInt();
                if(choice2==1)
                {
                    home_page();
                }
                else
                {
                    System.out.println("                                        Please Enter Proper Option");
                }
            }
            else
            {
                System.out.println("                                            Invald password !!!");
            }
        }
        else
        {
            System.out.println("                                        Wrong Username Please Enter Correct Information !!!");
        }
    }
    public static void home_page()
    {
        System.out.println("                                        +---------------------------------------------------+");
        System.out.println("                                        |               1. Withdraw Money                   |");
        System.out.println("                                        |               2. deposit Money                    |");
        System.out.println("                                        |               3. Balance Inquiry                  |");
        System.out.println("                                        |               4. Exit                             |");
        System.out.println("                                        +---------------------------------------------------+");  
        Scanner sc3 = new Scanner(System.in);
        while(1!=0)
        {
            System.out.println(" ");
            System.out.print("                                                      Enter Your Choice : ");   
            int choice3= sc3.nextInt();
            switch(choice3)
            {
                case 1: 
                        withdraw_money();
                        break;
                case 2:
                        deposit_money();
                        break;
                case 3:
                        balance_inquiry();
                        break;
                case 4:
                        System.exit(1);
                default:
                        System.out.println("                                        Invalid Option");

            }
        }
    }
    public static void withdraw_money()
    {
        Scanner sc4 = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("                                                      Enter Amount to Withdaraw : ");
        amount = sc4.nextFloat();   
        if(amount > balance)
        {
             System.out.println("                                                      You Don't Have Sufficient Money in Your Account Please Deposit Money");
             System.out.println(" ");
             System.out.println("                                        +---------------------------------------------------+");
             System.out.println("                                        |               1. Withdraw Money                   |");
             System.out.println("                                        |               2. Exit                             |");
             System.out.println("                                        +---------------------------------------------------+");
             System.out.println(" ");
             System.out.print("                                        Enter Your Choice : ");
             Scanner sc5 = new Scanner(System.in);
             int choice4 = sc5.nextInt();
             switch(choice4)
             {
                case 1:
                        deposit_money();
                        break;
                case 2:
                        System.exit(1);
                default:
                        System.out.println("                                        Invalid Option ");
             }
        }
        else if(amount == 0)
        {
            System.out.println("You are Withdrawing 0 Rs.");
            withdraw_money();
        }
        else
        {
            balance = balance - amount;
            System.out.println("                                        +------------------------------------------JMD Bank-+");
            System.out.println("                                        |               Transaction SuccesFull !!!          |");
            System.out.println("                                        +---------------------------------------------------+");
        }
    }
    public static void deposit_money()
    {
        Scanner sc6 = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("                                                      Enter Amount to Deposit : ");
        amount = sc6.nextFloat();
        if(amount<=0)
        {
            System.out.println("                                                      Depositing Invalid Amount");
            deposit_money();
        }
        else
        {
            balance = balance + amount;
            System.out.println("                                        +------------------------------------------JMD Bank-+");
            System.out.println("                                        |               Transaction SuccesFull !!!          |");
            System.out.println("                                        +---------------------------------------------------+");
        }
    }
    public static void balance_inquiry()
    {
        System.out.println(" ");
        System.out.println("                                        "+java.time.LocalDate.now()+" -------------------------------- JMD Bank");
        System.out.println("                                        =================== Balance Inquiry ================");
        System.out.println("                                        ----------------------------------------------------");
        System.out.println(" ");
        System.out.println("                                        Name : "+username);
        System.out.println(" ");
        System.out.println("                                        Balance : "+balance);
        System.out.println(" ");
        System.out.println("                                        Phone Number : "+phone_number);
        System.out.println(" ");
        System.out.println("                                        Address : "+address);
        System.out.println(" ");
        System.out.println("                                        Pincode : "+pincode);
        System.out.println(" ");
        System.out.println("                                        Branch (City) : "+city);
    }
    public static void main(String args[]) 
    {
        System.out.println(" ");
        System.out.println("                                        "+java.time.LocalDate.now()+" -------------------------------- JMD Bank");
        System.out.println("                                        =================== Welcome To ATM =================");
        System.out.println("                                        ----------------------------------------------------");    
        System.out.println(" ");
        System.out.println("                                        +---------------------------------------------------+");
        System.out.println("                                        |               1. Create a New Account             |");
        System.out.println("                                        |               2. Sign In                          |");
        System.out.println("                                        +---------------------------------------------------+");
        int choice=0;
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.print("                                        Enter Your Choice : ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                    Sign_up();
                    break;
            case 2:
                    Log_in();
                    break;
        }
    }
}