package com.eomcs.io.ex06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream extends FileOutputStream {

  byte[] buf = new byte[8192];
  int cursor = 0;

  public BufferedOutputStream(String filepath) throws FileNotFoundException {
    super(filepath);
  }

  // 1바이트를 파일로 바로 출력하지 않고 버퍼에 담아 두었다가
  // 버퍼가 꽉 차면 그 때 파일로 출력한다.
  @Override
  public void write(int b) throws IOException {
    if (cursor == buf.length) { // 버퍼가 꽉 찼다면,
      this.write(buf);
      cursor = 0;
    }
    buf[cursor++] = (byte) b;
  }

  // 버퍼에 남아있는 데이터를 파일에 출력한다.
  @Override
  public void flush() throws IOException {
    if (cursor > 0) {
      this.write(buf, 0, cursor);
    }
  }


}






