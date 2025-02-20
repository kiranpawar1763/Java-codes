class ex1
{
    public static void main (String[]args)
  {
    new Thread(new Runnable()
    {
        @Override
        public void run()
        {
            System.out.println("naresh i technologies");
        }
    }).start();
    System.err.println(new Thread().isAlive());
  }

}