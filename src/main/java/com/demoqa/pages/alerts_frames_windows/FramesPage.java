package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends AlertsFramesWindowsPage
{
    private final By textInFrame = By.id("sampleHeading");
    private final String iFrameLargeFrame = "frame1";
    private final int indexSmallFrame = 1;
    private final By iFrameSmallFrame = By.xpath("//div[@id='frame2Wrapper']/iframe");
    private final By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    public String getTextInLargeFrame()
    {
        switchToFrame(iFrameLargeFrame);
        String textLargeFrame =  find(textInFrame).getText();
        switchToParentFrame();
        return  textLargeFrame;
    }
    public String getTextInSmallFrame()
    {
        //switchToFrame(indexSmallFrame);
        switchToFrame(find(iFrameSmallFrame));
        String textSmallFrame = find(textInFrame).getText();
        switchToDefaultContent();
        return textSmallFrame;
    }
    public String getHeaderFramesText()
    {
        return find(headerFramesText).getText();
    }
}
