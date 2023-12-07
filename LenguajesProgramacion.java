public class LenguajesProgramacion {

    public static final String RESET = "\u001B[0;37m";
    public static final String BLUE_BOLD_BRIGHT = "\033[1;34m";

    String name, paradigm, compilation, extension;
    boolean typing;

    public LenguajesProgramacion(String name, String paradigm, String compilation, boolean typing, String extension) {
        this.name = name;
        this.paradigm = paradigm;
        this.typing = typing;
        this.compilation = compilation;
        this.extension = extension;
    }

    public String getName() {
        return name;
    }

    public String getParadigm() {
        return paradigm;
    }

    public boolean getTyping() {
        return typing;
    }

    public String getCompilation() {
        return compilation;
    }

    public String getExtension() {
        return extension;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setParadigm(String paradig) {
        this.paradigm = paradig;
    }

    protected void setType(boolean typing) {
        this.typing = typing;
    }

    protected void setCompilation(String compilation) {
        this.compilation = compilation;
    }

    protected void setExtension(String extension) {
        this.extension = extension;
    }

    public void printInfo(){
        System.out.println(BLUE_BOLD_BRIGHT+"\nNombre del lenguaje: " + RESET + this.name);
        System.out.println(BLUE_BOLD_BRIGHT+"Paradigma: " + RESET + this.paradigm);
        System.out.println(BLUE_BOLD_BRIGHT+"Tipado: " + RESET + this.typing);
        System.out.println(BLUE_BOLD_BRIGHT+"Compilacion: " + RESET + this.compilation);
        System.out.println(BLUE_BOLD_BRIGHT+"Extension: " + RESET + this.extension);
    }
}