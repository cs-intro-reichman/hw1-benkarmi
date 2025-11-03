// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Ascend {
   public Ascend() {
   }

   public static void main(String[] var0) {
      int var1 = (int)(Math.random() * 100.0);
      int var2 = (int)Math.random() * 100;
      int var3 = (int)Math.random() * 100;
      System.out.println("" + var1 + " " + var2 + " " + var3);
      int var4 = Math.min(var1, Math.min(var2, var3));
      int var6 = Math.max(var1, Math.max(var2, var3));
      int var5 = var1 + var2 + var3 - var4 - var6;
      System.out.println("" + var4 + " " + var5 + " " + var6);
   }
}
