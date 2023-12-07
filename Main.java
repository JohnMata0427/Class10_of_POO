public class Main{

    public static void main(String[] args) {
        Python python = new Python("Python", "Multiparadigma", "Interpretado", true, ".py");
        python.setIDE("Visual Studio Code, PyCharm, Atom, Jupyter Notebook");

        Bash bash = new Bash("Bash", "Procedimental", "Interpretado", true, ".sh");
        bash.setShell("Bash, Zsh, Fish, Ksh");

        Cpp cpp = new Cpp("C++", "Multiparadigma", "Compilado", true, ".cpp");
        cpp.setDificulty("Alta");

        Java java = new Java("Java", "Orientado a Objetos", "Compilado", true, ".java");
        java.setOS("Windows, Linux, Mac");

        python.printInfo();
        python.printWorkspaces();

        bash.printInfo();
        bash.printShell();

        cpp.printInfo();
        cpp.printDificulty();

        java.printInfo();
        java.printOS();
        System.out.println();
    }
}