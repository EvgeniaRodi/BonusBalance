public class Main {
    public static void main( String[] args ) {
        int balance = 200;
        int bonusScale = 100;
        int balanceReplenishment = 1300;
        int bonus = 0;
        if ( balanceReplenishment >= 1000 ) {
            bonus = balanceReplenishment / bonusScale;
        }
        int totalBalance = balance + balanceReplenishment + bonus;
        System.out.println( "Пополнение " + balanceReplenishment + " руб." );
        System.out.println( "Бонусов начислено " + bonus + " руб." );
        System.out.println( "Баланс " + totalBalance + " руб." );
    }
}