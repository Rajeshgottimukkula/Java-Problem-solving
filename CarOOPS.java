import java.util.Scanner;

/**
* Car class should have the following attributes & methods
*
* Attributes:
* color (String), maxSpeed (int), acceleration (int), tyreFriction (int), isEngineStarted (boolean), currentSpeed (int)
*
* Methods:
* startEngine, stopEngine, accelerate, applyBrakes
*
* applyBrakes Method
*   When this method is called, 
*   Decrease the currentSpeed according to the tyreFriction value 
*   currentSpeed should never go below 0
*
* When a new car is created, the engine should be off by default and current speed should be 0
*
* Implement the Car class appropriately
*/


class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    int currentSpeed;
    boolean isEngineStarted;
    
    Car(String carColor, int carMaxSpeed, int carAcceleration, int carTyreFriction) {
       this.color=carColor;
       this.maxSpeed=carMaxSpeed;
       this.acceleration=carAcceleration;
       this.tyreFriction=carTyreFriction;
       this.currentSpeed=0;
       this.isEngineStarted=false;
    }




    void soundHorn() {
      if(isEngineStarted==true){
          System.out.println("Beep Beep");
      }
      else{
          System.out.println("Car has not started yet");
      }
    }    



    
    void applyBrakes(){
        int speed=currentSpeed-tyreFriction;
        
        if(speed<0){
            currentSpeed=0;
        
        }
        else{
            currentSpeed-=tyreFriction;
        }
    }
    
    void startEngine() {
       isEngineStarted=true;
    }
    
    void stopEngine() {
        isEngineStarted=false;
    }
    
    void accelerate() {
      if(isEngineStarted==false){
          currentSpeed=0;
          System.out.println("Car has not started yet");
      }
      else if(currentSpeed<maxSpeed){
          currentSpeed+=acceleration;
      }
    }
}

/**
* You need not change any code below.
*/

class Base {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Car car =  new Car(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
        car.startEngine();
        car.accelerate(); // Calling the accelerate method when the isEngineStarted is true
        System.out.println(car.currentSpeed); // 10
        car.applyBrakes(); // Calling the applyBrakes method
        // currentSpeed of the car should decrease according to the tyreFriction value.
        System.out.println(car.currentSpeed); // (10 - 3 => 7)
        car.applyBrakes();
        System.out.println(car.currentSpeed); // (7 - 3 => 4)
        car.applyBrakes();
        System.out.println(car.currentSpeed); // (4 - 3 => 1)
        car.applyBrakes();
        System.out.println(car.currentSpeed); // (1 - 3 => 0) current speed should never go behind 0.
         car.soundHorn(); // Calling soundHorn() when the isEngineStarted is false
        car.startEngine(); // Starting the engine
        car.soundHorn(); // Calling the soundHorn() when isEngineStarted is True
    }
}