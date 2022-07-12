package com.futurecollars.lesson5.task5;

public class Car extends Vehicle implements Engine {

    boolean engineStarted;

    public Car(String brand) {
        super(brand);
    }

    public void startEngine () {
        if (!engineStarted) {
            engineStarted = true;
        }
    }

      public void stopEngine () {
        if (engineStarted) {
            engineStarted = false;
        }
    }

    public void setEngineStarted(boolean engineStarted) {
            this.engineStarted = engineStarted;
    }

    public boolean isEngineStarted () {
        return engineStarted;
    }


}
