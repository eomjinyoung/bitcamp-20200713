package com.eomcs.basic.ex07;

public class Exam0420 {

  public static void main(String[] args) throws Exception {

    int[] moneys = new int[] {100, 200, 300};
    float[] totals = new float[3];

    compute(moneys, totals, 0.0089f);

    for (int i = 0; i < moneys.length; i++) {
      System.out.printf("%d => %.1f\n", moneys[i], totals[i]);
    }

    System.out.println("---------------------");

    float[] result;
    result = compute2(moneys, 0.0089f);

    for (int i = 0; i < moneys.length; i++) {
      System.out.printf("%d => %.1f\n", moneys[i], result[i]);
    }

  }

  static void compute(int[] moneys, float[] totals, float interest) {
    for (int i = 0; i < moneys.length; i++) {
      totals[i] = moneys[i] + (moneys[i] * interest);
    }
  }

  static float[] compute2(int[] moneys, float interest) {
    float[] totals = new float[moneys.length];
    for (int i = 0; i < moneys.length; i++) {
      totals[i] = moneys[i] + (moneys[i] * interest);
    }
    return totals;
  }

}






