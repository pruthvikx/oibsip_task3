import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();

        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");

            while(true){
                System.out.println("1.Transaction History\n" +
                        "2.Withdraw \n3.Deposit \n4.Transfer\n5.Quit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if(ch==1){

                    op.viewMiniStatement();

                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();//5000
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.viewBalance();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n " +
                            "Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }


    }
}