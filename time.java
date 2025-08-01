class time{
    public static void main(String[] args) {
       int totalseconds=3672;
       int hours=(totalseconds)/3600;
       int remaininghours=totalseconds%3600;
       int minutes=remaininghours/60;
       int seconds=remaininghours%60;
       System.out.println("hours is :"+ hours);
       System.out.println("minutes is :"+ minutes);
        System.out.println("seconds is :"+ seconds);
    }
}
