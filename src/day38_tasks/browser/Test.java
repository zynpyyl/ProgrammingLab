package day38_tasks.browser;

public class Test {

    public static void main(String[] args) {

        Browser browser=new Browser();

        browser.openBrowser();

        ChromeBrowser browser1=new ChromeBrowser();

        browser1.openBrowser();

        Safari browser2=new Safari();

        browser2.openBrowser();

        Opera browser3=new Opera();

        browser3.openBrowser();
    }
}
