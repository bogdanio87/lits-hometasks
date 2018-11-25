package module;

public class Home extends WebSite implements FFInterface.OpenFF, ChromeInterface.OpenChrome {

    public String title;
    public String url;
    public String htmlContent;

    public Home(String title, String url, String htmlContent) {
        super(title, url, htmlContent);
    }

}

