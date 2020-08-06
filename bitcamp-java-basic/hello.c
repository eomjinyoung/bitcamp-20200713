#include <stdio.h>
#include <stdlib.h>

void plus(int*, int);
void minus(int*, int);

int main() {
  int r1 = 0;
  int r2 = 0;

  plus(&r1, 2);
  plus(&r2, 5);
  plus(&r1, 3);
  minus(&r2, 7);
  minus(&r1, 1);
  
  printf("%d\n", r1);
  printf("%d\n", r2);
  
  return 0;
}

void plus(int* pResult, int a) {
  *pResult = *pResult + a;
}

void minus(int* pResult, int a) {
  *pResult = *pResult - a;
}








