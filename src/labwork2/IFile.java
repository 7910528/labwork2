package labwork2;

import java.io.IOException;

/**
 * Interface representing a file in a file system.
 */
public interface IFile
{

    /**
     * Opens a file at the specified path.
     *
     * @param path            The path to the file.
     * @param createIfNotExist True if the file exists, false otherwise.
     * @throws IOException    If an I/O error occurs.
     */
    void open(String path, boolean createIfNotExist) throws IOException;
    /**
     * Closes the file.
     */
    void close();
    /**
     * Deletes the file at the specified path.
     *
     * @param path The path to the file to be deleted.
     */
    void delete(String path);
}