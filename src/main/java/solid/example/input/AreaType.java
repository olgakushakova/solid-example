package solid.example.input;

import java.util.Scanner;

public class AreaType {

    public String defineAreaType() {

        Scanner areaTypeInputObject = new Scanner(System.in);

        String areaType = null;

        System.out.println("What kind of calculations do you need: " +
                "\n 1 - Simple \n 2 - Painting \n 3 - Tile");

        Integer areaTypeNumber = Integer.parseInt(areaTypeInputObject.nextLine());
        if (areaTypeNumber == 1) {
            areaType = "simple";
        } else if (areaTypeNumber == 2) {
            areaType = "painting";
        } else if (areaTypeNumber == 3) {
            areaType = "tile";
        }
        System.out.println("Let's calculate " + areaType + " area of a selected figure");

        return areaType;
    }
}
