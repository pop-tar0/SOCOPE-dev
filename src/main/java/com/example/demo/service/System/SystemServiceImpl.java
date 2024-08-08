package com.example.demo.service.System;

import com.example.demo.model.vo.WebsiteAssetsVO;
import com.example.demo.repository.System.ISystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemServiceImpl implements ISystemService {

    @Autowired
    private ISystemRepository systemRepository;

    public WebsiteAssetsVO getWebAssets () {
        return systemRepository.findWebAssets();
    }
}
