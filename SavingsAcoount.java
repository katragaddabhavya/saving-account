import java.util.Scanner;
public class SavingsAcoount {
    String accountholdername;
    long accountnumber;
    double balanceamount=200003;
    String status;
    String accounttype;

    public double getBalanceamount(){
        return balanceamount;
    }
    public double getcreditedamount(double creditcash){
        balanceamount=balanceamount+creditcash;
        return balanceamount;
    }
    public double getdebitamount(double debitcash){
        balanceamount=balanceamount-debitcash;
        return balanceamount;
    }
    public double gettransferbalance(double transferamount){
        balanceamount=balanceamount-transferamount;
        return balanceamount;
    }
    public void displaymenu(){
        System.out.println("1:cash withdraw");
        System.out.println("2:check balance");
        System.out.println("3:amount transfer");
        System.out.println("4:deposit cash ");
    }

    public static void main(String[] args){

        SavingsAcoount obj=new SavingsAcoount();
        Scanner Sc=new Scanner(System.in);
        obj.accountholdername= "john";
        System.out.println("enter accountnumber");
        obj.accountnumber=Sc.nextLong();
        obj.accounttype ="self";
        obj.status ="active";
        obj.displaymenu();
        System.out.println("enter 3 creditcash ,1 for check balance,4 for amount transfer,2 debit cash");
        int choice=Sc.nextInt();
        switch(choice){
            case 1:
            {
                System.out.println(obj.getBalanceamount());
                break;
            }
            case 2:
                System.out.println("enter debit cash");
                double debitcash=Sc.nextDouble();
                System.out.println("balance after debiting :"+ obj.getdebitamount(debitcash));
                break;
            case 3:
                System.out.println("enter credit cash");
                double creditcash=Sc.nextDouble();
                System.out.println("balance after crediting :"+ obj.getcreditedamount(creditcash));
                break;
            case 4:
                System.out.println("enter transfer amount");
                double transferamount=Sc.nextDouble();
                System.out.println("available balance"+ obj.gettransferbalance(transferamount));
                break;
        }






    }


}