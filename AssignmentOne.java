import java.util.Scanner;

public class AssignmentOne {

    public static void main(String[] args) {

        String id = "abc@gmail.com";
        String pass = "12345";
        int bal = 10000;
        int r2000, r500, r200, r100, r50;
        int choice;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your user id : ");
        String uid = sc.nextLine();
        System.out.print("Enter your password : ");
        String upass = sc.nextLine();

        if (id.equalsIgnoreCase(uid) && pass.equals(upass)) {
            System.out.println("*****LOGIN SUCCESSFUL*****");

            do {
            System.out.println("0. Exit");
            System.out.println("1. Change Password");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
              switch (choice) {
            case 0: {
              System.out.println("Thankyou for your visit!");
            }
            System.out.println( );

            case 1: {
               sc.nextLine();
                System.out.print("Enter your current Password : ");
                //Scanner sc1 = new Scanner(System.in);
                String upass1 = sc.nextLine();
                if (pass.equals(upass1)) {
                    System.out.print("Enter new Password : ");
                    String newpass = sc.nextLine();
                    System.out.print("Confirm your new Password : ");
                    String conpass = sc.nextLine();

                    if (newpass.equals(conpass)) {
                        System.out.println("Password updated.");
                        pass = newpass;
                    } else {
                        System.out.println("Enter same password in both fields.");
                    }
                } else {
                    System.out.println("Enter valid password.");
                }
               // sc1.close();

                break;

            }

            case 2: {
                System.out.println("Your Balance is : " + bal);
                break;
            }
            case 3: {
                System.out.print("Enter Amount to be deposited : ");
                double depositamount = sc.nextDouble();
                bal += depositamount;

                if (depositamount >= 50 && depositamount % 50 == 0) {
                    if (depositamount != 0) {
                        r2000 = (int) depositamount / 2000;
                        depositamount = depositamount % 2000;

                        if (depositamount != 0) {
                            r500 = (int) depositamount / 500;
                            depositamount = depositamount % 500;

                            if (depositamount != 0) {
                                r200 = (int) depositamount / 200;
                                depositamount = depositamount % 200;

                                if (depositamount != 0) {
                                    r100 = (int) depositamount / 100;
                                    depositamount = depositamount % 100;

                                    if (depositamount != 0) {
                                        r50 = (int) depositamount / 50;
                                        depositamount = depositamount % 50;

                                    }

                                }
                            }
                        }
                        System.out.println("Amount deposited successfully.");
                        System.out.println("Your curent balance is : " + bal);
                    }

                } else {
                    System.out.println("Enter valid amount");
                }
                break;
            }
            case 4: {
                System.out.print("Enter amount to withdraw : ");
                double withdrawamount = sc.nextDouble();
                bal -= withdrawamount;
                if (withdrawamount >= 50 && withdrawamount % 50 == 0) {
                    if (withdrawamount != 0) {
                        r2000 = (int) withdrawamount / 2000;
                        withdrawamount = withdrawamount % 2000;

                        if (withdrawamount != 0) {
                            r500 = (int) withdrawamount / 500;
                            withdrawamount = withdrawamount % 500;

                            if (withdrawamount != 0) {
                                r200 = (int) withdrawamount / 200;
                                withdrawamount = withdrawamount % 200;

                                if (withdrawamount != 0) {
                                    r100 = (int) withdrawamount / 100;
                                    withdrawamount = withdrawamount % 100;

                                    if (withdrawamount != 0) {
                                        r50 = (int) withdrawamount / 50;
                                        withdrawamount = withdrawamount % 50;

                                    }

                                }
                            }
                        }
                        System.out.println("Amount withdrawn successfully.");
                        System.out.println("Your curent balance is : " + bal);
                    }

                } else {
                    System.out.println("Enter valid amount");
                }

                break;
            }

            default: {
                System.out.println("Invalid choice!");
                break;
            }

            }
            } while (choice != 0);
            

        } else {
            System.out.println("User Id does not match.");
        }

        sc.close();
    }
}