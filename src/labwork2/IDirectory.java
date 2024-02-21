package labwork2;

/**
 * Interface representing a directory in a file system.
 */
public interface IDirectory
{

    /**
     * Creates a directory at the specified path.
     *
     * @param path The path to the directory to be created.
     */
    void create(String path);
    /**
     * Removes the directory at the specified path.
     *
     * @param path The path to the directory to be removed.
     */
    void rmdir(String path);
}