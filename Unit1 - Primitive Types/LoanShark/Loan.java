package LoanShark;

public class Loan {

    double principal;
    double rate;
    double time;
    int number;

    public Loan(double p, double r, double t, int n) {
       this.principal=p;
       this.rate=r;
       this.time=t;
       this.number=n;

    }
    double  calculateSimpleInterest(){
        return 0.0;
    }
     double  calculateTotalRepayment(){
        return principal * Math.pow(1 + rate/100/number, number*time);

    }


}