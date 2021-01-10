package com.example.demo6.controller;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import java.io.ByteArrayInputStream;

public class BufferedServletInputStream extends ServletInputStream {
	private ByteArrayInputStream bais;
	private boolean finished = false;

    public BufferedServletInputStream(ByteArrayInputStream bais) {
        this.bais = bais;
    }

    public int available() {
        return bais.available();
    }

    public int read() {
        int data = bais.read();
        if(data == -1){
            finished = true;
        }
        return data;
    }

    public int read(byte[] buf, int off, int len) {
        return bais.read(buf, off, len);
    }

    @Override
    public boolean isFinished() {
        return finished;
    }

    @Override
    public boolean isReady() {
        return true;
    }

    @Override
    public void setReadListener(ReadListener readListener) {
        throw new UnsupportedOperationException();
    }
}
