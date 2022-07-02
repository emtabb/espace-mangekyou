package com.espace.mangekyousharingan.core.impl;

import com.espace.mangekyousharingan.constant.SusanoConstants;
import com.espace.mangekyousharingan.core.MangekyouCore;
import com.espace.mangekyousharingan.data.susano.MachineResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class MangekyouCoreImpl implements MangekyouCore {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${com.espace.ai.bootstraps-server}")
    private String boostrapServers;

    public List<MachineResponseData> getMachines() {
        List<MachineResponseData> machineResponseData = restTemplate
                .getForObject(boostrapServers.concat(SusanoConstants.API.GET_ALL_MACHINES), ArrayList.class);
        return machineResponseData;
    }

    public void getPositions() {

    }
}
