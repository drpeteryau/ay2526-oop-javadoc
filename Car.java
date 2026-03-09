/******************************************************************************
 *  File Name: Car.java
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
 * The Car class represents a simple controllable car.
 * 
 * This example demonstrates how to write Javadoc comments for
 * classes, constructors, and methods. The car can change speed
 * and steering direction.
 * 
 * Example usage:
 * Car myCar = new Car("Toyota", 0);
 * myCar.speedUp(20);
 * myCar.turnLeft();
 * 
 */
public class Car {

    /** Name or model of the car */
    private String model;

    /** Current speed of the car in km/h */
    private int speed;

    /** Current steering direction */
    private String direction;

    /**
     * Constructor to create a new Car object.
     *
     * @param model the car model name
     * @param initialSpeed the starting speed of the car
     */
    public Car(String model, int initialSpeed) {
        this.model = model;          // assign model name
        this.speed = initialSpeed;   // set initial speed
        this.direction = "straight"; // default direction
    }

    /**
     * Increase the car speed.
     *
     * @param amount the amount of speed to increase
     */
    public void speedUp(int amount) {
        speed += amount; // add the amount to current speed
        System.out.println(model + " speeds up to " + speed + " km/h");
    }

    /**
     * Decrease the car speed.
     *
     * @param amount the amount of speed to reduce
     */
    public void slowDown(int amount) {
        speed -= amount; // subtract the amount from speed

        // ensure speed does not go below zero
        if (speed < 0) {
            speed = 0;
        }

        System.out.println(model + " slows down to " + speed + " km/h");
    }

    /**
     * Turn the car wheels to the left.
     */
    public void turnLeft() {
        direction = "left"; // update direction state
        System.out.println(model + " turns left");
    }

    /**
     * Turn the car wheels to the right.
     */
    public void turnRight() {
        direction = "right"; // update direction state
        System.out.println(model + " turns right");
    }

    /**
     * Get the current speed of the car.
     *
     * @return the current speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Get the current steering direction.
     *
     * @return current direction of the car
     */
    public String getDirection() {
        return direction;
    }
}
