package Lesson5;

import java.util.HashMap;
import java.util.Map;

public class MainClassLesson5 {
  public static void main(String[] args) {
    ex5();
  }

  private static void ex5() {
    Map<String,String> passportsToFamilyName=new HashMap<>();
    passportsToFamilyName.put("1526354", "Иванов");
    passportsToFamilyName.put("4657463", "Петров");
    passportsToFamilyName.put("3847566", "Сидоров");
    //System.out.println(passportsToFamilyName);
    for (Map.Entry<String,String>entry:passportsToFamilyName.entrySet()){
      System.out.printf("%s\t%s%n",entry.getKey(),entry.getValue());
    }
  }
  }





