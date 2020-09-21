package com.eomcs.io.ex05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream extends FileOutputStream {

  public DataOutputStream(String filepath) throws FileNotFoundException {
    super(filepath);
  }

  // String 을 바이트 배열로 만들어 출력하는 메서드를 추가한다.
  public void writeUTF(String str) throws IOException {
    byte[] bytes = str.getBytes("UTF-8");
    this.write(bytes.length); // 1 바이트
    this.write(bytes); // 문자열 바이트 
  }

  // int 값을 4바이트로 출력하는 메서드를 추가한다.
  public void writeInt(int i) throws IOException {
    this.write(i >> 24);
    this.write(i >> 16);
    this.write(i >> 8);
    this.write(i);
  }

  // boolean 값을 1바이트로 출력하는 메서드를 추가한다.
  public void writeBoolean(boolean b) throws IOException {
    this.write(b ? 1 : 0);
  }

}
