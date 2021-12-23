package burp;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BurpExtender implements IBurpExtender,ITab {
    private IBurpExtenderCallbacks call;
    private IExtensionHelpers helpers;
    private GUI gui;
    @Override
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        this.call = callbacks;
        this.helpers = callbacks.getHelpers();
        this.gui = new GUI(call,helpers);
        call.setExtensionName("Log4j2_Pscan");
        call.addSuiteTab(this);
        call.printOutput("Load the success\n _             _  _   _ ____      ____                      \n" +
                "| | ___   __ _| || | (_)___ \\    |  _ \\ ___  ___ __ _ _ __  \n" +
                "| |/ _ \\ / _` | || |_| | __) |   | |_) / __|/ __/ _` | '_ \\ \n" +
                "| | (_) | (_| |__   _| |/ __/    |  __/\\__ \\ (_| (_| | | | |\n" +
                "|_|\\___/ \\__, |  |_|_/ |_____|___|_|   |___/\\___\\__,_|_| |_|\n" +
                "         |___/     |__/     |_____|                         \n" +
                "by:F6JO");
    }

    @Override
    public String getTabCaption() {
        return "Log4j2_Pscan";
    }

    @Override
    public Component getUiComponent() {
        return gui.$$$getRootComponent$$$();
    }

}
