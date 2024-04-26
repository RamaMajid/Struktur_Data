package Modul3.KEGIATAN1;


public class Browser {
    private Stack backStack = new Stack(100);
    private Stack forwardStack = new Stack(100);

    public void visit(String url) {
        backStack.push(url);
        forwardStack = new Stack(100);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(backStack.pop());
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(forwardStack.pop());
        }
    }

    public String currentUrl() {
        return backStack.peek();
    }

    public void displayHistory() {
        backStack.displayStack();
    }
}
