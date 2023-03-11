package couplingCohesion;

public class Smartphone {
    private ICamera myCamera;
    private IPhone myPhone;

    public Smartphone(ICamera camera, IPhone phone) {
        this.myCamera = camera;
        this.myPhone = phone;
    }

    public void useCamera() {
        this.myCamera.takePhoto();
    }

    public void usePhone() {
        this.myPhone.makePhoneCall();
    }
}
