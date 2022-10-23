import uulib.Console;
class Main {

    // Change to switch case instead of if-elses
    public static String colours(int r, int g, int b) {
        if (r == 128 && g == 0 && b == 0) {
            return "Maroon";   
        } else if (r == 139 && g == 0 && b == 0) {
            return "Dark Red";
        } else if (r == 165 && g == 42 && b == 42) {
            return "Brown";
        } else if (r == 178 && g == 34 && b == 34) {
            return "Firebrick";
        } else if (r == 220 && g == 20 && b == 60) {
            return "Crimson";
        } else if (r == 255 && g == 0 && b == 0) {
            return "Red";
        } else if (r == 255 && g == 99 && b == 71) {
            return "Tomato";
        } else if (r == 255 && g == 127 && b == 80) {
            return "Coral";
        } else if (r == 205 && g == 92 && b == 92) {
            return "Indian Red";
        } else if (r == 240 && g == 128 && b == 128) {
            return "Light Coral";
        } else if (r == 0 && g == 255 && b == 0) {
            return "Green";
        } else if (r == 0 && g == 0 && b == 255) {
            return "Blue";
        } else {
            return "Error. Colour Not Found";
        }
     }

    public static void main(String[] args) {
        System.out.println("This program finds a certain shade of colour based on input RGB.");
        
        int r = Console.getInt("R: ");
        int g = Console.getInt("G: ");
        int b = Console.getInt("B: ");
            
        while((r >= 0 && r <= 255) && (g >= 0 && g <= 255) && (b >= 0 && b <= 255)) {
          String colour = colours(r, g, b);  
            System.out.println(colour);
            r = Console.getInt("R: ");
            g = Console.getInt("G: ");
            b = Console.getInt("B: ");
        }
        System.out.println("Invalid input");
  }
}