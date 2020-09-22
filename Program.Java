import System;
import System.Reflection.Metadata;

namespace PaymentwiithDiscount {
    
    interface IbankwithDiscount {
        
        Decimal BalancewithDiscount(string userName);
    }
    
    class BankBalance extends IbankwithDiscount {
        
        private Decimal discount;
        
        public final Decimal BalancewithDiscount(string userName) {
            //  You should fetch User from DB. I have just hardoced the UserName
            this.discount = 0;
            if ((userName == "Danish".ToLower())) {
                this.discount = Constantfile.ten;
            }
            else if ((userName == "Taj".ToLower())) {
                this.discount = Constantfile.twentytwo;
            }
            
            return this.discount;
        }
    }
    
    class Program {
        
        static void Main(string[] args) {
            Console.WriteLine("Enter the UserName");
            string UserName = Console.ReadLine();
            BankBalance bb = new BankBalance();
            Decimal discount = bb.BalancewithDiscount(UserName);
            Decimal amount = Constantfile.amount;
            Decimal Balance = (amount - discount);
            Console.WriteLine(Balance);
        }
    }
}
 
