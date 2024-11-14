public class fan
{
    private String name;
    private String coil;
    private int wings;

    public fan(String name,String coil,int wings)
    {
        this.name=name;
        this.coil=coil;
        this.wings=wings;
    }
    public void getfanIformation()
    {
        System.out.println("company Name: " + name);
        System.out.println("coilType " + coil );
        System.out.println("wings " +wings );
    }
    public void switchOn()
     {
        System.out.println(name + " is now ON. It is running with " + wings + " wings and a " + coil + " coil.");
    }

    
    public void switchOff() 
    {
        System.out.println(name + " is now OFF.");
    }
    public static void main(String[]args)
    {
        fan newfan=new fan("bajaj","coper",3);
        newfan.getfanIformation();
    }
    
}
