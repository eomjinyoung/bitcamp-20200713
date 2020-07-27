#include <stdio.h>
#include <stdlib.h>

int main() {
  int x;
  printf("%d\n", x);
  
  int* xx;
  xx = 100;
  printf("%d\n", *xx);
  

  int i[3];
  i[0] = 100;
  i[1] = 200;
  i[2] = 300;
  
  printf("%d, %d, %d\n", i[0], i[1], i[2]);
  
  int* p;
  
  //p = &i[0];
  p = i;
  printf("%d\n", *(p + 2));

  
  int* p2 = (int*)malloc(sizeof(int) * 3);
  
  *p2 = 110;
  *(p2 + 1) = 220;
  *(p2 + 2) = 330;
  
  printf("%d, %d, %d\n", *p2, *(p2 + 1), *(p2 + 2));
  printf("%d, %d, %d\n", p2[0], p2[1], p2[2]);
  
  printf("%d\n", *(p2 + 3));
  printf("%d\n", p2[3]);
  
  free(p2);
  
  printf("%d, %d, %d\n", *p2, *(p2 + 1), *(p2 + 2));
  
  
  int* x1;
  
  x1 = (int*) malloc(12); // 예) 100 번지
  x1 = (int*) malloc(120); // 예) 200 번지, 
  // 100번지는 주소를 잃어 버렸다. 사용할 수 없다.
  // dangling object = garbage
  
  free(x1); // 메모리 해제. 200번지 주소는 무효하다.
  
  x1[0] = 34; // x1은 무효한 주소를 갖고 있다.
  // 무효한 주소를 dangling pointer 라 부른다.
  
  
  
  
  
  
  return 0;
}







