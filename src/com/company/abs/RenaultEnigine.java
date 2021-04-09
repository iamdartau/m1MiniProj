package com.company.abs;

public class RenaultEnigine extends Engine {

    double extraTurboEnergy;

    public RenaultEnigine() {}

    public RenaultEnigine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    double efficiency() {
        return 0.27;
    }

    @Override
    double throttleEnergy() {
        return engineVolume*cylinderAmount*110 + extraTurboEnergy;
    }

    @Override
    double breakEnergy() {
        return engineWeight*2.1;
    }


}
