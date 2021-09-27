package com.zcr.stringBuilder;

public class StringBuilder01 {
    public static void main(String[] args) {
        //StringBuilder,StringBuffer,String对比
        long sTime = 0L;
        long eTime = 0L;
        StringBuilder stringBuilder = new StringBuilder("");
        sTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            stringBuilder.append(String.valueOf(i));
        }
        eTime = System.currentTimeMillis();
        System.out.println("stringBuilder:" + (eTime - sTime));
        StringBuffer stringBuffer = new StringBuffer("");
        sTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            stringBuffer.append(String.valueOf(i));
        }
        eTime = System.currentTimeMillis();
        System.out.println("stringBuffer:" + (eTime - sTime));

        String text = "";
        sTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            text = text + i;
        }
        eTime = System.currentTimeMillis();
        System.out.println("String:" + (eTime - sTime));
    }
}
