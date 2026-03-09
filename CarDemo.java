/******************************************************************************
 *  Author: Dr Peter Yau
 *  Email: PeterCY.Yau@glasgow.ac.uk
 *  Module Code: CSC1109
 *  Module Title: Object-Oriented Programming
 *  Institution: University of Glasgow (Singapore Campus)
 *
 *  Purpose:
 *  This program is provided as an instructional example for students
 *  enrolled in CSC1109 Object-Oriented Programming. The code illustrates
 *  fundamental Java programming and object-oriented design concepts.
 *
 *  Usage:
 *  Students may modify and experiment with this code as part of learning
 *  exercises and laboratory work.
 *
 *  Disclaimer:
 *  This code is intended for educational purposes only and may not be
 *  suitable for production use.
 *
 *  Created: 2026
 ******************************************************************************/

/**
 * Demonstration program for the Car class.
 */
public class CarDemo {

    public static void main(String[] args) {

        // create a new car object
        Car myCar = new Car("Toyota", 0);

        // control the car
        myCar.speedUp(30);
        myCar.turnLeft();
        myCar.speedUp(20);
        myCar.turnRight();
        myCar.slowDown(25);

        System.out.println("Final speed: " + myCar.getSpeed());
        System.out.println("Direction: " + myCar.getDirection());
    }
}
