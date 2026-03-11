public class OopsBannerApp {
    public static void main(String[] args) {
        // Construct each line using String.join("", ...) for efficiency [cite: 174]
        
        System.out.println(String.join("", "  ** ", "  ** ", "  ** ", "  ** "));
        System.out.println(String.join("", " * * ", " * * ", " * * ", " * "));
        System.out.println(String.join("", " * * ", " * * ", " * * ", " * "));
        System.out.println(String.join("", " * * ", " * * ", "  ** ", "  ** "));
        System.out.println(String.join("", " * * ", " * * ", " * ", "       * "));
        System.out.println(String.join("", " * * ", " * * ", " * ", "       * "));
        System.out.println(String.join("", "  ** ", "  ** ", " * ", "  *** "));
    }
}