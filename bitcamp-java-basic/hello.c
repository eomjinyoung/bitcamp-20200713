#include <stdio.h>
#include <stdlib.h>

int plusi(int, int); // function prototype = method signature
float plusf(float, float);

int main() {

  int result = plusi(100, 200);
  
  printf("%d\n", result);
  
  float result2 = plusf(3.14f, 2.3f);
  printf("%f\n", result2);
  
  return 0;
}

int plusi(int a, int b) {
  return a + b;
}

float plusf(float a, float b) {
  return a + b;
}







