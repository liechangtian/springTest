package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2015 XiaoMi Inc. All Rights Reserved.
 * Authors: WangShuai16 <wangshuai16@xiaomi.com> .
 * Date: 20-4-4, Time: 上午11:04.
 */
@RestController
public class IndexController {

  @GetMapping("/index")
  public String index() {
    return "Index!!";
  }
}
