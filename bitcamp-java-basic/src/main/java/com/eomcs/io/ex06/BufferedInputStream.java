package com.eomcs.io.ex06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStream extends FileInputStream {

  byte[] buf = new byte[8192];
  int size = 0;
  int cursor = 0;

  public BufferedInputStream(String filepath) throws FileNotFoundException {
    super(filepath);
  }

  // 기존의 read() 메서드를 재정의하였다.
  // => read()를 호출하면,
  //    - 일단 파일에서 8192 바이트를 왕창 읽어 온다.
  //    - 그런 후 1바이트를 리턴한다.
  //    - 버퍼에 받아 놓은 바이트가 다 떨어질 때까지 반복한다.
  //    - 버퍼에 받아 놓은 바이트가 다 떨어지면 다시 파일에서 8192 바이트를 왕창 읽어 온다.
  @Override
  public int read() throws IOException {
    if (cursor == size) { // 버퍼에 데이터가 없거나 버퍼의 데이터를 모두 읽었으면
      // 파일에서 데이터를 읽어 버퍼에 채운다.
      this.size = this.read(buf);
      if (this.size == -1) // 파일을 다 읽었으면, -1을 리턴한다.
        return -1;
      this.cursor = 0;
    }
    return buf[cursor++] & 0x000000ff;
  }
}






