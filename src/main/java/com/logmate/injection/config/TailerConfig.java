package com.logmate.injection.config;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TailerConfig {

  private List<String> filePaths;
  private int readIntervalMs;
  private MultilineConfig multiline;

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  public static class MultilineConfig {

    private boolean enabled;
    private String pattern;
    private int timeoutMs;
    private String failedMergeTag;
  }
}
