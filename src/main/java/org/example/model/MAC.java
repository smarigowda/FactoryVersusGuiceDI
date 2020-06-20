package org.example.model;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class MAC extends Computer {
    String ram;
    String hdd;
    String cpu;

    @Inject
    public MAC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public void start() {
        System.out.println("Starting MAC Computer");
    }
}
