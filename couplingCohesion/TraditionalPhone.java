package couplingCohesion;

public class TraditionalPhone implements IPhone {
    public void makePhoneCall() {
        System.out.println("Making call...");
    }

    public void encryptOutgoingSound() {
        System.out.println("Outgoing sound encrypted...");
    }

    public void decipherIncomingSound() {
        System.out.println("Incoming sound decrypted...");
    }
}
