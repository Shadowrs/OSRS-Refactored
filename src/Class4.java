
public class Class4 {

   static int anInt37 = 0;
   static String typedUsername = "";
   static PaletteSprite titleButton;
   static RGBSprite aClass108_Sub20_Sub15_Sub1_40;
   static boolean worldListOpen = false;
   static PaletteSprite radioButtonOptions;
   static int[] anIntArray45 = new int[256];
   static String aString46 = "1234567890";
   static PaletteSprite titleBox;
   static int anInt48 = 0;
   static int anInt49 = 0;
   static int anInt50 = 0;
   static World[] worldList;
   static int anInt52 = -270716038;
   static String currentLoadingStatus = "";
   static int anInt54 = 0;
   static String aString55 = "";
   static int[] anIntArray56 = new int[]{0, 1, 2, 3};
   static int anInt57 = 0;
   static boolean aBool58;
   static String typedPassword = "";
   static String aString60 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ";
   static boolean trustComputer = true;
   static int anInt62 = 0;
   static int[] anIntArray63 = new int[]{1, 1, 1, 1};
   static String aString64 = "";
   static Class76 aClass76_65 = Class76.aClass76_1199;
   static int worldCount = 0;
   static int anInt67 = 0;
   static int hoveredWorldID = 2115622661;
   static CacheIndex textureIndex;
   static String aString74 = "";
   static RSInterface aClass108_Sub17_75;


   Class4() throws Throwable {
      throw new Error();
   }

   static String method81(String var0, boolean var1, byte var2) {
      String var3 = var1?"https://":"http://";
      if(Client.anInt2708 * -759629273 == 1) {
         var0 = var0 + "-wtrc";
      } else if(2 == Client.anInt2708 * -759629273) {
         var0 = var0 + "-wtqa";
      } else if(3 == Client.anInt2708 * -759629273) {
         var0 = var0 + "-wtwip";
      } else if(Client.anInt2708 * -759629273 == 5) {
         var0 = var0 + "-wti";
      } else if(Client.anInt2708 * -759629273 == 4) {
         var0 = "local";
      }

      String var4 = "runescape.com";
      return var3 + var0 + "." + var4 + "/l=" + Client.anInt2712 * 148074329 + "/";
   }

   public static void method89(byte var0) {
      AnimationDefinition.animationDefMap.method1371();
      AnimationDefinition.animDefCache.method1371();
   }

