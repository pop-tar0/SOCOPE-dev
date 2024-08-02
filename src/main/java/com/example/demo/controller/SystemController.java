package com.example.demo.controller;

import com.example.demo.model.entity.ResponseEntity;
import com.example.demo.model.vo.WebsiteAssetsVO;
import com.example.demo.service.System.ISystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private ISystemService systemService;

    @RequestMapping("/websiteAssets")
    public ResponseEntity<WebsiteAssetsVO> getWebsiteAssets () {
        WebsiteAssetsVO assets = systemService.getWebsiteAssets();
        return new ResponseEntity<>(assets);
    }
}
