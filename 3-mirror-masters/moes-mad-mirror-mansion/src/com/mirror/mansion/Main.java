package com.mirror.mansion;

import mira.mar.lightshow.MirarmarLightshow;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's get this party started!");
        System.out.println("Shining lights at ");
        MirarmarLightshow mirarmarLightshow = new MirarmarLightshow();
        System.out.println(mirarmarLightshow.getLights());

        Optional<Module> specificModule = ModuleLayer.boot().findModule("park.themes");
        specificModule.ifPresent(module -> {
            try {
                InputStream is = module.getResourceAsStream("themes.properties");
                Main.read(is);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    private static void read(InputStream is) {
        String s = new BufferedReader(new InputStreamReader(is)).lines().collect(Collectors.joining("\n"));
        System.out.println("Properties read:\n " + s);
    }
}
