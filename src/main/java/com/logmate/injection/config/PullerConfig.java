package com.logmate.injection.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PullerConfig {
  private String pullURL;
  private int intervalSec;
}
