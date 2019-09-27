package com.madantiwari.digitalmarksheet.result;

public class Result {

    private double android, IOT, API;

    public Result(double android, double IOT, double API) {

        this.android = android;
        this.IOT = IOT;
        this.API = API;
    }

    public double percentage() {
        return (android + IOT + API) / 300 * 100;
    }


    public double getAndroid() {
        return android;
    }

    public void setAndroid(double android) {
        this.android = android;
    }

    public double getIPC() {
        return IOT;
    }

    public void setIPC(double IPC) {
        this.IOT = IPC;
    }

    public double getAPI() {
        return API;
    }

    public void setAPI(double API) {
        this.API = API;

    }
}