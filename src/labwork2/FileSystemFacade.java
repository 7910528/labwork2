package labwork2;

import java.io.File;
import java.io.IOException;

/**
 * Facade class for managing files and directories in a file system.
 */
public class FileSystemFacade
{
    private IFile file;
    private IDirectory directory;
    /**
     * Constructor to initialize the file and directory implementations.
     */
    public FileSystemFacade()
    {
        this.file = new FileImpl();
        this.directory = new DirectoryImpl();
    }
    /**
     * Creates the subsystem by creating files and directories.
     */
    public void create()
    {
        System.out.println("Creating subsystem...");
        try
        {
            file.open("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\file1.txt", new File("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\file1.txt").exists());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        file.close();
        try
        {
            file.open("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\file2.txt", new File("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\file2.txt").exists());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        file.close();
        try
        {
            file.open("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\file3.txt", new File("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\file3.txt").exists());
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        file.close();
        directory.create("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\dir1");
        directory.create("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\dir2");
        System.out.println("Subsystem created.");
    }
    /**
     * Destroys the subsystem by deleting files and directories.
     */
    public void destroy()
    {
        System.out.println("Destroying subsystem...");
        file.delete("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\file1.txt");
        file.delete("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\file2.txt");
        file.delete("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\file3.txt");
        directory.rmdir("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\dir1");
        directory.rmdir("D:\\учёба\\II курс II семестр\\SAAD\\Laboratory work 1.2\\dir2");
        System.out.println("Subsystem destroyed.");
    }
}