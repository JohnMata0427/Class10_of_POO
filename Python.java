public class Python extends LenguajesProgramacion{

    public static final String RESET = "\u001B[0;37m";
    public static final String BLACK_BOLD_BRIGHT = "\033[1;30m";

    String IDE;

    public Python(String name, String paradig, String compilation, boolean typing, String extension) {
        super(name, paradig, compilation, typing, extension);
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String workspaces) {
        this.IDE = workspaces;
    }

    public void printWorkspaces(){
        System.out.println(BLACK_BOLD_BRIGHT + "Editor: " + RESET + this.IDE);
    }
}
