import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class DataReader {
    public static void main(String[] args) throws Exception {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("ass4.csv"));
            String line = null;

            while((line = in.readLine()) != null){
                Scanner scanner = new Scanner(new StringReader(line));
                if(line.startsWith("A")  || line.startsWith("P")){
                    scanner.useDelimiter(",");
                    while(scanner.hasNext()){
                        String landType  = scanner.next();
                        String regionS = scanner.next();
                        double landValue = scanner.nextDouble();
                        DataWriter.writeLandDataToFile(regionS, landType, landValue);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        } finally{
            if(in != null)
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        
        System.out.println("Successful");
    }
}
