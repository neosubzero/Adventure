import java.util.Scanner;

public class dungeon1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String[] description = {"You are in the Guest Bedroom. Exits are North and East.", "You are in the South Hall. Exits are West, North, and East.", 
                                "You are in the Dining Room. Exits are West and North.", "You are in the Master Bedroom. Exits are East and South.", 
                                "You are in the North Hall. Exits are West, North, East, and South.", "You are in the Kitchen. Exits are West and South.",
                                "You are on the Balcony. Exit is South."};
                                
        int[][] exits = {
                            {3, 1, -1, -1}, //Room 0
                            {4, 2, -1, 0}, //Room 1
                            {5, -1, -1, 1}, //Room 2
                            {-1, 4, 0, -1}, //Room 3
                            {6, 5, 1, 3}, //Room 4
                            {-1, -1, 2, 4}, //Room 5
                            {-1, -1, 4, -1} //Room 6
                        };    
                        
        int currentRoom = 1;
        boolean control = true;
       
        do{
            System.out.println(description[currentRoom]);
            System.out.println();
            System.out.println("            N) North"); 
            System.out.println("W) West     p) Quit       E) East");
            System.out.println("            S) South");
            System.out.print("Which exit do you want to take: ");
            char direction = input.next().charAt(0);
            System.out.println();
            
            if (direction == 'n' || direction == 'N') {
                if (exits[currentRoom][0] == -1) {
                    System.out.println("You can not go that way.");
                    System.out.println();
                }
                else{
                currentRoom = exits[currentRoom][0];
                }
            }
            else if (direction == 'e' || direction == 'E') {
               if (exits[currentRoom][1] == -1) {
                    System.out.println("You can not go that way.");
                    System.out.println();
                }
                else{
                currentRoom = exits[currentRoom][1];
                }
            }
            else if (direction == 's' || direction == 'S') {
               if (exits[currentRoom][2] == -1) {
                    System.out.println("You can not go that way.");
                    System.out.println();
                }
                else{
                currentRoom = exits[currentRoom][2];
                }
            }
            else if (direction == 'w' || direction == 'W') {
                if (exits[currentRoom][3] == -1) {
                    System.out.println("You can not go that way.");
                    System.out.println();
                }
                else{
                currentRoom = exits[currentRoom][3];
                }
            }
            else if (direction == 'p' || direction == 'P') {
                control = false;
            }
            else{
                System.out.println("Invalid input.");
            }
        }while (control == true);    
    }
}