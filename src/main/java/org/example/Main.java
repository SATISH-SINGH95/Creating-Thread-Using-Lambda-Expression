package org.example;

// Creating Thread Using Lambda Expression.
// Because Runnable interface is a functional interface, so we can create thread using Lambda Expression.

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Runnable thread1 = () -> {

            for(int i=1; i<=10; i++){
                System.out.println("This is first thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };
        Thread t1 = new Thread(thread1);
        t1.setName("SATISH"); // setting the name of the thread
        t1.start();


        Runnable thread2 = () -> {
            for(int i=1; i<=10; i++) {
                System.out.println("this is second Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2 = new Thread(thread2);
        t2.start();
    }
}

// OUTPUT

// This is first thread
//this is second Thread
//This is first thread
//this is second Thread
//This is first thread
//this is second Thread
//this is second Thread
//This is first thread
//this is second Thread
//This is first thread
//This is first thread
//this is second Thread
//this is second Thread
//This is first thread
//this is second Thread
//This is first thread
//this is second Thread
//This is first thread
//this is second Thread
//This is first thread