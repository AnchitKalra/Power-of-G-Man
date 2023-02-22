package com.example.geektrust;

public class Grid {



    public int getPower(String s) {
        String input[] = s.split(" ");
        int xCoord = 0;
        int yCoord = 0;
        char direction = '0';

        int xDest = 0;
        int yDest = 0;
        if(input[0].equalsIgnoreCase(Constants.SOURCE)) {
            xCoord = Integer.valueOf(input[1]);
            yCoord = Integer.valueOf(input[2]);
            direction = input[3].charAt(0);
          //  System.out.println(xCoord + " " + yCoord + " " + direction + input[4] + " " + input[5]);
        }
         if (input[4].equalsIgnoreCase(Constants.DESTINATION)) {
            xDest = Integer.valueOf(input[5]);
            yDest = Integer.valueOf(input[6]);
          //  System.out.println(xDest + " " + yDest);

        }
         if (input[7].equalsIgnoreCase(Constants.PRINT_POWER)) {
             // System.out.println("HERE");
             int directionPower = 0;
             int movePower = 0;

             switch (direction) {
                 case 'N':

                     if (yCoord > yDest) {
                         directionPower += Constants.TWO * Constants.DIRECTIONPOWER;
                     } else if(xCoord != xDest){
                         directionPower += Constants.DIRECTIONPOWER;
                     }
                     break;
                 case 'E':
                     //   System.out.println("HERE");
                     if (xCoord > xDest)
                         directionPower += Constants.TWO * Constants.DIRECTIONPOWER;
                     else if (yCoord != yDest)
                         directionPower += Constants.DIRECTIONPOWER;
                     break;
                 case 'W':
                     if (xCoord < xDest)
                         directionPower += Constants.TWO * Constants.DIRECTIONPOWER;
                     else if (yCoord != yDest)
                         directionPower += Constants.DIRECTIONPOWER;
                     break;
                 case 'S':
                    // System.out.println("s");
                     if (yCoord < yDest) {
                      //   System.out.println("hi");
                         directionPower += Constants.TWO * Constants.DIRECTIONPOWER;
                     } else if(xCoord != xDest){
                         directionPower += Constants.DIRECTIONPOWER;
                     }
             }
             if (xCoord != xDest) {
                 movePower += Math.abs(xCoord - xDest) * Constants.MOVEPOWER;
                 //     System.out.println(movePower);
             }

            if(yCoord != yDest) {
                movePower += Math.abs(yCoord - yDest) * Constants.MOVEPOWER;
            }
          //  System.out.println(directionPower + " " + movePower);
          return(Constants.INITIALPOWER - directionPower - movePower);

        }
         return 0;
    }
}
