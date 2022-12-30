package com.foreverfree.logic;

import java.io.IOException;

public class GetSdkInfo {

    private final String SDK_NAME = "sdk";

    public Process getSdkPath() throws IOException {
        String[] whereis = {"whereis", SDK_NAME};
        return Runtime.getRuntime().exec(whereis);
    }

    public Process getSdkVersion() throws IOException {
        String[] whereis = {SDK_NAME, "--version"};
        return Runtime.getRuntime().exec(whereis);
    }
}
