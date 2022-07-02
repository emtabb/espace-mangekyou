package com.espace.mangekyousharingan.controller;


import com.espace.mangekyousharingan.core.MangekyouCore;
import com.espace.mangekyousharingan.data.susano.MachineResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/test")
public class MangekyouController {

    @Autowired
    MangekyouCore mangekyouCore;

    @GetMapping(value = "machines")
    public List<MachineResponseData> getMachines() {
        return mangekyouCore.getMachines();
    }
}
