package ie.oldtowner.newgiflib.web;

/**
 * Created by walshejo on 09/02/2017.
 */
public enum Color {
    AQUA("Aqua","#59b3b3"),
    BLUE("Blue","#5976b3"),
    PURPLE("Purple","#7e59b3"),
    FUCHSIA("Fucshia","#b35986"),
    ORANGE("Orange","#b36859"),
    GOLD("Gold","#b38f59");

    private final String name;
    private final String hexCode;

    Color(String name, String hexCode){
        this.hexCode=hexCode;
        this.name=name;
    }

    public String getName(){return name;}

    public String getHexCode() {
        return hexCode;
    }
}
