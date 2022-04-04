package com.company.codingTest;

import javax.annotation.processing.Messager;

interface Messenger {
    void boot();
}
 class LineMessenger implements Messenger{
    @Override
    public void boot() {
        System.out.println("Line BOOTING....");
    }
}
 class hiMessenger implements Messenger {
     @Override
     public void boot() {
         System.out.println("hi BOOTING....");
     }
 }
public class Computer {
    private Messenger messenger;

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setMessenger(new hiMessenger());
        computer.boot();
    }

    private void setMessenger(Messenger messenger) {
        this.messenger = messenger;
    }

    private void boot() {
        System.out.println("BOOTING.....");
        messenger.boot();
    }
}