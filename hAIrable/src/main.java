import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sex");
        String sex = sc.next();
        System.out.println("Enter shape");
        String shape = sc.next();

        String recommendation = "";
        String tip = "";

        if(sex.equals("Male")) {
            if (shape.equals("Square")) {
                recommendation = "Messy Popmpadour with Fade";
                tip = "If you are keen on facial hair, opt for a longer beard which will lengthen a square jaw";
            } else if (shape.equals("Round")) {
                recommendation = "High Volume Haircut";
                tip = "Draw attention to the top of your head by styling and spiking your hair upwards";
            } else if (shape.equals("Oval")) {
                recommendation = "Under-Cut";
                tip = "Steer away from fringes as they'll make your face look rounder";
            } else if (shape.equals("Triangle")) {
                recommendation = "Textured Crop";
                tip = "A fringe can create the illusion of a thicker forehead which reduces the impact of a strong chin";
            } else if (shape.equals("Oblong")){
                recommendation = "Side Part";
                tip = "Avoid long beards as they'll create an overly-elongated effect";
            }
        }
        else if(sex.equals("Female")) {
            if (shape.equals("Square")) {
                recommendation = "Short Bob";
                tip = "Curls could widen your face, so opt to wear your hair in either loose waves or straight";
            } else if (shape.equals("Round")) {
                recommendation = "High Pony";
                tip = "Always leave a little piece of hair untucked on one side of your face to elongate the face";
            } else if (shape.equals("Oval")) {
                recommendation = "Side-Swept Bangs";
                tip = "The best hairstyles include styles that keep hair away from your face, exposing your best features";
            } else if (shape.equals("Triangle")) {
                recommendation = "High Top Knot";
                tip = "Part your hair slightly off centre to whichever side your hair naturally falls over to avoid any hairy woes";
            } else if (shape.equals("Oblong")) {
                recommendation = "Natural Curls";
                tip = "Your hairstyle should be looking for width rather than length";
            }
        }


        System.out.println("Based on our analysis, we recommend the following hairstyle: " + recommendation);
        System.out.println("Pro tip: " + tip + "!");
        }
    }

