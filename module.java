import java.util.*;
class module {
  Scanner myObj = new Scanner(System.in);
  ArrayList<Object> data = new ArrayList<Object>();
  boolean cleared;
  public module(int type) {
    data.add(type);
    cleared = false;
    switch (type) { 
      case 0: //complex wires
        if (true) {
        String[] ea2 = {"LED", "red", "blue", "star"};
        boolean[][] setupArray = new boolean[6][4];
        int[] answers = new int[6];
        for (int i = 0; i < 6; i++) {
          boolean[] setup = {Main.tf(),Main.tf(),Main.tf(),Main.tf()};
          int x,y;
          int[][] board = {{0, 2, 1, 3}, {2, 2, 4, 2}, {0, 1, 4, 3}, {0, 3, 4, 1}};
          if (setup[1]) {
            if (setup[3]) { y = 3; } else { y = 1; }
          } else {
            if (setup[3]) { y = 2; } else { y = 0; }
          }
          if (setup[2]) {
            if (setup[0]) { x = 3; } else { x = 1; }
          } else {
            if (setup[0]) { x = 2; } else { x = 0; }
          }
          setupArray[i] = setup;
          answers[i] = board[y][x];
        }
        data.add(setupArray);
        data.add(ea2);
        data.add(answers);
        }
        break;
      case 1: // password
        if (true) {
        String[] passes = {"about","after","again","below","could","every","first","found","great","house","large","learn","never","other","place","plant","point","right","small","sound","spell","still","study","their","there","these","thing","think","three","water","where","which","world","would","write"};
        char[] abcs = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[][] display = {{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0},{0,0,0,0,0,0}};
        String cPass = passes[(int)(Math.random()*passes.length)];
        for (int j = 0; j < 5; j++) {
          for (int i = 0; i < 5; i++) {
            while (true) {
              int k = (int)(Math.random()*6);
              if (display[j][k] == 0) {
                display[j][k] = abcs[(int)(Math.random()*abcs.length)];
                break;
              }
            }
          }
        }
        for (int j = 0; j < 5; j++) {
          for (int i = 0; i < 6; i++) {
            if (display[j][i] == 0) {
              display[j][i] = cPass.charAt(j);
              break;
            }                       
          }
        } 
        data.add(cPass);
        for (int m = 0; m < 5; m++) {
          String tempx = new String(display[m]);
          data.add(tempx);
        }
        }
        break;
      case 2: //wire seq
        if (true) {
        String[] rbb = {"Red","Blue","Black"};
        String[] abc = {"A","B","C"};
        int[][][] key = {{{3},{2},{1},{1,3},{2},{1,3},{1,2,3},{1,2},{2}},
                     {{2},{1,3},{2},{1},{2},{2,3},{3},{1,3},{1}},
                     {{1,2,3},{1,3},{2},{1,3},{2},{2,3},{1,2},{3},{3}}};
        int[] i = {0,0,0};
        int total = (int)(Math.random()*14+4);
        int k = 0;
        String[] cc = new String[total];
        boolean[] solution = new boolean[total];
        while (i[0] + i[1] + i[2] < total) {
          int color = (int)(Math.random()*3+1);
          int connection = (int)(Math.random()*3+1);
          solution[k] = false;
          for (int j = 0; j < key[color-1][i[color-1]].length;j++) {
            if (key[color-1][i[color-1]][j] == connection) {
              solution[k] = true;
            }
          }
          cc[k] = (rbb[color-1] + " connected to " + abc[connection-1]);
          i[color-1]++;
          k++;
        }
        data.add(cc);
        data.add(solution);
        }
        break;
      case 3: //button
        if (true) {
        String[] colorAr = {"red","blue","white","yellow"};
        String[] labelAr = {"Abort","Detonate","Hold","Press"};
        String color = colorAr[(int)(Math.random()*(colorAr.length-1))];
        String strip = colorAr[(int)(Math.random()*(colorAr.length-1))];
        String label = labelAr[(int)(Math.random()*(labelAr.length-1))];
        boolean tap = false;
        boolean frk = false;
        boolean car = false;
        for (int i = 0; i < bomb.indicators.length; i++) {
          if (bomb.indicators[i].equals("FRK")) {frk = true;}
          else if (bomb.indicators[i].equals("CAR")) {car = true;}
        }
        for (int i = 0; i > bomb.indicators.length;i++) {frk = true;}
        if (color.equals("blue") && label.equals("Abort")) {
          tap = false;
        } else if (label.equals("Detonate") && bomb.batteries > 1) {
          tap = true;
        } else if (color.equals("white") && car) {
          tap = false;
        } else if (bomb.batteries > 2 && frk) {
          tap = true;
        } else if (color.equals("yellow")) {
          tap = false;
        } else if (color.equals("red") && label.equals("hold")) {
          tap = true;
        }
        data.add(color);
        data.add(label);
        data.add(tap);
        data.add(strip);
        }
        break;
      case 4: //keypad
        if (true) {
          String[][] table = {{"Dick O","Dick A","Upside Down Y", "Crackhead N","Crab Walker","Crackhead H","Backwards C With A Dot"},{"Screaming Guy","Head","Backwards C With A Dot","Loop De Loop","Hollow Star","Crackhead H","Upside down question Mark"},{"Copyright","Weird Chin Guy","Loop De Loop","Mirrored K","A Three That Just Gave Up","Upside Down Y","Hollow Star"},{"Six On Crack","Filled P","B Combined With T","Crab Walker","Mirrored K","Upside Down Question Mark","Guy Sticking His Tongue Out"},{"Trident","Guy Sticking His Tongue OutGuy Sticking His Tongue Out","B Combined With T","C With A Dot","Filled P","Alien 3","Filled In Star"},{"Six On Crack","Screaming Guy","Puzzle Piece","AE","Trident","Backwards Zeus N","Omega"}};
          int selection = (int)(Math.random()*5);
          String[] display = new String[4];
          int[] is = new int[4];
          for (int i = 0; i < 4; i++) {
            int selection2 = (int)(Math.random()*6);
            if (!(table[selection][selection2].equals(""))) {
              display[i] = table[selection][selection2];
              is[i] = selection2;
              table[selection][selection2] = "";
            } else {i--;}
          }
          int[] answer = new int[4];
          int j = 0;
          for (int i = 0; i < 7; i++) {
            int temp = Main.findIndex(is, i);
            if (!(temp == -1)) {
              answer[j] = temp;
              j++;
            }
          }
          data.add(display);
          data.add(answer);
        }
        break;
      case 5: //wires
        if (true) {
          String[] wires = new String[(int)(Math.random()*3+3)];
          String[] colors = {"red","yellow","blue","white","black"};
          int solution = -1;
          for (int i = 0; i < wires.length; i++) {
            wires[i] = colors[(int)(Math.random()*4)];
          }
          int reds = 0;
          int blues = 0;
          int yellows = 0;
          int blacks = 0;
          int whites = 0;
          int lastBlue = -1;
          int lastRed = -1;
          int lastYellow = -1;
          int lastBlack = -1;
          for (int i = 0; i < wires.length; i++) {
            if (wires[i].equals("red")) {
              reds++;
              lastRed = i;
            } else if (wires[i].equals("blue")) {
              blues++;
              lastBlue = i;
            } else if (wires[i].equals("yellow")) {
              yellows++;
              lastYellow = i;
            } else if (wires[i].equals("black")){
              blacks++;
              lastBlack = i;
            } else if (wires[i].equals("white")) {
              whites++;
            }
          }
          switch (wires.length) {
            case 3:
              if (reds == 0) {
                solution = 1;
              } else if (wires[2].equals("white")) {
                solution = 2;
              } else if (blues > 1) {
                solution = lastBlue+1;
              } else {solution = 2;}
              break;
            case 4:
              if (reds > 1 && Character.isDigit(bomb.serial.charAt(7)) && bomb.serial.charAt(7) % 2 == 0) {
                solution = lastRed+1;
              } else if (wires[3] == "yellow" && reds == 0) {
                solution = 0;
              } else if (blues == 1) {
                solution = 0;
              } else if (yellows > 1) {
                solution = 3;
              } else {solution = 1;}
              break;
            case 5:
              if (wires[4] == "black" && Character.isDigit(bomb.serial.charAt(7)) && bomb.serial.charAt(7) % 2 == 1) {
                solution = 3;
              } else if (reds == 1 && yellows > 1) {
                solution = 0;
              } else if (blacks == 0) {
                solution = 1;
              } else {solution = 0;}
              break;
            case 6:
              if (yellows == 0 && Character.isDigit(bomb.serial.charAt(7)) && bomb.serial.charAt(7) % 2 == 1) {
                solution = 2;
              } else if (yellows == 1 && whites > 1) {
                solution = 3;
              } else if (reds == 0) {
                solution = 5;
              } else {
                solution = 4;
              }
          }
        data.add(wires);
        data.add(solution);
        }
        break;
      case 6: //simon says
        if (true) {
          String[][][] table = {{{"Blue","Red","Yellow","Green"},{"Yellow","Green","Blue","Red"},{"Green","Red","Yellow","Blue"}},{{"Blue","Green","Yellow","Red"},{"Red","Blue","Yellow","Green"},{"Yellow","Green","Blue","Red"}}};
          String[][] tableAnswers;
          boolean i = false;
          for(int j=0;j<bomb.serial.length();j++) {
	          char ch=bomb.serial.charAt(j);	
            switch(ch) {
              case  'a' :
              case 'e'  :
              case 'i'   :
              case 'o'  :
              case 'u'  :
              case  'A' :
              case 'E'  :
              case 'I'   :
              case 'O'  :	
              case 'U'  :i=true;		 
            }	
          }
          if (i) {
            tableAnswers = table[0];
          } else {tableAnswers = table[1];}
          int[] flashes = new int[((int)(Math.random()*3+3))];
          for (int j = 0; j < flashes.length; j++) {
            flashes[j] = (int)(Math.random()*3);
          }
          data.add(tableAnswers);
          data.add(flashes);
        }
        break;
      case 7: //who's on first
        if (true) {
          String[] displayWords = {"","BLANK","C","CEE","DISPLAY","FIRST","HOLD ON","LEAD","LED","LEED","NO","NOTHING","OKAY","READ","RED","REED","SAYS","SEE","THEIR","THERE","THEY ARE","THEY'RE","UR","YES","YOU","YOU ARE","YOUR","YOU'RE"};
          String[] buttWords = {"READY","FIRST","NO","BLANK","NOTHING","YES","WHAT","UHHH","LEFT","RIGHT","MIDDLE","OKAY","WAIT","PRESS","YOU","YOU ARE","YOUR","YOU'RE","UR","U","UH HUH","UH UH","WHAT?","DONE","NEXT","HOLD","SURE","LIKE"};
          Map<String,Integer> displayStrings = new HashMap<String,Integer>();
          displayStrings.put("",5);
          displayStrings.put("BLANK",4);
          displayStrings.put("C",2);
          displayStrings.put("CEE",6);
          displayStrings.put("DISPLAY",6);
          displayStrings.put("FIRST",2);
          displayStrings.put("HOLD ON",6);
          displayStrings.put("LEAD",6);
          displayStrings.put("LED",3);
          displayStrings.put("LEED",5);
          displayStrings.put("NO",6);
          displayStrings.put("NOTHING",3);
          displayStrings.put("OKAY",2);
          displayStrings.put("READ",4);
          displayStrings.put("RED",4);
          displayStrings.put("REED",5);
          displayStrings.put("SAYS",6);
          displayStrings.put("SEE",6);
          displayStrings.put("THEIR",4);
          displayStrings.put("THERE",6);
          displayStrings.put("THEY ARE",3);
          displayStrings.put("THEY'RE",5);
          displayStrings.put("UR",1);
          displayStrings.put("YES",3);
          displayStrings.put("YOU",4);
          displayStrings.put("YOU ARE",6);
          displayStrings.put("YOUR",4);
          displayStrings.put("YOU'RE",6);
          HashMap<String,String[]> wordList = new HashMap<String,String[]>();
          wordList.put("READY",new String[]{"YES","OKAY","WHAT", "MIDDLE", "LEFT", "PRESS", "RIGHT", "BLANK", "READY"});
          wordList.put("FIRST",new String[]{"LEFT", "OKAY", "YES", "MIDDLE", "NO", "RIGHT", "NOTHING", "UHHH", "WAIT", "READY", "BLANK", "WHAT", "PRESS", "FIRST"});
          wordList.put("NO",new String[]{"BLANK", "UHHH", "WAIT", "FIRST", "WHAT", "READY", "RIGHT", "YES", "NOTHING", "LEFT", "PRESS", "OKAY", "NO"});
          wordList.put("BLANK",new String[]{"WAIT", "RIGHT", "OKAY", "MIDDLE", "BLANK"});
          wordList.put("NOTHING",new String[]{"UHHH", "RIGHT", "OKAY", "MIDDLE", "YES", "BLANK", "NO", "PRESS", "LEFT", "WHAT", "WAIT", "FIRST", "NOTHING"});
          wordList.put("YES",new String[]{"OKAY", "RIGHT", "UHHH", "MIDDLE", "FIRST", "WHAT", "PRESS", "READY", "NOTHING", "YES"});
          wordList.put("WHAT",new String[]{"UHHH","WHAT"});
          wordList.put("UHHH",new String[]{"READY", "NOTHING", "LEFT", "WHAT", "OKAY", "YES", "RIGHT", "NO", "PRESS", "BLANK", "UHHH"});
          wordList.put("LEFT",new String[]{"RIGHT","LEFT"});
          wordList.put("RIGHT",new String[]{"YES", "NOTHING", "READY", "PRESS", "NO", "WAIT", "WHAT", "RIGHT"});
          wordList.put("MIDDLE",new String[]{"BLANK", "READY", "OKAY", "WHAT", "NOTHING", "PRESS", "NO", "WAIT", "LEFT", "MIDDLE"});
          wordList.put("OKAY",new String[]{"MIDDLE", "NO", "FIRST", "YES", "UHHH", "NOTHING", "WAIT", "OKAY"});
          wordList.put("WAIT",new String[]{"UHHH", "NO", "BLANK", "OKAY", "YES", "LEFT", "FIRST", "PRESS", "WHAT", "WAIT"});
          wordList.put("PRESS",new String[]{"RIGHT", "MIDDLE", "YES", "READY", "PRESS"});
          wordList.put("YOU",new String[]{"SURE", "YOU ARE", "YOUR", "YOU'RE", "NEXT", "UH HUH", "UR", "HOLD", "WHAT?", "YOU"});
          wordList.put("YOU ARE",new String[]{"YOUR", "NEXT", "LIKE", "UH HUH", "WHAT?", "DONE", "UH UH", "HOLD", "YOU", "U", "YOU'RE", "SURE", "UR", "YOU ARE"});
          wordList.put("YOUR",new String[]{"UH UH", "YOU ARE", "UH HUH", "YOUR"});
          wordList.put("YOU'RE",new String[]{"YOU", "YOU'RE"});
          wordList.put("UR",new String[]{"DONE", "U", "UR"});
          wordList.put("U",new String[]{"UH HUH", "SURE", "NEXT", "WHAT?", "YOU'RE", "UR", "UH UH", "DONE"});
          wordList.put("UH HUH",new String[]{"UH HUH"});
          wordList.put("UH UH",new String[]{"UR", "U", "YOU ARE", "YOU'RE", "NEXT", "UH UH"});
          wordList.put("WHAT?",new String[]{"YOU", "HOLD", "YOU'RE", "YOUR", "U", "DONE", "UH UH", "LIKE", "YOU ARE", "UH HUH", "UR", "NEXT", "WHAT?"});
          wordList.put("DONE",new String[]{"SURE", "UH HUH", "NEXT", "WHAT?", "YOUR", "UR", "YOU'RE", "HOLD", "LIKE", "YOU", "U", "YOU ARE", "UH UH", "DONE"});
          wordList.put("NEXT",new String[]{"WHAT?", "UH HUH", "UH UH", "YOUR", "HOLD", "SURE", "NEXT"});
          wordList.put("HOLD",new String[]{"YOU ARE", "U", "DONE", "UH UH", "YOU", "UR", "SURE", "WHAT?", "YOU'RE", "NEXT", "HOLD"});
          wordList.put("SURE",new String[]{"YOU ARE", "DONE", "LIKE", "YOU'RE", "YOU", "HOLD", "UH HUH", "UR", "SURE"});
          wordList.put("SURE",new String[]{"YOU'RE", "NEXT", "U", "UR", "HOLD", "DONE", "UH UH", "WHAT?", "UH HUH", "YOU", "LIKE"});
          String[] displays = new String[3];
          String[][] buttons = new String[3][6];
          int[] answers = new int[3];
          for (int i = 0; i < 3; i++) {
            displays[i] = displayWords[(int)(Math.random()*(displayWords.length-1))];
            String[] tempButtWords = buttWords;
            for (int j = 0; j < 6; j++) {
              int ran = (int)(Math.random()*(buttWords.length-1));
              if (!(tempButtWords[ran] == "")) {
                buttons[i][j] = tempButtWords[ran];
                tempButtWords[ran] = "";
              } else {j--;}
            }
            boolean breakAll = false;
            String[] list = wordList.get(buttons[i][displayStrings.get(displays[i])-1]);
            for (int j = 0; j < list.length; j++) {
              for (int k = 0; k < 6; k++) {
                if (buttons[i][k].equals(list[j])) {
                  answers[i] = k;
                  breakAll = true;
                  break;
                }
              }
              if (breakAll) {break;}
            }
          }
          data.add(displays);
          data.add(buttons);
          data.add(answers);
        }
        break;
      case 8: //memory
        if (true) {
          int[] displays = new int[5];
          int[] answers = new int[5];
          int[][] buttons = new int[5][4];
          for (int i = 0; i < 5; i++) {
            displays[i] = (int)(Math.random()*3+1);
            boolean[] templ = {false,false,false,false};
            for (int j = 4; j > 0;j--) {
              int temp = (int)(Math.random()*4);
              if (!templ[temp]) {
                buttons[i][temp] = j;
                templ[temp] = true;
              } else {j++;}
            }
          }
          switch (displays[0]) {
            case 1:
              answers[0] = 2;
              break;
            case 2:
              answers[0] = 2;
              break;
            case 3:
              answers[0] = 3;
              break;
            case 4:
              answers[0] = 4;
              break;
          }
          switch (displays[1]) {
            case 1:
              answers[1] = Main.findIndex(buttons[1], 4)+1;
              break;
            case 2:
              answers[1] = answers[0];
              break;
            case 3:
              answers[1] = 1;
              break;
            case 4:
              answers[1] = answers[0];
              break;
          }
          switch (displays[2]) {
            case 1:
              answers[2] = Main.findIndex(buttons[2], buttons[1][answers[1]-1])+1;
              break;
            case 2:
              answers[2] = Main.findIndex(buttons[2], buttons[0][answers[0]-1])+1;
              break;
            case 3:
              answers[2] = 3;
              break;
            case 4:
              answers[2] = Main.findIndex(buttons[2], 4)+1;
              break;
          }
          switch (displays[3]) {
            case 1:
              answers[3] = answers[0];
              break;
            case 2:
              answers[3] = 1;
              break;
            case 3:
              answers[3] = answers[1];
              break;
            case 4:
              answers[3] = answers[1];
              break;
          }
          switch (displays[4]) {
            case 1:
              answers[4] = Main.findIndex(buttons[4], buttons[0][answers[0]-1])+1;
              break;
            case 2:
              answers[4] = Main.findIndex(buttons[4], buttons[1][answers[1]-1])+1;
              break;
            case 3:
              answers[4] = Main.findIndex(buttons[4], buttons[2][answers[2]-1])+1;
              break;
            case 4:
              answers[4] = Main.findIndex(buttons[4], buttons[3][answers[3]-1])+1;
              break;
          }
          data.add(displays);
          data.add(buttons);
          data.add(answers);
        }
        break;
      case 9: //morse code
        if (true) {
          String[] words = {"beats","bistro","bombs","boxes","break","brick","flick","halls","leaks","shell","slick","steak","sting","strobe","trick","vector"};
          double[] freqs = {3.6,3.552,3.565,3.535,3.572,3.575,3.555,3.515,3.542,3.505,3.522,3.582,3.592,3.545,3.532,3.595};
          int r = (int)(Math.random()*words.length);
          String word = words[r];
          double ans = freqs[r];
          boolean[][] constructor = new boolean[word.length()][];
          int count = 0;
          int dotLength = 25;
          for (int i = 0; i < word.length(); i++) {
            constructor[i] = Main.toMorse(word.charAt(i));
            count += 2*constructor[i].length+2;
          }
          int[] display = new int[count+10];
          display[0] = 14*dotLength;
          int k = 1;
          for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < constructor[i].length; j++) {
              if (constructor[i][j]) {
                display[k] = 3*dotLength;
              } else{
                display[k] = dotLength;
              }
              k++;
              display[k] = 2*dotLength;
              k++;
            }
            display[k] = 0;
            k++;
            display[k] = 5*dotLength;
            k++;
          }
          int totalTime = 0;
          for (int i = 0; i < display.length; i++) {
            totalTime+=display[i];
          }
          data.add(word);
          data.add(ans);
          data.add(display);
          data.add(totalTime);
        }
        break;
      case 10: //maze
        if (true) {
          boolean[][][][] table = {{{{false,true,false,true},{false,false,true,true},{false,true,true,false},{false,true,false,true},{false,false,true,true},{false,false,true,false}},{
            {true,true,false,false},{false,true,false,true},{true,false,true,false},{true,false,false,true},{false,false,true,true},{false,true,true,false}},{
            {true,true,false,false},{true,false,false,true},{false,true,true,false},{false,true,false,true},{false,false,true,true},{true,true,true,false}},{
            {true,true,false,false},{false,false,false,true},{true,false,true,true},{true,false,true,false},{false,false,false,true},{true,true,true,false}},{
            {true,true,false,true},{false,false,true,true},{false,true,true,false},{false,true,false,true},{false,false,true,false},{true,true,false,false}}, {
            {true,false,false,true},{false,false,true,false},{true,false,false,true},{true,false,true,false},{false,false,false,true},{true,false,true,false}}},
            
            {{{false,false,false,true},{false,true,true,true},{false,false,true,false},{false,true,false,true},{false,true,true,true},{false,false,true,false}},{
            {false,true,false,true},{true,false,true,false},{false,true,false,true},{true,false,true,false},{true,false,false,true},{false,true,true,false}},{
            {true,true,false,false},{false,true,false,true},{true,false,true,false},{false,true,false,true},{false,false,true,true},{true,true,true,false}},{
            {true,true,false,true},{true,false,true,false},{false,true,false,true},{true,false,true,false},{false,true,false,false},{true,true,false,false}},{
            {true,true,false,false},{false,true,false,false},{true,true,false,false},{false,true,false,true},{true,false,true,false},{true,true,false,false}},{
            {true,false,false,false},{true,false,false,true},{true,false,true,false},{true,false,false,true},{false,false,true,true},{true,false,true,false}}},
                                   
            {{{false,true,false,true},{false,false,true,true},{false,true,true,false},{false,true,false,false},{false,true,false,true},{false,true,true,false}},{
            {true,false,false,false},{false,true,false,false},{true,true,false,false},{true,false,false,true},{true,false,true,false},{true,true,false,false}},{
            {false,true,false,true},{true,true,true,false},{true,true,false,false},{false,true,false,true},{false,true,true,false},{true,true,false,false}},{
            {true,true,false,false},{true,true,false,false},{true,true,false,false},{true,true,false,false},{true,true,false,false},{true,true,false,false}},{
            {true,true,false,false},{true,false,false,true},{true,false,true,false},{true,true,false,false},{true,true,false,false},{true,true,false,false}},{
            {true,false,false,true},{false,false,true,true},{false,false,true,true},{true,false,true,false},{true,false,false,true},{true,false,true,false}}},

            {{{false,true,false,true},{false,true,true,false},{false,false,false,true},{false,false,true,true},{false,false,true,true},{false,true,true,false}},{
            {true,true,false,false},{true,true,false,false},{false,true,false,true},{false,false,true,true},{false,false,true,true},{true,true,true,false}},{
            {true,true,false,false},{true,false,false,true},{true,false,true,false},{false,true,false,true},{false,false,true,false},{true,true,false,false}},{
            {true,true,false,false},{false,false,false,true},{false,false,true,true},{true,false,true,true},{false,false,true,true},{true,true,true,false}},{
            {true,true,false,true},{false,false,true,true},{false,false,true,true},{false,false,true,true},{false,true,true,false},{true,true,false,false}},{
            {true,false,false,true},{false,false,true,true},{false,false,true,false},{false,false,false,true},{true,false,true,false},{true,false,false,false}}},

            {{{false,false,false,true},{false,false,true,true},{false,false,true,true},{false,false,true,true},{false,true,true,true},{false,true,true,false}},{
            {false,true,false,true},{false,false,true,true},{false,false,true,true},{false,true,true,true},{true,false,true,false},{true,false,false,false}},{
            {true,true,false,true},{false,true,true,false},{false,false,false,true},{true,false,true,false},{false,true,false,true},{false,true,true,false}},{
            {true,true,false,false},{true,false,false,true},{false,false,true,true},{false,true,true,false},{true,false,false,false},{true,true,false,false}},{
            {true,true,false,false},{false,true,false,true},{false,false,true,true},{true,false,true,true},{false,false,true,false},{true,true,false,false}},{
            {true,false,false,false},{true,false,false,true},{false,false,true,true},{false,false,true,true},{false,false,true,true},{true,false,true,false}}},

            {{{false,true,false,false},{false,true,false,true},{false,true,true,false},{false,false,false,true},{false,true,true,true},{false,true,true,false}},{
            {true,true,false,false},{true,true,false,false},{true,true,false,false},{false,true,false,true},{true,false,true,false},{true,true,false,false}},{
            {true,true,false,true},{true,false,true,false},{true,false,false,false},{true,true,false,false},{false,true,false,true},{true,false,true,false}},{
            {true,false,false,true},{false,true,true,false},{false,true,false,true},{true,true,true,false},{true,true,false,false},{false,true,false,false}},{
            {false,true,false,true},{true,false,true,false},{true,false,false,false},{true,true,false,false},{true,false,false,true},{true,true,true,false}},{
            {true,false,false,true},{false,false,true,true},{false,false,true,true},{true,false,true,true},{false,false,false,true},{true,false,true,false}}},

            {{{false,true,false,true},{false,false,true,true},{false,false,true,true},{false,true,true,false},{false,true,false,true},{false,true,true,false}},{
              {true,true,false,false},{false,true,false,true},{false,false,true,false},{true,false,false,true},{true,false,true,false},{true,true,false,false}},{
              {true,false,false,true},{true,false,true,false},{false,true,false,true},{false,false,true,false},{false,true,false,true},{true,false,true,false}},{
              {false,true,false,true},{false,true,true,false},{true,true,false,true},{false,false,true,true},{true,false,true,false},{false,true,false,false}},{
              {true,true,false,false},{true,false,false,false},{true,false,false,true},{false,false,true,true},{false,true,true,false},{true,true,false,false}},{
              {true,false,false,true},{false,false,true,true},{false,false,true,true},{false,false,true,true},{true,false,true,true},{true,false,true,false}}},
                                   
            {{{false,true,false,false},{false,true,false,true},{false,false,true,true},{false,true,true,false},{false,true,false,true},{false,true,true,false}},{
              {true,true,false,true},{true,false,true,true},{false,false,true,false},{true,false,false,true},{true,false,true,false},{true,true,false,false}},{
              {true,true,false,false},{false,true,false,true},{false,false,true,true},{false,false,true,true},{false,true,true,false},{true,true,false,false}},{
              {true,true,false,false},{true,false,false,true},{false,true,true,false},{false,false,false,true},{true,false,true,true},{true,false,true,false}},{
              {true,true,false,false},{false,true,false,false},{true,false,false,true},{false,false,true,true},{false,false,true,true},{false,false,true,false}},{
              {true,false,false,true},{true,false,true,true},{false,false,true,true},{false,false,true,true},{false,false,true,true},{false,false,true,false}}},

            {{{false,true,false,false},{false,true,false,true},{false,false,true,true},{false,false,true,true},{false,true,true,true},{false,true,true,false}},{
              {true,true,false,false},{true,true,false,false},{false,true,false,true},{false,false,true,false},{true,true,false,false},{true,true,false,false}},{
              {true,true,false,true},{true,false,true,true},{true,false,true,false},{false,true,false,true},{true,false,true,false},{true,true,false,false}},{
              {true,true,false,false},{false,true,false,false},{false,true,false,true},{true,false,true,false},{false,false,false,true},{true,true,true,false}},{
              {true,true,false,false},{true,true,false,false},{true,true,false,false},{false,true,false,true},{false,true,true,false},{true,false,false,false}},{
              {true,false,false,true},{true,false,true,false},{true,false,false,true},{true,false,true,false},{true,false,false,true},{false,false,true,false}}}}; int selection = (int)(Math.random()*8);
          boolean[][][] board = table[selection];
          int[][][] circleTable = {{{1,5},{6,4}},{{2,3},{5,5}},{{4,3},{6,3}},{{1,6},{1,3}},{{4,1},{5,4}},{{3,2},{5,6}},{{2,1},{2,6}},{{3,3},{4,6}},{{1,2},{3,5}}};
          int[][] circles = circleTable[selection];
          int[] square = {(int)(Math.random()*5+1),(int)(Math.random()*5+1)};
          int[] triangle = {(int)(Math.random()*5+1),(int)(Math.random()*5+1)};
          while (true) {
            if (triangle[0] + 3 > square[0] && triangle[0] - 3 < square[0] && 
                triangle[1] + 3 > square[1] && triangle[1] - 3 < square[1]) {
              int[] s = {(int)(Math.random()*5+1),(int)(Math.random()*5+1)};
              square = s;
              int[] t = {(int)(Math.random()*5+1),(int)(Math.random()*5+1)};
              triangle = t;
            } else {break;}
          }
          data.add(board);
          data.add(circles);
          data.add(square);
          data.add(triangle);
        }
        break;
    }
  }
  public void check() {
    switch ((int)data.get(0)) {
      case 0: //complex wires
        if (true) {
        boolean[][] setupArray = (boolean[][])(data.get(1));
        for (int j = 0; j < 6; j++) {
          System.out.println("The next wire is: ");
          for (int i = 0; i < 4; i++) {
            if(setupArray[j][i]) {System.out.println(((String[])data.get(2))[i]);}
          }
          System.out.println("Do you cut this wire (Y/N)?");
          boolean ans = (myObj.nextLine().toLowerCase().charAt(0) == 'y');
          switch(((int[])data.get(3))[j]) {
            case 0:
              if (ans) {} else {Main.strike();}
              break;
            case 1:
              if (!ans) {} else {Main.strike();}
              break;
            case 2:
              if (!ans && Character.isLetter(bomb.serial.charAt(7))) {
              } else if (ans == (bomb.serial.charAt(7) % 2 == 0)) {
              } else {Main.strike();}
              break;
            case 3:
              boolean parPort = false;
              for (int i = 0; i < bomb.ports.length; i++) {
                if (bomb.ports[i].equals("Parallel")) {parPort = true;}
              }
              if (ans == parPort) {
              } else {Main.strike();}
              break;
            case 4:
              if (ans == (bomb.batteries > 1)) {
              } else {Main.strike();}
              break;
            default:
              throw new ArithmeticException("No case found for wire");
          }
        }
        }
        break;
      case 1:
        if (true) {
        String answer = (String)data.get(1);
        for (int i = 0; i < 5; i++){    
          System.out.println((String)(data.get(i+2)));
        }
        System.out.println("Please enter the correct password.");
        if (answer.equals(myObj.nextLine())) {
        } else {Main.strike();}
        }
        break;
      case 2:
        if (true) {
        String[] cc = (String[])(data.get(1));
        boolean[] solution = (boolean[])(data.get(2));
        for (int i = 0; i < solution.length; i++) {
          System.out.println("The next wire is " + cc[i] + ". Do you cut (Y/N).");
          if ((myObj.nextLine().toLowerCase().charAt(0) == 'y') == solution[i]) {
          } else {Main.strike();}
        }
        }
        break;
      case 3: // button
        if (true) {
          while (true) {
          System.out.println(((String)(data.get(1))) + " button saying " + ((String)(data.get(2))) + "\ndo you tap (Y/N)?");
          if ((myObj.nextLine().toLowerCase().charAt(0) == 'y') == (boolean)(data.get(3))) {
            if ((boolean)(data.get(3))) {break;}
          }
          System.out.println((String)data.get(4) + " colored strip. Spam enter/return to get the time and any number to release the button.");
          float endTime;
          while (true) {
            if (!(myObj.nextLine().isBlank())) {
              endTime = bomb.timeLeft();
              break;
            } else {
              bomb.printTime();
            }
          }
          char[] cAr = (endTime + "").toCharArray();
          boolean[] ffo = {false,false,false};
          for (int i = 0; i < cAr.length; i++) {
            switch ((int)(cAr[i] - 48)) {
              case 5:
                ffo[0] = true;
                break;
              case 4:
                ffo[1] = true;
                break;
              case 1:
                ffo[2] = true;
                break;
            }
          }
          if (data.get(4).equals("yellow")) {
            if (ffo[0]) {
              break;
            } else {Main.strike();}
          } else if (data.get(4).equals("blue")) {
            if (ffo[1]) {
              break;
            } else {Main.strike();}
          } else {
            if (ffo[2]) {
              break;
            } else {Main.strike();}
          }
        }}
        break;
      case 4:
        if (true) {
          String[] display = (String[])data.get(1);
          int[] answer = (int[])data.get(2);
          for (int i = 0; i < 4; i++) {
            System.out.println(display[i]);
          }
          System.out.println("Please enter your answer as numbers with an enter/return between each.");
          for (int i = 0; i < 4; i++) {
            if (!(myObj.nextInt()-1 == answer[i])) {
              Main.strike();
              i--;
            }
          }
        }
        break;
      case 5:
        if (true) {
          while (true) {
          String[] wires = (String[])data.get(1);
          System.out.println("Your wires are:");
          for (int i = 0; i < wires.length; i++) {
            System.out.println(wires[i]);
          }
          System.out.println("Which one do you cut? Answer as an number (with 1 being the first wire)");
          if ((int)data.get(2) == (myObj.nextInt()-1)) {
            break;
          } else {Main.strike();}
        }}
        break;
      case 6: //simon says
        if (true) {
          String[] colors = {"red","blue","green","yellow"};
          int[] flashes = (int[])data.get(2);
          String[][] tableAnswers = (String[][])data.get(1);
          String[] solution = new String[flashes.length];
          int i = 1;
          while (i <= flashes.length) {
            for (int j = 0; j < flashes.length;j++) {
              solution[j] = tableAnswers[(3-bomb.getStrikes())][flashes[j]];
            }
            for (int j = 0; j < i; j++) {
              System.out.println(colors[flashes[j]] + " flash");
            }
            System.out.println("Which colors will you press? Just answer the first letter (for example, type y for yellow)");
            boolean temp = false;
            for (int j = 0; j < i; j++) {
              String ans = "";
              switch (myObj.nextLine().toLowerCase().charAt(0)) {
                case 'r':
                  ans = "red";
                  break;
                case 'b':
                  ans = "blue";
                  break;
                case 'g':
                  ans = "green";
                  break;
                case 'y':
                  ans = "yellow";
                  break;
              }
              if (!(ans.equals(solution[j].toLowerCase()))) {
                Main.strike();
                break;
              } else if (i == (flashes.length+1)) {break;} else {temp = true;}
            }
            if (temp) {i++;}
          }
        }
        break;
      case 7: //whos on first
        if (true) {
          String[] displays = (String[])data.get(1);
          String[][] buttons = (String[][])data.get(2);
          int[] answers = (int[])data.get(3);
          for (int i = 0; i < 3; i += 0) {
            System.out.println("The word on the display is " + displays[i] + "\nand the buttons are\n" + buttons[i][0] + "  " + buttons[i][1]+ "\n" + buttons[i][2] + "  " + buttons[i][3]+ "\n" + buttons[i][4] + "  " + buttons[i][5]+ "\n\nWhat button will you push? Answer as a number, with 1 being the top left and 6 being the bottom right.");
            if ((myObj.nextInt()-1) == answers[i]) {i++;} else {Main.strike();}
          }
        }
        break;
      case 8: //memory
        if (true) {
          int[] displays = (int[])data.get(1);
          int[][] buttons = (int[][])data.get(2);
          int[] answers = (int[])data.get(3);
          for (int i = 0; i < 5; i +=0) {
            System.out.print("\nThe display reads " + displays[i] + "\nand the buttons are ");
            for (int j = 0;j<4;j++){
              System.out.print(buttons[i][j]);
            }
            System.out.println("\nWhat button will you push? Answer as a number, with 1 being the number furthest left and 4 being the number furthest right.");
            if (myObj.nextInt() == answers[i]) {i++;} else {Main.strike();}
          }
        }
        break;
      case 9: //morse code
        if (true) {
          double ans = (double)data.get(2);
          int[] display = (int[])(data.get(3));
          int totalTime = (int)data.get(4);
          while (true) {
          System.out.println("The sequence will begin at a random spot. Press enter/return once you're ready.");
          myObj.nextLine();
          final long startTimeCenti = (System.currentTimeMillis()/10);
          int i = (int)(Math.random()*(display.length-1));
          long allTime = startTimeCenti;
          while ((System.currentTimeMillis()/10) < (startTimeCenti+totalTime)) {
            if (System.currentTimeMillis()/10 > (allTime + display[i])) {
              if (!(i==display.length-1)) {
                allTime += display[i];
                i++;
              } else {
                final long temp2 = System.currentTimeMillis()/10;
                allTime = temp2;
                i = 0;
              }
            } else if (i%2==1) {
              System.out.println("*");
            } else {System.out.println();}
          }
          System.out.println("Guess the frequency or type 0 to see the sequence again");
          double temp = myObj.nextDouble();
          if (temp == 0) {myObj.nextLine();} else if(temp == ans) {
            break;
          } else {Main.strike();}
        }
        }
        break;
      case 10: //mazes
        if (true) {
          boolean[][][] board = (boolean[][][])data.get(1);
          int[][] circles = (int[][])data.get(2);
          int[] square = (int[])data.get(3);
          int[] triangle = (int[])data.get(4);
          System.out.println("The circles are marked with O, the triangle is marked with T, and the square is maked with S. (If a circle is missing, it is most likely behind either the square or the triangle). \nUse wasd to move.");
          while (true) {
            for (int i = 0; i <36; i++) {
              if (i%6==0) {System.out.println();}
              if(i==(square[0]-1+(6-square[1])*6)) {System.out.print("S");}
              else if(i==(triangle[0]-1+(6-triangle[1])*6)) {System.out.print("T");}
              else if(i==(circles[0][0]-1+(6-circles[0][1])*6)) {System.out.print("O");}
              else if(i==(circles[1][0]-1+(6-circles[1][1])*6)) {System.out.print("O");}
              else {System.out.print(".");}
            }
            System.out.println();
            switch (myObj.nextLine().toLowerCase().charAt(0)) {
              case 'w':
                if(board[6-square[1]][square[0]-1][0]){square[1]++;} else {Main.strike();}
                break;
              case 's':
                if (board[6-square[1]][square[0]-1][1]){square[1]--;} else {Main.strike();}
                break;
              case 'a':
                if (board[6-square[1]][square[0]-1][2]){square[0]--;} else {Main.strike();}
                break;
              case 'd':
                if (board[6-square[1]][square[0]-1][3]){square[0]++;} else {Main.strike();}
                break;
            }
          if (square[0] == triangle[0] && square[1] == triangle[1]) {break;}
        }
      }
    }
    clear();
  }
  public void clear() {
    cleared = true;
  }
  public boolean isClear() {
    return cleared;
  }
  public String toString() {
    String[] moduleNames = {"Complex Wires","Password","Wire Sequences","Button","Keypad","Wires","Simon Says","Who's on first","Memory","Morse code","Mazes"};
    return (moduleNames[(int)data.get(0)] + "'s been cleared: " + (cleared?"Yes":"No"));
  }
}