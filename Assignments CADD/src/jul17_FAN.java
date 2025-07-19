abstract class Fan {
    abstract void turnOn();
    abstract void turnOff();
}


class CeilingFan extends Fan {
    @Override
    void turnOn() {
        System.out.println("Ceiling fan is now ON. Spinning...");
    }

    @Override
    void turnOff() {
        System.out.println("Ceiling fan is now OFF. Stopped.");
    }
}


class TableFan extends Fan {
    @Override
    void turnOn() {
        System.out.println("Table fan is now ON. Blowing air...");
    }

    @Override
    void turnOff() {
        System.out.println("Table fan is now OFF. Stopped now.");
    }
}



public class jul17_FAN {
    public static void main(String[] args) {
        Fan myFan = new CeilingFan();
        myFan.turnOn();
        myFan.turnOff();

        System.out.println();


        Fan deskFan = new TableFan();
        deskFan.turnOn();
        deskFan.turnOff();
    }
}
