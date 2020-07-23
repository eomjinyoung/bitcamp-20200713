#include <stdio.h>
#include <stdlib.h>

int main() {
  int age;
  age = 20;
  printf("age = %d\n", age);

  int* pAge = malloc(4);
  *pAge = 200;
  printf("age = %d\n", *pAge);
  printf("age = %d\n", age);
  return 0;
}