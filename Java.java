public class Java extends LenguajesProgramacion{
    
    public static final String RESET = "\u001B[0;37m";
    public static final String BLACK_BOLD_BRIGHT = "\033[1;30m";
    
    String OS;

    public Java(String name, String paradig, String compilation, boolean typing, String extension) {
        super(name, paradig, compilation, typing, extension);
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void printOS(){
        System.out.println(BLACK_BOLD_BRIGHT + "Sistemas operativos soportados: " + RESET + this.OS);
    }
}
