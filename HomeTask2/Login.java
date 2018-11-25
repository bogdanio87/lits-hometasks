package module;

public class Login extends WebSite implements WebSite.OpenFF, ChromeInterface.OpenChrome {

    public String title;
    public String url;
    public String htmlContent;

    public Login(String title, String url, String htmlContent) {
        super(title, url, htmlContent);
    }

}


