Multiple inheritene can be implemented by using interface
  interfaces can be implemented by abstract class but abstract class cannot be implements interface
//note:  Dynamic method dispatch or run-time polymorphism is the mechanism through which the correct version of an overridden method is called at runtime.
  Interface to class-Implements
  interface to interface- extends
Brake Interface:
  package Interfaces;

public interface Brake {
    void  brake();
    void start();

}

Engine Interface:
  package Interfaces;

public interface Engine {
   static final int PRICE=80000;
    void start();
    void stop();
    void acc();
}
  Media Interface:
    package Interfaces;

public interface Media {
    void start();
    void stop();

}
//class CDplayer
package Interfaces;

public class CDplayer implements Media{

    @Override
    public void start() {
        System.out.println("stop the start the music");
    }

    @Override
    public void stop() {
        System.out.println("start the music ");

    }
}

//class ElectricEngine
package Interfaces;

public class Electricengine implements Engine{

    @Override
    public void start() {
        System.out.println("Start the electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("stop the electric Engine");

    }

    @Override
    public void acc() {
        System.out.println("acclerate the electric Engine");

    }
}
//class powerEngine


package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Start the powerEngine");
    }

    @Override
    public void stop() {
        System.out.println("Stop the Engine");

    }

    @Override
    public void acc() {
        System.out.println("accelerate");

    }
}
//class Nicecar
package Interfaces;

public class NiceCar {
    CDplayer music=new CDplayer();
    private Engine engine;
    public NiceCar()
    {
        engine=new PowerEngine();
    }
    public NiceCar(Engine engine)

    {
        this.engine=engine;
    }
    public void musicStart()
    {
        music.start();
    }
    public  void  musicStop()
    {
        music.stop();
    }
    public void start()
    {
        engine.start();
    }
    public void upGrade()
    {
        this.engine=new Electricengine();
    }
}
// class car

package Interfaces;

public class Car implements Engine,Brake,Media{
    @Override
    public void brake() {
        System.out.println("You activated Brake");
    }

    @Override
    public void start() {
        System.out.println("let's start the car");

    }

    @Override
    public void stop() {
        System.out.println("hey pro driver!!,please stop yaar");

    }

    @Override
    public void acc() {
        System.out.println("Accelerate your speed");

    }
}
//Main class:
package Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
//        car.acc();
//        car.brake();
//        car.start();
//        car.stop();
//        Media carMedia= new Car();
//        carMedia.
        NiceCar niceCar=new NiceCar();
        niceCar.start();
        niceCar.musicStart();
        niceCar.musicStop();
        niceCar.upGrade();
        niceCar.start();

    }
}


