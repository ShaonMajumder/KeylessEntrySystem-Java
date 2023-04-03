import java.io.IOException;
import java.util.Scanner;

public class SampleCreateResidentFile {

    public static void main(String[] args) throws IOException {
        Resident res;
        Dorm manager = new Dorm();

        res = new Resident("john", "1-101", "1AB#2!xb");
        manager.add(res);

        res = new Resident("java", "1-102", "XXyy22&#");
        manager.add(res);

        res = new Resident("jill", "3-232", "!#DxA2a4");
        manager.add(res);

        res = new Resident("jack", "3-232", "2%Az8#Qm");
        manager.add(res);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Save to which file:");
        String filename = scanner.next();

        System.out.println(manager.getResidentList());

        manager.saveFile(filename);
        System.exit(0); //terminate the program
    }

}
