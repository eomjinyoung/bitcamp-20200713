package com.eomcs.io.ex05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStream extends FileInputStream {

  public DataInputStream(String filepath) throws FileNotFoundException {
    super(filepath);
  }

  public String readUTF() throws IOException {
    int size = this.read(); // 문자열의 바이트 배열 수
    byte[] buf = new byte[size];
    this.read(buf); // 바이트 배열 개수 만큼 바이트를 읽어 배열에 저장한다.
    return new String(buf, "UTF-8");
  }

  public int readInt() throws IOException {
    int value = 0;
    value = this.read() << 24;
    value += this.read() << 16;
    value += this.read() << 8;
    value += this.read();
    return value;
  }

  public boolean readBoolean() throws IOException {
    return this.read() == 1; 
  }

}
