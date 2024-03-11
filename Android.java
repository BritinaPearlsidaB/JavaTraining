interface Android {
    void calling();
    void wifi();
    void screenshot();
}

class OnePlus implements Android {
    public void calling() {
        System.out.println("OnePlus uses normal and WiFi calling");
    }

    public void wifi() {
        System.out.println("Uses WiFi 7");
    }

    public void screenshot() {
        System.out.println("Has 3 finger swipe, home & volume button and scrolling screenshot");
    }
}

class Realme implements Android {
    public void calling() {
        System.out.println("Realme uses normal calling");
    }

    public void wifi() {
        System.out.println("Uses Wifi 6");
    }

    public void screenshot() {
        System.out.println("Has home & lock button");
    }
}

class Samsung implements Android {
    public void calling() {
        System.out.println("Samsung uses normal and WiFi calling");
    }

    public void wifi() {
        System.out.println("Uses Wifi 6E");
    }

    public void screenshot() {
        System.out.println("From function bar and home & lock button");
    }
}

class Vivo implements Android {
    public void calling() {
        System.out.println("Vivo uses normal and WiFi calling");
    }

    public void wifi() {
        System.out.println("Uses WiFi 6");
    }

    public void screenshot() {
        System.out.println("From navigation bar and power & volume button");
    }
}

interface IPhone {
    void calling();
    void wifi();
    void screenshot();
}

class IPhoneXR implements IPhone {
    public void calling() {
        System.out.println("Uses only normal calling");
    }

    public void wifi() {
        System.out.println("No WiFi feature");
    }

    public void screenshot() {
        System.out.println("No screenshot feature");
    }
}

class IPhoneSE implements IPhone {
    public void calling() {
        System.out.println("Uses normal and WiFi calling");
    }

    public void wifi() {
        System.out.println("Uses WiFi 5");
    }

    public void screenshot() {
        System.out.println("No screenshot feature");
    }
}
