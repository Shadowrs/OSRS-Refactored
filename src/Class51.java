
public class Class51 {

   static final int anInt707 = 100;
   int anInt708 = -948638743;
   int[] anIntArray709;
   static int actionMenuX;
   ClientScriptDefinition aClass108_Sub20_Sub17_711;
   static final int anInt712 = 104;
   static final int anInt713 = 16;
   static final int anInt714 = 10;
   String[] aStringArray715;
   static int anInt716;


   static final int method702(int var0, int var1, int var2, int var3) {
      int var4 = var0 / var2;
      int var13 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var8 = var1 & var2 - 1;
      int var9 = Applet_Sub1.method3283(var4, var5, (short)-14670);
      int var6 = Applet_Sub1.method3283(1 + var4, var5, (short)-25021);
      int var12 = Applet_Sub1.method3283(var4, 1 + var5, (short)-3293);
      int var7 = Applet_Sub1.method3283(var4 + 1, 1 + var5, (short)223);
      int var14 = VertexNormal.method695(var9, var6, var13, var2, -1855200784);
      int var11 = 65536 - Rasterizer3D.COSINE[var13 * 1024 / var2] >> 1;
      int var10 = ((65536 - var11) * var12 >> 16) + (var11 * var7 >> 16);
      return VertexNormal.method695(var14, var10, var8, var2, 1000914462);
   }

   static void method703(Player var0, int var1, int var2, short var3) {
      if(var1 == var0.anInt2368 * 1647325343 && -1 != var1) {
         int var4 = CullingCluster.method672(var1, 1866864408).delayType * -95027165;
         if(1 == var4) {
            var0.anInt2341 = 0;
            var0.anInt2396 = 0;
            var0.anInt2371 = var2 * -1894246625;
            var0.anInt2372 = 0;
         }

         if(2 == var4) {
            var0.anInt2372 = 0;
         }
      } else if(-1 == var1 || var0.anInt2368 * 1647325343 == -1 || CullingCluster.method672(var1, 1805243537).forcedPriority * -1435646185 >= CullingCluster.method672(var0.anInt2368 * 1647325343, 1489363310).forcedPriority * -1435646185) {
         var0.anInt2368 = var1 * -821761185;
         var0.anInt2341 = 0;
         var0.anInt2396 = 0;
         var0.anInt2371 = var2 * -1894246625;
         var0.anInt2372 = 0;
         var0.anInt2395 = var0.anInt2390 * 1986639247;
      }
   }

   static int method704(int var0, int var1, int var2) {
      Class108_Sub12 var3 = (Class108_Sub12)Class108_Sub12.aClass101_1673.get((long) var0);
      if(var3 == null) {
         return 0;
      } else if(-1 == var1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.anIntArray1675.length; ++var5) {
            if(var1 == var3.anIntArray1671[var5]) {
               var4 += var3.anIntArray1675[var5];
            }
         }

         return var4;
      }
   }

   static final void method705(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9) {
      Class108_Sub13 var10 = null;

      for(Class108_Sub13 var11 = (Class108_Sub13) Client.aClass105_2939.getFront(); null != var11; var11 = (Class108_Sub13) Client.aClass105_2939.getNext()) {
         if(var0 == var11.anInt1694 * -1237003511 && var1 == var11.anInt1692 * -1711169553 && var2 == var11.anInt1681 * -233897981 && var11.anInt1679 * -1012881333 == var3) {
            var10 = var11;
            break;
         }
      }

      if(var10 == null) {
         var10 = new Class108_Sub13();
         var10.anInt1694 = var0 * -477713607;
         var10.anInt1679 = var3 * -1614814877;
         var10.anInt1692 = var1 * 341929743;
         var10.anInt1681 = var2 * 1934863019;
         FriendsChatMember.method1685(var10, (byte)0);
         Client.aClass105_2939.insertBack(var10);
      }

      var10.anInt1682 = var4 * 936887065;
      var10.anInt1688 = var5 * 1223104777;
      var10.anInt1687 = var6 * -1295612817;
      var10.anInt1689 = var7 * 246325965;
      var10.anInt1690 = var8 * -881348299;
   }

   static final void method706(int var0, int var1) {
      if(AbstractIndex.method1073(var0, -2068560407)) {
         RSInterface[] var2 = RSInterface.interface_cache[var0];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            RSInterface var4 = var2[var3];
            if(null != var4) {
               var4.anInt1877 = 0;
               var4.anInt1805 = 0;
            }
         }

      }
   }

}
