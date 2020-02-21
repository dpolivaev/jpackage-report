public class App {
    public static void main(String[] args) {
        loadClass("Library");
        loadClass("Plugin");
    }

    private static void loadClass(String className) {
        try {
            App.class.getClassLoader().loadClass(className);
            System.out.println("Class " + className + " found");
        } catch (ClassNotFoundException e) {
            System.out.println("Class " + className + " not found");
        }
    }
}
