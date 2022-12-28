

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Imp_Atm{

    void viewBalance();
    void withdraw_Amount(double withdraw);
    void deposit_Amount(double deposit);
    void miniStatement();
}

class Atm_method implements Imp_Atm {

    HashMap<Double , String> miniState = new HashMap<>();

    double balance = 50000;

   public void viewBalance() {
       System.out.println("Available Balance Is : " +balance);
    }


    public void withdraw_Amount(double withdraw) {

       Scanner s = new Scanner(System.in);
       double charge = 5.50;
       if(balance >= withdraw) {
           if(withdraw % 100 == 0) {
               miniState.put(withdraw, "Withdraw_Amount");
               System.out.println("Collect Your Case :"+withdraw);
               balance = balance - withdraw - charge;
               System.out.println("Cut Atm Charge : "+charge);
               viewBalance();

           }
           else {
               System.out.println("Please Enter Amount Multiple Of 100 only : ");
               System.out.println("Enter Your Amount : ");
               double Amount = s.nextInt();
               withdraw_Amount(Amount);
           }

       }
       else {
           System.out.println("Your Balance is Insufficient :");
       }
    }

    public void deposit_Amount(double deposit) {

        miniState.put(deposit, "Deposit_Amount");
        System.out.println("Deposited Has Been Successfully : "+deposit);
        balance = balance + deposit;
        viewBalance();

    }

    public void miniStatement() {

       for(Map.Entry<Double, String> m : miniState.entrySet()) {

           System.out.println(m.getKey()+" "+m.getValue());
       }
       viewBalance();

    }


}

public class ATM_Using_Switch_Case {
    public static void main(String[] args) {

        //Reference Interface And Object Of Class

        Imp_Atm obj = new Atm_method();
        Scanner s = new Scanner(System.in);

        int atm_no = 995578;
        int atm_pin = 5161;

        System.out.println("Welcome To The Atm!");
        System.out.println("Select your language!");
        System.out.println("1.English\n2.Hindi");
        System.out.print("Choose your language! :");
        int opt = s.nextInt();

        if(opt == 1) {

            while(true) {
                System.out.println("1.viewBalance\n2.withdrawAmount\n3.depositAmount\n4.miniStatement\n5.exit");
                System.out.println("What's Your Choice! :");
                int num = s.nextInt();

                System.out.println("Enter Atm_Number:");
                int atm_num = s.nextInt();

                System.out.println("Enter Atm_pin :");
                int atm_Pin = s.nextInt();
                if (atm_no == atm_num && atm_pin == atm_Pin) {

                    switch (num) {
                        case 1 : obj.viewBalance();

                        case 2: 
                            System.out.println("How Many withdraw_Amount From The ATM : ");
                            double withdraw_Amount = s.nextInt();
                            obj.withdraw_Amount(withdraw_Amount);
                        break;

                        case 3:                             System.out.print("How Many Amount Deposit To the Bank :");
                            double deposit = s.nextInt();
                            obj.deposit_Amount(deposit);
                        break;

                        case 4:
                            obj.miniStatement();
                        break;

                        case 5: 
                            System.out.print("Thank You For Using This Atm : ");
                            System.exit(0);
                        break;

                        default : 
                            System.out.println("You choose Invalid Number : ");
                    }
                }
                else {
                        System.out.println("Your Atm_Number And Atm_pin is Wrong : ");
                        System.out.println("Please ReEnter Your Atm_Number : ");
                        int atm_n = s.nextInt();

                        System.out.println("Please ReEnter Atm_Pin : ");
                        int atm_p = s.nextInt();

                        if (atm_no == atm_n && atm_pin == atm_p) {

                            while (true) {

                                System.out.println("1.viewBalance\n2.withdrawAmount\n3.depositAmount\n4.miniStatement\n5.exit");
                                System.out.println("What's Your Choice : ");
                                int num1 = s.nextInt();

                                switch (num1) {
                                    case 1 : 
                                        obj.viewBalance();

                                    case 2 :
                                        System.out.print("How Many withdraw_Amount From The ATM : ");
                                        double withdraw_Amount = s.nextInt();
                                        obj.withdraw_Amount(withdraw_Amount);
                                    break;

                                    case 3 : 
                                        System.out.println("How Many Amount Deposit To the Bank :");
                                        double deposit = s.nextInt();
                                        obj.deposit_Amount(deposit);
                                    break;

                                    case 4 : 
                                        obj.miniStatement();
                                    break;

                                    case 5 :
                                        System.out.println("Thank You For Using This Atm : ");
                                        System.exit(0);
                                    break;

                                    default : 
                                        System.out.println("You Choose Invalid Number : ");
                                }

                            }
                        }
                        else {
                            System.out.println("Your_Pin Is Wrong you Cannot perform Any operation : ");
                            System.exit(0);
                        }

                }
            }

        }
        else if(opt == 2) {

            while(true) {
                System.out.println("1.paise_dekhe\n2.paisa_nikale\n3.paisa_jama_kare\n4.pichhala_rashid_nikale\n5.exit");
                System.out.println("Es me se Koi Ek Ko chune : ");
                int num2 = s.nextInt();

                System.out.println("Apna Atm_Number Darg kare : ");
                int atmn = s.nextInt();

                System.out.println("apna atm_pin darg kare : ");
                int atmp = s.nextInt();

                if(atm_no == atmn  && atm_pin == atmp) {

                    switch (num2) {
                        case 1 : obj.viewBalance();
                                break;
                        case 2 :
                            System.out.println("How Many withdraw_Amount From The ATM : ");
                            double withdraw_Amount = s.nextInt();
                            obj.withdraw_Amount(withdraw_Amount);
                            break;

                        case 3: 
                            System.out.print("How Many Amount Deposit To the Bank :");
                            double deposit = s.nextInt();
                            obj.deposit_Amount(deposit);
                        break;

                        case 4:
                            obj.miniStatement();
                        break;

                        case 5:
                            System.out.print("Thank You For Using This Atm : ");
                            System.exit(0);
                        break;

                        default : 
                            System.out.println("You choose Invalid Number : ");
                        break;
                    }
                }
                else {
                    System.out.println("Aapka Atm_number or Atm_pin galat hai :");
                    System.exit(0);
                }

            }



        }
        else {

            System.out.println("You Choose Invalid Number! :");
        }

    }
}
