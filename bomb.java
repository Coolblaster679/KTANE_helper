class bomb {
  private static long time;
  private static long startTime;
  private static int strikes;
  static String[] ports, indicators;
  static int batteries;
  static String serial = "";
  static Object[] modules;
  public bomb(long ti,int[] mds) {
    startTime = System.currentTimeMillis()/10;
    time = ti;
    modules = new Object[mds.length];
    char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'}; //no o
    for (int i = 0; i < 8; i++) {
      serial = serial + ("" + chars[(int)(Math.random()*chars.length)]);
    }
    String[] indics = {"SND","CLR","CAR","IND","FRQ","SIG","NSA","MSA","TRN","BOB","FRK"};
    indicators = new String[(int)(Math.random()*3)+1];
    for (int i = 0; i < indicators.length; i++) {
      indicators[i] = indics[(int)(Math.random()*(indics.length-1)+1)];
    }
    String[] portAr = {"DVI-D","Parallel","PS/2","RJ-45","Serial","Stereo RCA"};
    ports = new String[(int)(Math.random()*2)+1];
    for (int i = 0; i < ports.length; i++) {
      ports[i] = portAr[(int)(Math.random()*(portAr.length-1)+1)];
    }
    for(int i = 0; i < mds.length; i++) {
      module temp = new module(mds[i]);
      modules[i] = temp;
    }
    batteries = (int)(Math.random()*4);
    strikes = 3;
  }
  public void check(int num) {
    ((module)(modules[num])).check();
  }
  public String toString() {
    String modString = "";
    for (int i = 0; i < modules.length; i++) {modString += modules[i].toString() + "\n";}
    String portString = "";
    for (int i = 0; i < ports.length; i++) {portString += ports[i] + "\n";}
    String indString = "";
    for (int i = 0; i < indicators.length; i++) {indString += indicators[i] + "\n";}
    return ("" + batteries + " batter" + (batteries==1?"y":"ies") + ",\nThe ports are:\n" + portString + "The (all lit) indicators are:\n" + indString + "and the serial number is " + serial + "\n" + modString + "You have " + timeLeft() + " seconds left.");
  }
  public static int strike() {
    strikes--;
    return strikes;
  }
  public static float timeLeft() {
     return ((float)((startTime - (System.currentTimeMillis()/10)) + (long)time*100)/100);
  }
  public static void printTime() {
    System.out.print(timeLeft());
  }
  public static int getStrikes() {return strikes;}
}
