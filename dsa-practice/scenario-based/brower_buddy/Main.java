package brower_buddy;

import java.util.Stack;

public class Main {
    private TabHistory activeTab = new TabHistory();
    private Stack<TabHistory> closedTabs = new Stack<>();

    public void visitPage(String url) {
        activeTab.visit(url);
    }
    public void goBack() {
        activeTab.back();
    }
    public void goForward() {
        activeTab.forward();
    }
    public void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new TabHistory();
        System.out.println("Tab closed");
    }
    public void restoreTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore");
            return;
        }
        activeTab = closedTabs.pop();
        System.out.println("Tab restored and current tab is : "+ activeTab.getCurrentPage());
    }
    public static void main(String[] args) {
        Main browser = new Main();
        browser.visitPage("google.com");
        browser.visitPage("github.com");
        browser.visitPage("pinterest.com");

        browser.goBack();
        browser.goBack();
        browser.goForward();
        browser.closeTab();
        browser.restoreTab();
        browser.goForward();
    }
}

