package sab;

import java.io.IOException;




public abstract class Shape {
 
    private int x;
    private int y;
 
    public abstract void draw();
 
    public void setAnchor(int x, int y) {
        this.x = x;
        this.x = y;
    }
    public static void main(String[] args) {
		
	}
}

















//
//public class TestField {
// 
//    int x;
//    int y;
// 
//    public void doStuff(int x, int y) {
//        this.x = x;
//        y = this.y;
//    }
// 
//    public void display() {
//        System.out.print(x + " " + y + " : ");
//    }
// 
//    public static void main(String[] args) {
//        TestField m1 = new TestField();
//        m1.x = 100;
//        m1.y = 200;
//        m1.display();
//        
//        
//        
//        TestField m2 = new TestField();
//        m2.doStuff(m1.x, m1.y);
// 
//        m2.display();
//    }
//}
//public class ColorTest {
//public static void main(String[] args) {
//    StringBuilder message = new StringBuilder("hello java!");
//    int pos = 0;
//    try {
//        for (pos = 0; pos < 12; pos++) {
//            switch (message.charAt(pos)) {
//                case 'a':
//                case 'e':
//                case 'o':
//                    String uc = Character.toString(message.charAt(pos)).toUpperCase();
//                    message.replace(pos, pos + 1, uc);
//             
//            }
//        }
//    } catch (Exception e) {
//        System.out.println("Out of limits");
//    }
//    System.out.println(message);
//}
//}
//
//public class ColorTest {
// 
//    public static void main(String[] args) {
//        String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
//        int count = 0;
//        for (String c : colors) {
//            if (count >= 4) {
//                break;
//            } else {
//                continue;
//            }
//            if (c.length() >= 4) {
//                colors[count] = c.substring(0, 3);
//            }
//            count++;
//        }
//        System.out.println(colors[count]);
//    }
//}
//public class Series {
	// public static void main(String[] args) {
		
//	
//	String [] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
//	int count=0;
//	for (String c:colors) {
//		if (c.length() != 4) {
//		continue;
//		}
//		System.out.print(c+", ");
//		}
//    }}
//        int arr[] = new int[4];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 4;
//        arr[3] = 5;
//        int sum = 0;
//        try {
//            for (int pos = 0; pos <= 4; pos++) {
//                sum = sum + arr[pos];
//        
//            }
//        } catch ( RuntimeException e) {
//            System.out.println("Invalid index");
//        }
//        System.out.println(sum);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//


//
//public class Series {
//public static void main(String [] args) {
//int arr [] = {1, 2, 3};
//for (int var : arr) {
//int i = 1;
//while (i <= var);
//System.out.println(i++);
//}
//}
//}



