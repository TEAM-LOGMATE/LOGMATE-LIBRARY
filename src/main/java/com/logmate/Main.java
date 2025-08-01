package com.logmate;

import com.logmate.injection.puller.ConfigPullerRunManager;
import com.logmate.tailer.TailerRunManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger log = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) throws Exception {
    //ConfigInjectionServer.start(2373);
    ConfigPullerRunManager.start();
    TailerRunManager.start();
    log.info("tail-mate is running");
  }
}