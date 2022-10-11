import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataWriter {
    public static void writeLandDataToFile(String filename, String landType, double landValue){
        Region[] region = Region.values();
        Region fileName = null;
        for(Region place : region){
            if(filename.equals(place.getRegionName())){
                Region reg = place;
                switch (reg) {
                    case DUBLIN:
                        fileName = Region.DUBLIN;
                        break;
                        
                    case MIDLAND:
                        fileName = Region.MIDLAND;
                        break;
        
                    case WEST:
                        fileName = Region.WEST;
                        break;
                    
                    case MID_EAST:
                        fileName = Region.MID_EAST;
                        break;
                    case MID_WEST:
                        fileName = Region.MID_WEST;
                        break;

                    case SOUTH_EAST:
                        fileName = Region.SOUTH_EAST;
                        break;
                    
                    case SOUTH_WEST:
                        fileName = Region.SOUTH_WEST;
                        break;

                    case BORDER:
                        fileName = Region.BORDER;
                        break;

                    case STATE:
                        fileName = Region.STATE;
                        break;
                }
            }
        }
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileWriter(fileName.getRegionName(), true));
            pw.format("The land use type is %s and the value of the land is %s\n", landType, String.valueOf(landValue));
        }
        catch(IOException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        } finally{
            pw.close();
        }
        
        
    }
}
