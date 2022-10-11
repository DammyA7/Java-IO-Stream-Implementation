public enum Region {
    STATE("State"),
    BORDER("Border"),
    MIDLAND("Midland"),
    WEST("West"),
    DUBLIN("Dublin"),
    MID_EAST("Mid-East"),
    MID_WEST("Mid-West"),
    SOUTH_EAST("South-East"),
    SOUTH_WEST("South-West");

    private final String region;

    //private enum constructor
    private Region(String region){
        this.region = region;
    }

    public String getRegionName(){
        //returns Region name
        return region;
    }


}
