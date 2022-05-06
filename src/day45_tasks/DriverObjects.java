package day45_tasks;

public class DriverObjects {
    public static void main(String[] args) {


        ChromeDriver chromeDriver = new ChromeDriver();

        chromeDriver.getBrowserName();
        chromeDriver.get("https://demo.guru99.com/V4/");
        chromeDriver.findElement("Class Name");
        chromeDriver.findElements("Name");
        chromeDriver.executeScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
        chromeDriver.takeScreenShot();
        chromeDriver.close();
        chromeDriver.quit();

        System.out.println("\n===========================================================\n");


        FireFoxDriver fireFox = new FireFoxDriver();

        fireFox.getBrowserName();
        fireFox.get("https://demo.guru99.com/V4/");
        fireFox.findElement("Class Name");
        fireFox.findElements("Name");
        fireFox.executeScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
        fireFox.takeScreenShot();
        fireFox.close();
        fireFox.quit();

        System.out.println("\n===========================================================\n");


        SafariDriver safari = new SafariDriver();

        safari.getBrowserName();
        safari.get("https://demo.guru99.com/V4/");
        safari.findElement("Class Name");
        safari.findElements("Name");
        safari.executeScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
        safari.takeScreenShot();
        safari.close();
        safari.quit();

        System.out.println("\n===========================================================\n");

        OperaDriver opera = new OperaDriver();

        opera.getBrowserName();
        opera.get("https://demo.guru99.com/V4/");
        opera.findElement("Class Name");
        opera.findElements("Name");
        opera.executeScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
        opera.takeScreenShot();
        opera.close();
        opera.quit();

        System.out.println("\n===========================================================\n");

    }
}