   static final void method90(Entity entity, short var1) {
      entity.aBool2348 = false;
      AnimationDefinition animDef;
      if(-1 != entity.anInt2365 * 1103885695) {
         animDef = AnimationDefinition.getAnimDefForID(entity.anInt2365 * 1103885695, 1736575732);
         if(null != animDef && animDef.frameDelays != null) {
            entity.anInt2367 -= 1278050191;
            if(entity.anInt2366 * -65543943 < animDef.frameDelays.length && entity.anInt2367 * -189185903 > animDef.frameLengths[entity.anInt2366 * -65543943]) {
               entity.anInt2367 = -1278050191;
               entity.anInt2366 -= 140058295;
               GameConnection.method815(animDef, entity.anInt2366 * -65543943, entity.anInt2394 * 171470795, entity.anInt2339 * 826764905, (short) -19054);
            }

            if(entity.anInt2366 * -65543943 >= animDef.frameDelays.length) {
               entity.anInt2367 = 0;
               entity.anInt2366 = 0;
               GameConnection.method815(animDef, entity.anInt2366 * -65543943, entity.anInt2394 * 171470795, entity.anInt2339 * 826764905, (short) 1673);
            }
         } else {
            entity.anInt2365 = 278541697;
         }
      }

      if(entity.anInt2373 * 1305815823 != -1 && Client.cycle * -637317861 >= entity.anInt2381 * 2072518067) {
         if(entity.anInt2374 * -766701345 < 0) {
            entity.anInt2374 = 0;
         }

         int spotAnimEmoteID = SpotAnim.getSpotAnimForID(entity.anInt2373 * 1305815823, (byte) 0).animationID * 338579353;
         if(-1 != spotAnimEmoteID) {
            AnimationDefinition spotAnimDef = AnimationDefinition.getAnimDefForID(spotAnimEmoteID, 1789980921);
            if(null != spotAnimDef && null != spotAnimDef.frameDelays) {
               entity.anInt2375 += 662771301;
               if(entity.anInt2374 * -766701345 < spotAnimDef.frameDelays.length && entity.anInt2375 * 1216654189 > spotAnimDef.frameLengths[entity.anInt2374 * -766701345]) {
                  entity.anInt2375 = 662771301;
                  entity.anInt2374 -= 530928865;
                  GameConnection.method815(spotAnimDef, entity.anInt2374 * -766701345, entity.anInt2394 * 171470795, entity.anInt2339 * 826764905, (short) -8973);
               }

               if(entity.anInt2374 * -766701345 >= spotAnimDef.frameDelays.length && (entity.anInt2374 * -766701345 < 0 || entity.anInt2374 * -766701345 >= spotAnimDef.frameDelays.length)) {
                  entity.anInt2373 = -1279943663;
               }
            } else {
               entity.anInt2373 = -1279943663;
            }
         } else {
            entity.anInt2373 = -1279943663;
         }
      }

      if(-1 != entity.anInt2368 * 1647325343 && entity.anInt2371 * 843883743 <= 1) {
         animDef = AnimationDefinition.getAnimDefForID(entity.anInt2368 * 1647325343, 1694780201);
         if(animDef.resetWhenWalk * 1194451065 == 1 && entity.anInt2395 * 2007914849 > 0 && entity.anInt2382 * 651118561 <= Client.cycle * -637317861 && entity.anInt2383 * -1116714413 < Client.cycle * -637317861) {
            entity.anInt2371 = -1894246625;
            return;
         }
      }

      if(entity.anInt2368 * 1647325343 != -1 && 0 == entity.anInt2371 * 843883743) {
         animDef = AnimationDefinition.getAnimDefForID(entity.anInt2368 * 1647325343, 1724689337);
         if(null != animDef && animDef.frameDelays != null) {
            entity.anInt2396 -= 1617696911;
            if(entity.anInt2341 * -2111206063 < animDef.frameDelays.length && entity.anInt2396 * -1771177583 > animDef.frameLengths[entity.anInt2341 * -2111206063]) {
               entity.anInt2396 = -1617696911;
               entity.anInt2341 += 588372913;
               GameConnection.method815(animDef, entity.anInt2341 * -2111206063, entity.anInt2394 * 171470795, entity.anInt2339 * 826764905, (short) 22106);
            }

            if(entity.anInt2341 * -2111206063 >= animDef.frameDelays.length) {
               entity.anInt2341 -= animDef.frameStep * -1797054519;
               entity.anInt2372 -= 1995028343;
               if(entity.anInt2372 * -694571591 >= animDef.anInt2133 * -722580491) {
                  entity.anInt2368 = 821761185;
               } else if(entity.anInt2341 * -2111206063 >= 0 && entity.anInt2341 * -2111206063 < animDef.frameDelays.length) {
                  GameConnection.method815(animDef, entity.anInt2341 * -2111206063, entity.anInt2394 * 171470795, entity.anInt2339 * 826764905, (short) 1574);
               } else {
                  entity.anInt2368 = 821761185;
               }
            }

            entity.aBool2348 = animDef.oneSquareAnimation;
         } else {
            entity.anInt2368 = 821761185;
         }
      }

      if(entity.anInt2371 * 843883743 > 0) {
         entity.anInt2371 += 1894246625;
      }
   }

   static final void method91(String prefix, String var1, int menuActionIdentifier, int actionParameter, int x, int y, int var6) {
      if(!Client.actionMenuOpen) {
         if(Client.menuActionRow * 391839991 < 500) {
            Client.menuActionNamePrefix[Client.menuActionRow * 391839991] = prefix;
            Client.menuActionNames[Client.menuActionRow * 391839991] = var1;
            Client.menuActionIdentifiers[Client.menuActionRow * 391839991] = menuActionIdentifier;
            Client.menuActionParameters[Client.menuActionRow * 391839991] = actionParameter;
            Client.menuActionXInteractions[Client.menuActionRow * 391839991] = x;
            Client.menuActionYInteractions[Client.menuActionRow * 391839991] = y;
            Client.menuActionRow -= 1954561849;
         }
      }
   }
}
