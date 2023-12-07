public class Cpp extends LenguajesProgramacion{

    public static final String RESET = "\u001B[0;37m";
    public static final String BLACK_BOLD_BRIGHT = "\033[1;30m";

    String dificulty;

    public Cpp(String name, String paradig, String compilation, boolean typing, String extension) {
        super(name, paradig, compilation, typing, extension);
    }

    public String getDificulty() {
        return dificulty;
    }

    public void setDificulty(String dificulty) {
        this.dificulty = dificulty;
    }

    public void printDificulty(){
        System.out.println(BLACK_BOLD_BRIGHT + "Dificultad: " + RESET + this.dificulty);
    }
}
