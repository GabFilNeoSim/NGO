package managers;


public class TabManager {
    
    private final javax.swing.JTabbedPane tabbedPane;
    
    public TabManager(javax.swing.JTabbedPane tabbedPane) {
        this.tabbedPane = tabbedPane;
        disableAll();
    }
    
    public void enable(int ...tabs) {
        for (int tab : tabs) {
            tabbedPane.setEnabledAt(tab, true);
        }
    }
    
    private void disableAll() {
        for (int tab = 0; tab < tabbedPane.getTabCount(); tab++) {
            tabbedPane.setEnabledAt(tab, false);
        }
    }
}
