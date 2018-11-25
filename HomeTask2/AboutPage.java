package module;

public class AboutPage extends WebSite implements FFInterface.OpenFF {

    public String title;
    public String url;
    public String htmlContent;

    public AboutPage(String title, String url, String htmlContent) {
        super(title, url, htmlContent);
    }
    }

