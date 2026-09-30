import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void checkIndex(int index) // question 1
    {
        if (files.isEmpty()) {
            System.out.println("The collection is empty. There are no valid indices.");
        } else if (index < 0 || index >= files.size()) {
            System.out.println("Error: Index " + index + " is out of range. Valid range is 0 to " + (files.size() - 1));
        }
    }
    public boolean validIndex(int index) // question 2
    {
        return index >= 0 && index < files.size();
    }
    
    public void listFile(int index) // question 3
    {
        if (validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) // question 4
    {
        if (validIndex(index)) {
            files.remove(index);
        }
    }
    public void listAllFiles() // question 5
    {
        for (String filename : files) {
            System.out.println(filename);
        }
    }
    public void listWithIndex() // question 6
    {
        int position = 0;
        for (String filename : files) {
            System.out.println(position + ":" + filename);
            position++;
        }
    }
    
    public void listMatching(String searchString) // question 7-10
    {
        boolean found = false;
        for (String filename : files) {
            if (filename.contains(searchString)) {
                System.out.println(filename);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching files found for " + searchString);
        }
    }
}
