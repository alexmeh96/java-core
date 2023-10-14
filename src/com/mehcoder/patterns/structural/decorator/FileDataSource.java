package com.mehcoder.patterns.structural.decorator;

public class FileDataSource implements DataSource {

    private String data = "";

    @Override
    public void writeData(String data) {
        System.out.println("write data to file: " + data);
        this.data = data;
    }

    @Override
    public String readData() {
        System.out.println("read data from file: " + data);
        return data;
    }
}
