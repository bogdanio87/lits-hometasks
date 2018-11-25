package module;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
import java.util.*;
import java.lang.*;
import java.util.ServiceLoader;

public class WebSite {
    private String title;
    private String url;
    private String htmlContent;

    public WebSite(String title, String url, String htmlContent) {
        this.title = title;
        this.htmlContent = htmlContent;
        this.url = url;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return  this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getHtmlContent() {
        return  this.htmlContent;
    }
    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public void getReload() {
        ServiceLoader<WebSite> serviceReloader = ServiceLoader.load(WebSite.class);
        serviceReloader.reload();
    }


    public void getLoad() {

        System.out.println("Loading");
    }

    interface OpenFF {
        static void HtmlCode(Browser obj) {
            obj.setIdentificator(2);
        }
    }


    static void Refresh(WebSite obj) {
        obj.getReload();
    }

    public void htmlBuilder(String htmlContent) {
        this.htmlContent = htmlContent;
        System.out.print(htmlContent);
    }

    public static void HomeWork() {
        char[] allCharacters = new char[] {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};
        try {
            for(int i = 0; i < allCharacters.length; i++) {
                LocalDate inputTypeOfDate = LocalDate.of(2010, 10, 23);
                System.out.println(inputTypeOfDate.range(ChronoField.valueOf(String.valueOf(allCharacters[i]))));
            }

        } catch (Exception ex) {
            System.out.println("File not found");
            ex.printStackTrace(System.out);
        }

    }


    public static void main(String[] args) {
        WebSite constructor = new WebSite("a", "s", "w");

        Login page1 = new Login("Login", "/login", "<div>Login</div>");
        Home page2 = new Home("Home", "/home", "<div>Home</div>");
        ForumPage page3 = new ForumPage("ForumPage", "/forum_page1", "<div>ForumPage</div>");
        ForumPage page4 = new ForumPage("ForumPage", "/forum_page2", "<div>ForumPage</div>");
        AboutPage page5 = new AboutPage("AboutPage", "/about_page1", "<div>AboutPage</div>");
        AboutPage page6 = new AboutPage("AboutPage", "/about_page2", "<div>AboutPage</div>");
        Map<Integer, Object> pages = new HashMap<Integer, Object>();
        pages.put(1, page1);
        pages.put(2, page2);
        pages.put(3, page3);
        pages.put(4, page4);
        pages.put(5, page5);
        pages.put(6, page6);


        for (int i = 1; i <= pages.size(); i++) {
            System.out.println("Page number " + i + ":");
            System.out.println(((WebSite) pages.get(i)).getTitle());
            System.out.println(((WebSite) pages.get(i)).getUrl());
            System.out.println(((WebSite) pages.get(i)).getHtmlContent());
        }
        for (int i = 1; i <= pages.size(); i++) {
            if(pages.get(i) instanceof FFInterface) {
                System.out.println("Page number " + i + ":");
                System.out.println(((WebSite)pages.get(i)).getTitle());
                System.out.println(((WebSite) pages.get(i)).getUrl());
                System.out.println(((WebSite)pages.get(i)).getHtmlContent());
            }
        }
        for (int i = 1; i <= pages.size(); i++) {
            if( pages.get(i) instanceof  ChromeInterface) {
                System.out.println("Page number " + i + ":");
                System.out.println(((WebSite) pages.get(i)).getTitle());
                System.out.println(((WebSite) pages.get(i)).getUrl());
                System.out.println(((WebSite) pages.get(i)).getHtmlContent());
            }
        }
        for (int i = 1; i <= pages.size(); i++) {
            ((WebSite) pages.get(i)).htmlBuilder(((WebSite) pages.get(i)).getHtmlContent());
        }
        List<String> titles = new ArrayList<String>();
        for (int i = 1; i <= pages.size(); i++) {
            String data = ((WebSite) pages.get(i)).getTitle();
            boolean flag = false, started = false;
            for(int g = i + 1; g <= pages.size(); g++) {
                if (!((WebSite) pages.get(g)).getTitle().equals(data)) {
                    flag = true;
                    started = true;
                }else {
                    flag = false;
                    started = true;
                    break;
                }
            }
            if(flag || !started) {
                titles.add(data);
            }
        }
        for (int i = 0; i < titles.size(); i++) {
            System.out.println(titles.get(i));
        }


        Map<String, ArrayList<WebSite>> infoByTitles = new HashMap<String, ArrayList<WebSite>>();
        for (int i = 0; i < titles.size(); i++) {
            ArrayList<WebSite> allPagesWithSuchTitle = new ArrayList<WebSite>();
            System.out.println(titles.get(i) + ":");
            for(int g = 1; g <= pages.size(); g++) {
                if (((WebSite) pages.get(g)).getTitle().equals(titles.get(i))) {
                    allPagesWithSuchTitle.add((WebSite) pages.get(g));
                    System.out.println(((WebSite)pages.get(g)).getHtmlContent() + ":");
                }
                infoByTitles.put(titles.get(i), allPagesWithSuchTitle);
            }
        }



    }
}

