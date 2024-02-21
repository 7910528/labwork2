package labwork2;

import java.io.File;
import java.io.IOException;

/**
 * Implementation of the {@link IFile} interface for managing files in a file system.
 */
public class FileImpl implements IFile
{
    @Override
    public void open(String path, boolean createIfNotExist)
    {
        System.out.println("Opening file at path: " + path + "...");
        if (!createIfNotExist)
        {
            System.out.println("File doesn't exist. Creating file at path: " + path + "...");
            try
            {
                new File(path).createNewFile();
                System.out.println("File created at path: " + path + ".");
            } catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        System.out.println("File opened at path: " + path + ".");
    }
    @Override
    public void close()
    {
        System.out.println("File closed.");
    }
    @Override
    public void delete(String path)
    {
        System.out.println("Deleting file at path: " + path + "...");
        if (new File(path).delete())
        {
            System.out.println("File deleted successfully.");
        }
        else
        {
            System.out.println("Failed to delete the file.");
        }
    }
}