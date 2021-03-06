import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer70
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    //private String [] files2 = new String [1000];
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer70()
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
    public void listFile(int index)
    {
        if(isValidIndex(index)==true){
            if(index >= 0 && index < files.size()) {
                String filename = files.get(index);
                System.out.println(filename);
            }
        }else{

        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(isValidIndex(index)==true){
            if(index >= 0 && index < files.size()) {
                files.remove(index);
            }
        }else{
            
        }
    }

    public void checkIndex(int valorIndice){
        if(!(valorIndice > files.size())&&!(valorIndice < 0)){
            System.out.println("El rango valido es de: " + files.size());
        }else{

        }
    }

    public boolean isValidIndex (int isValorIndice){
        if(!(isValorIndice > files.size())&&!(isValorIndice < 0)){
            return true;
        }else{
            return false;
        }
    }


}
