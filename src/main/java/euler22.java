import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class euler22 {

    public static void main(String[] args) {

       List<String> imiona;
        try {
            File myObj = new File("C:\\Users\\p4wel\\Desktop\\names.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                data = data.replaceAll("\"","");

                imiona = new ArrayList<>(Arrays.stream(data.split(",")).toList());

                java.util.Collections.sort(imiona);

            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();



        }


    }
}