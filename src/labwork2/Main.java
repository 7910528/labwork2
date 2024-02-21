package labwork2;

public class Main
{
    public static void main(String[] args)
    {
        FileSystemFacade fileSystemFacade = new FileSystemFacade();
        fileSystemFacade.create();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        fileSystemFacade.destroy();
    }
}