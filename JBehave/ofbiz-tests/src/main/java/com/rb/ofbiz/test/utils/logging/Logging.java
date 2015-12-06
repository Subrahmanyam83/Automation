package com.rb.ofbiz.test.utils.logging;

import java.io.BufferedWriter;
import java.io.File;
import com.rb.ofbiz.test.utils.logging.*;

import com.thoughtworks.selenium.Selenium;

public class Logging {
  static int i=1;
  public static Selenium get(){
	  final String resultPath = "C:\\Pantha\\Tools\\test\\";
	    final String resultHtmlFileName = resultPath + File.separator + "result1.html"+i;
	    i++;
	    final String resultEncoding = "UTF-8";
	    BufferedWriter loggingWriter = LoggingUtils.createWriter(resultHtmlFileName, resultEncoding);

	    LoggingResultsFormatter htmlFormatter = 
	        new HtmlResultFormatter(loggingWriter, resultEncoding);
	    htmlFormatter.setScreenShotBaseUri(""); // this is for linking to the screenshots
	    htmlFormatter.setAutomaticScreenshotPath(resultPath);
	    // wrap HttpCommandProcessor from remote-control
	    LoggingCommandProcessor myProcessor = 
	       new LoggingCommandProcessor("localhost", 4444, "*firefox", "http://localhost:8080", htmlFormatter);
	    return new LoggingDefaultSelenium(myProcessor);
  }
}
