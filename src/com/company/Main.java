package com.company;

public class Main {
    static class Car {
        int wheels = 4;
        String color = "White";
        int doors = 4;
        String mark = "CarDefault";

        void setMark(String text){
            mark = text;
        }
        void setWheels(int number){
            wheels = number;
        }
        void setColor(String text){
            color = text;
        }
        void setDoors(int number){
            doors = number;
        }
        void printInfoClassCar(){
            System.out.println("Cars created: " + mark + "\n" +
                    "wheels: " + wheels +
                    "; doors: " + doors +
                    "; color: " + color);
        }
    }
    public static void main(String[] args) {
	    Car car1 = new Car();
	    car1.setMark("BMW");
	    car1.setWheels(6);
	    car1.setColor("Black");
	    car1.setDoors(2);
	    car1.printInfoClassCar();
    }
}
//test