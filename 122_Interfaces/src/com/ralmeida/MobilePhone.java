package com.ralmeida;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now calling " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Mobile phone is switched off");
        }

    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody playing.");
        } else {
            isRinging = false;
            System.out.println("Mobile phone is switched off");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
