package InterThread;

class RideSharingApp {
    private boolean isDriverAvailable = false;

    public synchronized void driverAvailable() {
        isDriverAvailable = true;
        notifyAll();
    }

    public synchronized void waitForDriver() throws InterruptedException {
        while (!isDriverAvailable) {
            wait();
        }
        isDriverAvailable = false;
    }
}

class Driver extends Thread {
    private RideSharingApp app;

    public Driver(RideSharingApp app) {
        this.app = app;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000); // Simulate time taken to become available
                System.out.println("Driver is available.");
                app.driverAvailable();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Passenger extends Thread {
    private RideSharingApp app;

    public Passenger(RideSharingApp app) {
        this.app = app;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Passenger is waiting for a driver.");
                app.waitForDriver();
                System.out.println("Passenger matched with a driver.");
                Thread.sleep(2000); // Simulate time taken for the ride
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        RideSharingApp app = new RideSharingApp();
        Driver driver = new Driver(app);
        Passenger passenger = new Passenger(app);

        driver.start();
        passenger.start();
    }
}
