import java.io.*;
import java.util.ArrayList;
public class Dorm {
    private ArrayList<Resident> list;
    public Dorm(){
        list = new ArrayList<Resident>();
    }
    public void openFile(String filename) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        list = (ArrayList<Resident>) in.readObject();
        in.close();
        fileIn.close();
    }

    public Resident getResident(String name){
        for (Resident res : list){
            if (res.getName().equals(name)){
                return res;
            }
        }
        return null;
    }
    public String getResidentList(){
        String roster = "";
        for (Resident res : list){
            roster += res.getName() + "\t" + res.getRoom() + "\n";
        }
        return roster;
    }

    public void add(Resident resident) throws IllegalArgumentException {
        if (getResident(resident.getName()) != null) {
            throw new IllegalArgumentException("Resident with the same name already exists.");
        }
        list.add(resident);
    }

    public void saveFile(String filename) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(list);
        out.close();
        fileOut.close();
    }
}
