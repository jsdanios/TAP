package com.tts.TransitApp.model;

public class Bus {
    public String ADHERENCE;
    public String BLOCKID;
    public String BLOCK_ABBR;
    public String DIRECTION;
    public String LATITUDE;
    public String LONGITUDE;
    public String MSGTIME;
    public String ROUTE;
    public String STOPID;
    public String TIMEPOINT;
    public String TRIPID;
    public String VEHICLE;
    public Double distance;

    public String getADHERENCE() {
        return ADHERENCE;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getVEHICLE() {
        return VEHICLE;
    }

    public void setVEHICLE(String vEHICLE) {
        this.VEHICLE = vEHICLE;
    }

    public String getTRIPID() {
        return TRIPID;
    }

    public void setTRIPID(String tRIPID) {
        this.TRIPID = tRIPID;
    }

    public String getTIMEPOINT() {
        return TIMEPOINT;
    }

    public void setTIMEPOINT(String tIMEPOINT) {
        this.TIMEPOINT = tIMEPOINT;
    }

    public String getSTOPID() {
        return STOPID;
    }

    public void setSTOPID(String sTOPID) {
        this.STOPID = sTOPID;
    }

    public String getROUTE() {
        return ROUTE;
    }

    public void setROUTE(String rOUTE) {
        this.ROUTE = rOUTE;
    }

    public String getMSGTIME() {
        return MSGTIME;
    }

    public void setMSGTIME(String mSGTIME) {
        this.MSGTIME = mSGTIME;
    }

    public String getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(String lONGITUDE) {
        this.LONGITUDE = lONGITUDE;
    }

    public String getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(String lATITUDE) {
        this.LATITUDE = lATITUDE;
    }

    public String getDIRECTION() {
        return DIRECTION;
    }

    public void setDIRECTION(String dIRECTION) {
        this.DIRECTION = dIRECTION;
    }

    public String getBLOCK_ABBR() {
        return BLOCK_ABBR;
    }

    public void setBLOCK_ABBR(String bLOCK_ABBR) {
        this.BLOCK_ABBR = bLOCK_ABBR;
    }

    public String getBLOCKID() {
        return BLOCKID;
    }

    public void setBLOCKID(String bLOCKID) {
        this.BLOCKID = bLOCKID;
    }

    public void setADHERENCE(String aDHERENCE) {
        this.ADHERENCE = aDHERENCE;
    }
    
}