import java.awt.Image;

public final class CullingCluster {

   int anInt640;
   int anInt641;
   int anInt642;
   int anInt643;
   int anInt644;
   int anInt645;
   static Image anImage646;
   int anInt647;
   public static final int anInt648 = 134;
   int anInt649;
   int anInt650;
   int anInt651;
   int anInt652;
   int anInt653;
   int anInt654;
   int anInt655;
   int anInt656;
   int anInt657;
   int anInt658;
   static final int anInt659 = 1;
   public static final int anInt660 = 135;
   int anInt661;


   public static byte method671(char var0, int var1) {
      byte var2;
      if((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if(8364 == var0) {
            var2 = -128;
         } else if(var0 == 8218) {
            var2 = -126;
         } else if(402 == var0) {
            var2 = -125;
         } else if(8222 == var0) {
            var2 = -124;
         } else if(var0 == 8230) {
            var2 = -123;
         } else if(8224 == var0) {
            var2 = -122;
         } else if(8225 == var0) {
            var2 = -121;
         } else if(710 == var0) {
            var2 = -120;
         } else if(8240 == var0) {
            var2 = -119;
         } else if(var0 == 352) {
            var2 = -118;
         } else if(8249 == var0) {
            var2 = -117;
         } else if(var0 == 338) {
            var2 = -116;
         } else if(381 == var0) {
            var2 = -114;
         } else if(var0 == 8216) {
            var2 = -111;
         } else if(var0 == 8217) {
            var2 = -110;
         } else if(8220 == var0) {
            var2 = -109;
         } else if(var0 == 8221) {
            var2 = -108;
         } else if(8226 == var0) {
            var2 = -107;
         } else if(8211 == var0) {
            var2 = -106;
         } else if(8212 == var0) {
            var2 = -105;
         } else if(732 == var0) {
            var2 = -104;
         } else if(8482 == var0) {
            var2 = -103;
         } else if(var0 == 353) {
            var2 = -102;
         } else if(8250 == var0) {
            var2 = -101;
         } else if(339 == var0) {
            var2 = -100;
         } else if(var0 == 382) {
            var2 = -98;
         } else if(376 == var0) {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }

   public static AnimationDefinition method672(int var0, int var1) {
      AnimationDefinition var2 = (AnimationDefinition)AnimationDefinition.aClass106_2135.get((long)var0);
      if(var2 != null) {
         return var2;
      } else {
         byte[] var3 = AnimationDefinition.configIndexReference.getFile(12, var0, (byte) 7);
         var2 = new AnimationDefinition();
         if(var3 != null) {
            var2.method2232(new RSByteBuffer(var3), (byte)55);
         }

         var2.method2228(1399039780); 
         AnimationDefinition.aClass106_2135.put(var2, (long)var0);
         return var2;
      }
   }
}