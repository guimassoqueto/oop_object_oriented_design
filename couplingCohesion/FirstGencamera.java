package couplingCohesion;

public class FirstGencamera implements ICamera{
    public void takePhoto() {
        System.out.println("Photo taken");
    }

    public void savePhoto() {
        System.out.println("Photo saved");
    }

    public void cameraFlash() {
        System.out.println("Flash light");
    }
}
