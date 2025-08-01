class break{
    public static void main(String[] args) {
       int amount=3700;
       int thousands=amount/1000;
       int remainingthousands=amount%1000;
       int fivehundreds=remainingthousands/500;
       int remaining=remainingthousands%500;
       System.out.println( "thousands is : " + thousands);
       System.out.println( "fivehundreds is : " + fivehundreds);
       System.out.println( "remaining is : " + remaining);
    }
}
