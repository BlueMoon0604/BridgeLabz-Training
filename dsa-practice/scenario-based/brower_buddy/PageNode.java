package brower_buddy;

class PageNode {
    String url;
    PageNode prev, next;

    PageNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}

