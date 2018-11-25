package module;

public class ForumPage extends WebSite implements ChromeInterface.OpenChrome {

    public String title;
    public String url;
    public String htmlContent;

    public ForumPage(String title, String url, String htmlContent) {
        super(title, url, htmlContent);
    }


}

