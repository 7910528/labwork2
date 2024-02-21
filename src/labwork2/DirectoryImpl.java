package labwork2;

import java.io.File;

/**
 * Implementation of the {@link IDirectory} interface for managing directories in a file system.
 */
public class DirectoryImpl implements IDirectory
{
    @Override
    public void create(String path)
    {
        System.out.println("Creating directory at path: " + path + "...");
        File directory = new File(path);
        if (!directory.exists())
        {
            if (directory.mkdir())
            {
                System.out.println("Directory created successfully.");
            }
            else
            {
                System.out.println("Failed to create the directory.");
            }
        }
        else
        {
            System.out.println("Directory already exists.");
        }
    }
    @Override
    public void rmdir(String path)
    {
        System.out.println("Deleting directory at path: " + path + "...");
        File directory = new File(path);
        if (directory.exists())
        {
            if (directory.delete())
            {
                System.out.println("Directory deleted successfully.");
            }
            else
            {
                System.out.println("Failed to delete the directory.");
            }
        }
        else
        {
            System.out.println("Directory does not exist.");
        }
    }
}