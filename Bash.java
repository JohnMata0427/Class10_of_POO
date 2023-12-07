public class Bash extends LenguajesProgramacion{

    public static final String RESET = "\u001B[0;37m";
    public static final String BLACK_BOLD_BRIGHT = "\033[1;30m";

    String shell;

    public Bash(String name, String paradig, String compilation, boolean typing, String extension) {
        super(name, paradig, compilation, typing, extension);
    }

    public String getShell() {
        return shell;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public void printShell(){
        System.out.println(BLACK_BOLD_BRIGHT + "Shell: " + RESET + this.shell);
    }
}
