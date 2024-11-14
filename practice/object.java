class nokia
{
    private int mic;
    private int cam;
    void setvalue()
    {
        mic=2;
        cam=30;
    }
    void display()
    {
        System.out.println(mic);
        System.out.println(cam);
    }
}
 public class object
 {
  public static void main(String[]args)
  {
   nokia n1 =new nokia();
   //n1.setvalue();
   n1.display();
  }

 }
