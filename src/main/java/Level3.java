import java.util.*;

public class Level3 {

    private static String data = "30,69 L,L,D,D,R,R,R,R,U,U,U,R,R,D,D,R,R,R,U,U,R,R,D,D,R,R,U,R,D,R,R,U,U,R,R,D,D,R,R,R,U,U,R,R,D,D,R,R,U,U,R,R,R,R,R,U,U,U,L,L,L,D,L,U,U,U,R,U,R,U,U,R,R,R,D,D,L,D,R,R,D,D,D,D,D,D,D,L,L,L,L,L,D,R,R,R,D,R,D,D,D,D,D,D,D,D,D,D,D,D,D,L,D,D,D,D,R,D,D,D,L,D,R,D,L,D,R,R,D,L,L,L,L,U,L,L,L,U,L,D,L,L,L,U,L,D,L,L,U,U,L,U,R,R,R,R,R,R,R,R,R,R,R,D,L,L,L,L,L,L,L,L,L,D\n" +
            "20,45 R,D,L,L,L,L,L,U,L,D,L,U,U,U,L,U,U,U,U,U,L,U,R,U,L,L,U,L,L,D,L,U,L,L,D,D,L,D,L,U,U,U,L,L,D,D,D,D,D,D,D,D,D,R,D,R,D,L,D,R,D,R,D,D,D,L,D,R,D,D,L,L,D,D,D,L,D,R,R,D,D,D,D,D,R,D,R,U,U,U,R,U,L,U,U,R,U,U,R,R,U,R,R,R,R,R,D,R,D,D,D,R,D,L,D,D,R,R,R,R,D,R,U,R,D,D,R,R,R,U,U,U,R,R,R,U,R,R,R,D,R,U,R,D,R,R,U,R,R,R,R,D,R,R,R,R,R,R,R,U,R,R,D,R,R,R,U,R,D,R,U,R,D,R,U,R,D\n" +
            "20,60 U,U,L,U,R,R,U,R,D,D,R,D,L,D,R,R,R,R,U,R,R,R,R,R,R,R,D\n" +
            "85,101 L,L,U,U,R,R,R,R,D,R,U,R,R,D,R,R,U,R,R,R,D,R,U,R,R,R,D,R,U,R,R,R,R,R,R,R,U,R,R,U,U,L,U,L,U,U,L,U,L,D,L,D,L,L,D,L,U,L,D,L,L,U,L,L,L,U,U,R,R,R,U,R,D,R,R,U,U,U,R,U,R,U,L,U,L,L,L,L,L,D,D,D,R,R,U,R,D,D,L,L,L,L,L,L,L,D,D,L,D,R,D,L,L,D,L,U,U,U,U,U,U,U,U,U,R,R,D,R,U,U,U,L,U,U,R,R,R,R,R,R,R,U,R,U,U,R,R,R,D,D,D,R,R,U,U,U,U,U,U,U,U,U,L,L,U,L,D,D,D,D,R,D,L,L,L,L,L,D,L,D,L,U,L,D,D,L,L,U,L,D,L,L,U,L,D,D,L,D,R,R,D,D,L,L,D,D,L,L,U,L,U,R,U,L,L,U,L,U,L,D,D,L,D,D,D,L,L,U,L,U,R,U,L,L,U,U,L,L,L,L,L,D,L,L,D,L,L,U,U,U,U,U,L,U,R,R,R,R,U,U,L,U,R,U,L,L,U,L,L,U,L,L,U,U,R,R,R,U,U,R,R,D,D,R,D,D,R,U,U,U,R,U,U,U,U,R,R,R,D,R,D,R,D,R,D,R,U,U,U,U,L,U,L,U,U,R,R,U,U,U,U,R,R,R,U,U,L,L,L,U,U,R,U,L,U,L,L,U,L,L,L,D,D,R,D,L,D,D,R,R,D,D,L,D,D,L,D,D,D,R,U,R,D,D,D,R,D,R,D\n" +
            "123,57 R,R,U,U,U,U,U,U,U,L,U,R,U,U,U,U,U,U,U,U,U,L,L,U,U,R,R,U,U,U,L,L,U,L,L,U,L,L,D,L,U,U,L,L,D,L,U,U,L,L,L,D,L,D,L,L,U,L,U,R,U,R,R,R,R,R,R,R,R,R,R,R,D,R,R,R,D,R,R,U,U,R,R,X\n" +
            "63,109 D,D,D,D,D,D,D,D,D,R,D,L,D,R,D,R,R,U,U,U,U,R,R,U,U,R,R,D,R,U,R,R,D,D,R,D,L,D,D,L,D,R,D,R,R,D,R,R,U,U,R,R,U,R,U,R,D,D,R,R,D,D,D,D,R,R,U,U,U,U,U,U,L,U,U,L,U,R,U,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,D,R,R,U,R,U,U,L,U,U,R,R,U,U,L,U,R,U,U,U,L,U,U,L,L,L,U,U,U,U,R,R,D,D,R,R,U,U,U,U,L,U,U,U,L,L,U,U,U,L,L,D,L,L,L,L,L,L,U,L,U,U,U,R,U,L,U,R,R,R,D,R,R,R,U,R,R,R,D,D,D,L,L,L,L,L,D,L,U,L,D,L,U\n" +
            "58,20 U,L,U,L,U,U,L,U,U,U,R,R,D,R,R,R,D,D,D,L,D,R,D,D,R,D,L,D,R,R,D,D,R,D,D,D,D,R,D,L,D,R,D,L,D,D,D,R,R,D,D,D,R,R,D,D,L,D,D,D,L,L,L,U,U,R,U,L,U,U,U,L,D,D,D,D,D,D,D,R,R,R,R,R,R,U,R,U,L,U,R,R,R,D,D,R,R,R,U,R,U,L,L,U,U,R,U,R,R,R,U,R,D,R,R,U,R,U,U,L,L,L,L,U,L,L,U,L,L,U,L,L,D,L,L,U,L,D,D,D,R,D,L,L,U,U,L,U,U,U,R,R,R,R,R,R,R,R,R,R,R,D,R,R,R,R,R,R,D,R,D,D,R,R,R,U,U,U,U,L,L,U,U,L,L,U,U,U,R,R,D,R,U,R,R,R,R,D,R,D,R,D,D,D,L,L,L,D,D,R,D,L,D,R,R,R,U,U,R,R,D,D,R,R,R,U,R,R,R,R,U,U,L,L,L,L,L,U,L,L,U,U,U,U,U,L,U,L,D,L,U,L,L,L,L,L,L,L,L,L,D,D,D,D,D,R,D,L,L,L,L,L,U,X\n" +
            "61,126 U,U,R,R,D,R,U,U,R,R,D,D,R,R,R,R,U,R,R,R,D,R,R,R,R,R,R,U,U,L,U,R,R,R,R,D,D,D,D,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,R,U,R,R,R,R,U,U,R,R,U,U,U,U,L,L,U,L,D,L,D,L,U,U,U,U,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,D,D\n" +
            "42,7 U,L,U,R,U,L,L,U,U,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,D,L,U,L,L,L,D,L,U,L,L,D,D,L,L,L,L,L,D,L,D,L,D,R,R,D,R,R,D,R,U,R,U,R,D,D,R,R,U,R,U,R,R,U,R,U,R,D,D,D,D,L,L,D,L,U,L,D,L,L,L,L,L,L,L,L,L,L,U,L,L,L,U,L,L,L,D,L,U,U,U,L,U,U,U,U,S\n" +
            "87,3 U,R,D,R,U,R,R,D,D,D,D,R,D,R,D,D,L,L,L,D,L,D,L,U,U,L,U,R,U,U,L,U,L,L,L,U,U,R,U,L,L,L,L,L,L,L,D,L,D,D,R,D,L,D,R,D,D,R,R,U,R,R,U,U,L,U,L,D,D,R\n" +
            "110,49 L,U,U,L,L,D,D,L,D,L,L,U,L,U,L,U,R,U,R,R,D,R,U,U,R,R,R,R,R,D,D,R,D,D,R,R,D,R,R,U,U,U,L,U,L,D,L,U,U,R,R,R,R,D,D,D,D,D,D,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,U,L,L,U,L,D,L,U,U,U,L,U,R,R,R,D,R,U,U,R,R,R,R,R,U,X\n" +
            "91,68 U,L,D,L,L,U,U,L,L,L,D,D,L,L,U,U,U,U,R,U,U,R,U,U,U,L,U,R,U,U,U,U,U,L,L,U,U,U,L,U,R,U,U,U,L,L,D,L,D,D,L,L,U,L,L,U,L,U,R,R,R,U,R,D,D,L,L\n" +
            "13,89 R,D,D,R,R,D,D,L,D,D,D,L,L,U,U,U,L,U,U,U,U,U,U,R,R,R,R,D,D,R,R,R,D,D,D,L,D,D,R,D,R,R,U,R,R,U,U,R,U,U,L,U,U,L,L,D,D,D,D,R,U,U,U\n" +
            "121,116 D,D,L,U,U\n" +
            "31,26 L,D,D,D,R,R,R,R,R,U,R,R,D,R,R,U,R,D,R,U,U,R,R,R,D,R,R,R,R,R,U,U,U,U,U,U,R,R,D,D,D,D,D,D,D,D,L,L,L,L,L,L,L,L,U,L,D,L,L,L,L,L,L,L,L,L,D,L,D,D,L,D,R,D,L,L,L,D,D,D,L,D,L,U,L,U,L,U,R,R,U,U,U,R,R,U,U,R,R,D,L,D,D,L,L,D,D,D,L\n" +
            "26,84 R,R,R,U,U,L,L,U,L,D,L,U,U,U,R,R,R,U,U,U,U,U,R,U,R,D,D,R,D,R,U,U,U,U,R,U,U,U\n" +
            "42,111 D,D,L,L,L,D,D,L,D,L,U,L,U,U,L,L,D,D,D,D,D,R,R,R,R,R,R,U,R,R,D,D,D,D,D,L,L,U,U,L,L,L,L,L,D,D,L,D,L,D,R,R,D,R,R,R,R,U,R,D,R,U,R,R,D,R,R,U,R,D,R,U,R,R,R,R,U,U,R,R,R,R,D,D,R,R,R,U,U,L,U,R,R,R,R,D,R,R,R,R,R,R,R,R,R,U,U,L,U,R,U,R,U,L,L,U\n" +
            "74,104 R,U,U,U,U,U,R,R,R,D,D,R,D,D,D,L,L,U,U,U,L,D,D,D,D,R,R,R,R,U,U,U,U,U,U,U,L,L,L,L,L,L,L,D,D,L,L,L,U,L,L,D,L,U,L,D,D,D,L,D,D,L,L,D,D,D,D,L,D,D,D,D,D,D,D,D,D,D,D,D,D,R\n" +
            "85,49 D,D,D,L,U,U,U,U,R,R,U,R,R,D,D,D,R,R,R,R,U,R,U,L,L,L,U,U,R,R,R,R,R,D,D,D,D,R,D,L,L,L,L,L,L,L,L,L,U,U,U\n" +
            "104,62 D,D,L,L,D,D,L,L,D,L,D,R,R,R,R,R,R,U,U,L,L,D,L,L\n" +
            "88,21 U,R,U,R,D,R,R,R,U,U,L,U,U,L,L,U,L,L,D,D,L,L,D,L,D,D,R,D,L,L,L,U,U,U,U,U,R,U,L,U,U,R,U,R,D,R,D,D,R,U,U,R,R,R,R,R,R,R,R,U,U,R,U,L,L,L,D,L,L,L\n" +
            "20,123 L,L,L,U,U,L,U,R,U,U,R,U,L,L,L,D,L,D,L,U,L,U,L,L,L,L,D,L,D,L,L,U,L,L,U,L,U,U,R,R,R,D,R,U,U,U,L,U,L,L,U,L,D,D,L,L,X\n" +
            "37,49 D,L,L,U,U,L,L,D,L,L,D,D,L,L,U,U,U,U,U,L,U,U,R,R,U,U,U,L,L,D,L,U,L,L,U,L,L,D,L,U,L,L,U,U,R,R,R,U,U,L,L,L,L,L,D,L,L,U,L,D,D,D,R,R,R,D,D,L,L,D,D,R,R,R,R,R,R,R,D,R,D,D,L,L,D,L,L,L,L,L,L,L,L,L,U,L,L,L,U,L,U,L,U,R,R,R,U,U,U,L,L,D,L,L,L,L,U,L,D,D,D,R,R,D,D,D,R,D,L,L,U,U\n" +
            "43,19 U,U,L,L,L,L,D,D,R,D,L,D,R,R,R,R,R,R,R,R,U,R,U,R,R,D,R,U,U,U,L,U,R,U,U,L,U,L,D,L,L,D,D,L,L,U,U,L,U,U,R,R,R,U,R,R,U,U,R,R,U,U,U,L,L,L,L,U,L,L,D,L,U,U,U,R,U,R,D,R,U,R,D,R,D,R,U,U,R,R,D,D,D,D,D,D,D,D,D,L,D,R,D,D,D,D,D,D,D,D,D,D,D,D,D,D,D,D,D,D\n" +
            "78,41 D,L,U,U,R,U,L,L,L,U,R,R,R,R,R,R,D,D,L,D,D,R,R,D,L,L,L,L,L,L,L,U\n" +
            "71,48 R,R,U,U,L,L,L,L,D,D,D,L,L,L,L,U,L,U,R,U,R,R,D,L,D,R,R,U,U,U,R,R,R,R,R,R,R,R,R\n" +
            "19,83 U,R,U,U,U,L,L,L,D,L,D,R,D,D,D,L,L,L,L,L,U,L,U,L,U,U,U,R,R,D,R,R,U,U,R,R,R,R,R,R,R,R,D,R,D,D,D,D,L,D,L,D,L,L,U,R,U,R,U,U,U,U\n" +
            "33,112 L,D,L,L,U,L,L,L,L,L,L,D,L,L,U,L,D,D,R,R,R,R,R,R,R,R,R,R,R,R,D,D,D,D,D,D,D,D,L,L,D,D,L,D,R,R,R,R,D,R,R,R,R,R,R,R,R,U\n" +
            "64,8 R,U,R,R,R,U,R,R,D,R,U,U,R,R,D,D,D,R,D,L,L,L,L,L,L,L,D,L,L,L,L,L,L,U,U,U,L,L,L,L,D,L,D,L,D,R,R,D,R,R,D,R,R,R,D,R,D,R,D,L,L,D,D,D,R,R,U,R,D,D,D,L,D,D,D,D,D,D,D,R,D,D,D,D,D,D,L,U\n" +
            "47,18 L,L,D,L,U,U,U,L,L,U,U,L,L,D,L,U,U,U,R,R,U,U,L,U,R,R,R,D,R,R,U,U,R,R,D,D,R,U,U,R,U,R,D\n" +
            "27,124 U,L,U,R,R,R,D,D,D,D,L,L,L,L,U,L,U,U,L,L,D,D,L,D,R,D,X\n" +
            "125,86 D,D,L,L,U,L,L,D,D,D,L,D,D,R,D,D,D,D,R,D,D,D,D,D,D,L,D,D,R,D,D,D,D,D,D,D,D,L,D,D,D,R,D,D,D,D,D,D,D,D,D,L,D,L,U\n" +
            "103,32 R,D,R,D,R,U,U,U,R,U,L,L,L,L,L,L,L,L,L,L\n" +
            "103,56 U,R,U,L,U,R,R,R,D,D,R,R,R,D,R,U,R,U,R,D,D,D,D,R,R,D,R,D,D,D,L,L,U,L,U,L,L,U,L,L,L,D,L,L,L,L,U,U,R,R,U,R,R,R,R,R,D,L,L,L,L,D,L,L\n" +
            "41,48 D,L,D,R,D,L,L,L,U,U,U,L,U,U,L,U,L,L,D,L,U,L,D,L,D,D,R\n" +
            "89,27 D,L,U,L,D,D,L,U,U,L,L,U\n" +
            "100,20 R,U,R,U,R,U,R,U,R,U,F\n" +
            "121,47 L,D,D,R,R,D,D,D,L,L,D,D,L,L,L,L,D,D,L,L,U,U,L,U,R,R,R,R,R,R,U,U,R,U,L,U,U,U,U,U,R,U,U,R,U,L,U,R,U,U,L,U,R,U,U,L,U,R,R,D,R,D,R,U\n" +
            "2,53 U,U,U,U,U,U,U,U,L,U,U,U,U,U,U,U,U,U,U,U,R,R,R,R,D,D\n" +
            "34,92 L,L,D,L,D,R,R,R,R,R,R,D,R,R,U,U,U,R,R,R,U,U,L,L,U,L,U,R,U,R,R,U,U,U,U,L,U,L,L,L,L,L,L,L,L,D,L,U,U,U,U,L,L,U,U,R,R,R,U,U,U,U\n" +
            "121,59 U,L,L,D,D,D,D,R,R,D,D,L,L,L,D,D,D,L,L,D,L,U,L,L,U,L,D,D,L,L,L,U,U,R,U,U,R,U,L,U,L,U,R,R,D,R,D,D,R,R,R,R,D,L,L,L,L,L,D,D,L\n" +
            "117,20 D,L,L,L,U,L,L,L,D,L,L,L,U,U,R,U,L,L,L,D,D,D,L,L,U,U,L,D,D,L,L,L,L,U,U,L,U,R,U,L,L,L,L,D,L,U,U,U,R,R,R,R,R,R,U,R,U,U,R,R,R,R,F\n" +
            "102,15 D,L,D,L,U,L,L,L,L,L\n" +
            "48,51 R,U,U,R,U,R,U,L,L,U,L,D,L,L,L,D,D,L,D,L,U,U,U,U,L,L,L,L,U,U,U,U,R,R,U,R,R,D,R,U,R,R,D,R,U,R,D,R,U,R,R,D,D,R,U,U,U,L,L,L,L,L,L,L,L,L,L,L,L,L,L,L,D,L,D,L,U,L,D,L,D,L,U,U,U,U,U,L,U,R,U,L,L,D,D,D,D,L,L,L,L,U,L,U,L,U,U,U,R,R,U,L,L,L,L,L,L,D,L,L,L,L,L,L,L,L,U,L,L,L,L,L,L\n" +
            "9,2 D,R,U,R,R,R,R,R,R,D,L,L,L,L,L,D,L,L,L,D,D,L,L,L,U,U,U,R,U,L,L,L,L,S\n" +
            "33,86 D,L,U,U,R,R,R,D,D,R,R,U,R,U,L,U,R,R,R,D,D,R,U,U\n" +
            "6,111 U,U,L,L,L,L,D,L,U,U,L,X\n" +
            "64,12 D,R,U,U,L,L,L,L,L,U,L,U,L,D\n" +
            "8,39 L,U,R,R,R,U,U\n" +
            "114,95 L,D,D,L,L,D,D,D,L,L,L,L,L,L,L,L,L,L,D,L,L,L,U,L,D,L,L,L,U,L,D,L,L,L,L,U\n" +
            "115,96 U,R,D,R,D,R,U,U,R,D,D,D,R,D,D\n" +
            "66,3 U,R,D,R,R,R,R,R,R,U,R,R,D,D,D,D,D,D,D,R,R,U\n" +
            "17,97 U,R,D,D,D,D,D,D,D,D,L,L,U,U,U,L,U,L,U,L,U,R,R,U,L,L,L,U,U,U\n" +
            "74,57 U,U,U,U,U,U,L,L,U,L,D,L,L,L,L,L,L,L,L,U,U,U,U,U,R,U,L,L,D,D,D,D,D,D,D,R,R,R,R,R,R,R,R,R,R,R,D,D,D,D,D,D,R,D,D,D,D,D,R,R\n" +
            "2,83 D,R,U,U,U,L,U,U,R,R,R,R,D,D,D,R,D,L,D,L,D,R,R,R,R,U,R,U,L,U,U,U,U,L,U,R,R,R,R,R,D\n" +
            "69,103 R,U,R,R,D,D,R,D,L,L,L,L,L,L,U,U,U,U,R,R,U\n" +
            "56,6 U,R,U,L,L,U,U,R,R,R,R,D,D,D,R,R,R,U,U,U,R,R,D,D,D,R,R,R,R,R,R,U,R,R,R,R,D,D,D\n" +
            "64,65 L,D,D,R,R,R,U,U,R,R,U,R,R,D,R,U,R,D,D,D,L,D\n" +
            "11,57 D,D,D,L,D,D,D,D,L,L,U,U,U,U,U,U,R,U,L\n" +
            "9,112 L,U,U,R,R,U,R,D,D,D,D,R,R,U,R,D,R,U,U,U,L,L,U,U,R,R,R,R,D,D,R,D,L,D,D,R,R,D,L,L,L,L,L,L,L,L,L,L,L,L,U,U,L\n" +
            "15,123 L,L,L,U,L,U,L,L,D,D,L,L,U,L,D,L,U,U,L,L,L,D,D,R,D,L,L,L,X\n" +
            "34,51 L,L,U,R,R,U\n" +
            "28,91 L,U,U,R,R,R,D,R,R,U,R,D,R,R,U,R,D,R,U,U,R,U,R,U,U\n" +
            "89,65 R,R,U,U,L,L,L,L,D,L,U,L,D,D,L,D,D\n" +
            "75,68 R,R,U,L,L,U,U,L,D,D,D,D,L\n" +
            "104,13 R,F\n" +
            "53,83 L,U,L,L,D,L,L,L,U,L,D,L,U,L,D,L,U,L,U,L,L,L,L,L,L,L,L,L,U,U,U,L,L\n" +
            "76,1 D,R,U,R,R,R,R,R,R,R,R,R,D,D,D,R,R,R,D,D,D,R,D,R,U\n" +
            "14,104 L,D,R,D,L,D,R,R,R,R,R,U,U,L,L\n" +
            "98,63 R,D,R,U,R,R,U,R,U,R,R,D,D,D,D,L,L\n" +
            "16,55 R,D,D,D,D,D,R,R,U\n" +
            "87,79 L,D,L,U,U,L,U,R,R,R,R,R,D,R,R,R,R,R,D\n" +
            "111,17 U,U,F\n" +
            "74,84 U,R,D,D,D,D,D,R,R,U,U,U,U\n" +
            "38,122 L,D,R,R,U,U,L,L,L,D,D,D,R,R\n" +
            "104,90 R,U,U,U,U,L,L,U,L,L,L,L,L,L,L,L,D,D,D,L,L,L,D,D,D,L,D,D\n" +
            "122,17 U,U,F\n" +
            "103,92 U,U,U,R,U,U\n" +
            "36,25 L,L,L,D,D,L,D,R,R,U,R,R,R,R,U,U,R,R,R,R,R,R,R,R,D,R,U,U,U,U,R,U,R,R,R\n" +
            "99,9 R,U,R,R,U,U,R,R,R,F\n" +
            "1,69 R,D,D,D,D,D,D,D,D,D,R,R,R,R,R,D,D,D,R,D,D,D,L\n" +
            "83,110 U,U,U,R,R,D,D,D,R,R,R,D,R,R,R,U,R,R,R,R,R,R,D,R,R,R,U,R,R,D,R,R,U,R,R,D,R,U,R,D,R,R,R,R,R,U,R,D,R,R,U,R,U,U,U,R,U,U,L,U,R,R,D,D,D,D,D,D,R\n" +
            "120,66 D,D,R,R,U,U,R,R,R,D,D,L,D,R,R,R,X\n" +
            "126,61 L,U,U,L,L,D,D,D,D,D,R,R,U,R,D,D,D,D,D,R,X\n" +
            "114,34 L,L,L,L,L,L,L,U,U\n" +
            "65,83 L,L,U,U,R,U,R,U,L,U,L,U,U,R,R,U,R,R,U,R,D,R,U\n" +
            "123,18 L,D,R,D,R,R,D,D,L,L,L,L,U,L,U,L,U,U,U,U,U,F\n" +
            "55,83 U,R,R,D,R,U,U,U,U,U,U,U,U,U,U\n" +
            "1,54 R,D,D,L,D,D,D,R,D,D,D,D,D,D,D,D,D,L,L,X\n" +
            "56,25 R,R,U,U,U,L,L,L,D,L,U,U,U,R,R,U,L,U,U,L,U,U,U,U,U,R,U,R,D,R,R,D,R,R,R,D,D,D,D,D,D,R,D,D,R,D,D\n" +
            "98,7 U,U,R,U,R,D,D,D,R,U,U,U,R,R,R,R,F\n" +
            "110,95 R,U,L,L,U,U,L,L,U,L,L,L,D\n" +
            "84,103 D,L,D,R,R,D,R,U,U,U,U,U,U,L,L\n" +
            "44,1 D,L,L,L,D,R,R,D,D,D,D,D,L,L,L,L,U,U,U,U,U,L,L,L,L,L,L,L,L,L,L,L,L,L,L,D,L,L,L,L,L,D,L,L,D,L,L,L,L,L,D,R,R\n" +
            "1,2 R,S\n" +
            "48,122 L,L,L,L,D,L,U,U,U,U,U,U,U,L,U,L,L,D,L,D,L,L,L,U,L,U,U\n" +
            "93,63 R,D,R,D,R,D,R,U,U,U,U,L,L,L,L,L,D,D,D,D,R,D,R,D,L,L,D,L,L,L,L,L,U,L,U,R\n" +
            "114,18 L,U,U,U,F\n" +
            "63,102 U,U,R,U,L,U,R,R,R,R,R,R,R,R,D,R,U\n" +
            "78,53 D,D,D,D,D,D,L,D,R,R,U,U,U,U,R,R,R\n" +
            "118,56 R,R,R,R,U,R,U,L,L,U,R,R,U,U,U,U,U,U,U,U,L,U,R,U,U,U,R,D,D,D,D,D,D,D\n" +
            "71,38 U,U,U,U,R,R,D,R,R,U,R,D,R,R,R,D\n" +
            "97,12 R,U,R,D,D,R,U,U,R,R,U,R,R,R,F\n" +
            "104,15\n" +
            "59,47 U,L,D,L,U,L,L,L,D,D,R,D,L,L,D,D,L,L,U,U,R,U,U,U,L,L,U,L,L,L,D,L,L,L,D,D\n" +
            "53,126 U,U,L,U,R,R,D,D,R,R,R,R,R,U,U,R,R,R,R\n" +
            "117,18 U,U,U,F\n" +
            "21,122 D,D,L,L,L,L,L,U,U,L,L,U,L,L,U,L,U,L,L,D,L,L,D,L,U,L,L,L,L,U,U,L,U,U,U,U,R,R,R,U,L\n" +
            "29,25 L,D,D,D,D,D,D,D,L,U,U,U,U,U,U,U,U,R,R,R,D,R,R,D\n" +
            "25,95 R,U,R,D,R,U,R,U,U,L,L,L,U,U,U,U,L,L,D";

    private static final boolean breadthFirst = false;

    private ArrayList<Coordinates> starts = new ArrayList<>();

    private ArrayList<Coordinates> ends = new ArrayList<>();

    private static class Coordinates {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Coordinates add(Coordinates coordinates) {
            return add(coordinates.x, coordinates.y);
        }

        public Coordinates add(int x, int y) {
            return new Coordinates(this.x + x, this.y + y);
        }

        @Override
        public int hashCode() {
            return x + y;
        }

        @Override
        public boolean equals(Object other) {
            if (this == (other)) return true;
            if (!(other instanceof Coordinates)) return false;
            Coordinates otherC = (Coordinates) other;
            return this.getX() == otherC.getX() && this.getY() == otherC.getY();
        }

        public boolean equals(Coordinates other) {
            return this.getX() == other.getX() && this.getY() == other.getY();
        }

        public String toString() {
            return this.getX() + " " + this.getY();
        }
    }

    public static class CoordinatesPathPair {
        private Coordinates coordinates;
        private Character[] path;

        public CoordinatesPathPair(Coordinates coordinates, Character[] path) {
            this.coordinates = coordinates;
            this.path = path;
        }
    }

    //boolean order: L R U D

    private HashMap<Coordinates, Boolean[]> nodes = new HashMap<>(6000);

    private ArrayList<Coordinates> visited = new ArrayList<>(6000);

    public static void main(String[] args) {
        new Level3().solve();
    }

    public void solve() {
        long ts = System.currentTimeMillis();
        for (String s : data.split("\n")) {
            addNodes(s);
        }

        if (breadthFirst) {
            Queue<CoordinatesPathPair> queue = new ArrayDeque<>();
            for (Coordinates start : starts) {
                queue.add(new CoordinatesPathPair(start, new Character[0]));
            }
            while (!queue.isEmpty()) {
                for (CoordinatesPathPair pair : step(queue.remove())) {
                    if (pair == null) continue;
                    queue.add(pair);
                }
            }
        } else {
            Stack<CoordinatesPathPair> stack = new Stack<>();
            for (Coordinates start : starts) {
                stack.add(new CoordinatesPathPair(start, new Character[0]));
            }
            while (!stack.isEmpty()) {
                for (CoordinatesPathPair pair : step(stack.pop())) {
                    if (pair == null) continue;
                    stack.add(pair);
                }
            }
        }
        System.out.println("Solved in " + (System.currentTimeMillis() - ts) + "ms");
    }

    private final static Coordinates[] INT_TO_COORDINATES_MAP = {
            new Coordinates(-1, 0),
            new Coordinates(1, 0),
            new Coordinates(0, -1),
            new Coordinates(0, 1)
    };
    private static final Character[] INT_TO_CHARACTER_MAP = {
            'L', 'R', 'U', 'D'
    };

    /**
     * @return sparse array of possible next moves
     */
    private CoordinatesPathPair[] step(CoordinatesPathPair coordsPath) {
        for (Coordinates end : ends) {
            if (coordsPath.coordinates.equals(end)) {
                System.out.println("Path found: ");
                for (Character character : coordsPath.path) {
                    System.out.print(character);
                }
                System.out.println();
            }
        }
        Boolean[] dirs = nodes.get(coordsPath.coordinates);
        CoordinatesPathPair[] toReturn = new CoordinatesPathPair[4];

        if (visited.contains(coordsPath.coordinates)) {
            return toReturn;
        }
        visited.add(coordsPath.coordinates);

        //Possible if there was a wall
        if (dirs == null) {
            return toReturn;
        }

        for (int i = 0, dirsLength = dirs.length; i < dirsLength; i++) {
            Boolean bool = dirs[i];
            if (!bool) continue;
            Character[] nPath = Arrays.copyOf(coordsPath.path, coordsPath.path.length + 1);
            nPath[coordsPath.path.length] = INT_TO_CHARACTER_MAP[i];
            toReturn[i] = new CoordinatesPathPair(coordsPath.coordinates.add(INT_TO_COORDINATES_MAP[i]), nPath);
        }
        return toReturn;
    }

    private void addNodeMovement(Coordinates coordinates, String direction) {
        Boolean[] dirs = nodes.get(coordinates);
        if (dirs == null) dirs = new Boolean[]{false, false, false, false};
        switch (direction) {
            case "L":
                dirs[0] = true;
                break;
            case "R":
                dirs[1] = true;
                break;
            case "U":
                dirs[2] = true;
                break;
            case "D":
                dirs[3] = true;
                break;
        }
        nodes.put(coordinates, dirs);
    }

    private void checkAdjacent(Coordinates coordinates) {
        Coordinates crd = coordinates.add(1, 0);
        if (nodes.get(crd) != null) {
            addNodeMovement(coordinates, "R");
            addNodeMovement(crd, "L");
        }
        crd = coordinates.add(0, 1);
        if (nodes.get(crd) != null) {
            addNodeMovement(coordinates, "D");
            addNodeMovement(crd, "U");
        }
        crd = coordinates.add(-1, 0);
        if (nodes.get(crd) != null) {
            addNodeMovement(coordinates, "L");
            addNodeMovement(crd, "R");
        }
        crd = coordinates.add(0, -1);
        if (nodes.get(crd) != null) {
            addNodeMovement(coordinates, "U");
            addNodeMovement(crd, "D");
        }
    }

    private void addNodes(String line) {
        String[] split = line.split("[, ]");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);

        for (int i = 2; i < split.length; i++) {
            String lastMove = split[i];
            Coordinates coordinates = new Coordinates(x, y);
            switch (split[i]) {
                case "L":
                    addNodeMovement(coordinates, "L");
                    x--;
                    break;
                case "R":
                    addNodeMovement(coordinates, "R");
                    x++;
                    break;
                case "U":
                    addNodeMovement(coordinates, "U");
                    y--;
                    break;
                case "D":
                    addNodeMovement(coordinates, "D");
                    y++;
                    break;
                case "S":
                    if (!starts.contains(coordinates)) {
                        starts.add(coordinates);
                    }
                    switch (lastMove) {
                        case "L":
                            addNodeMovement(coordinates, "R");
                            break;
                        case "R":
                            addNodeMovement(coordinates, "L");
                            break;
                        case "U":
                            addNodeMovement(coordinates, "D");
                            break;
                        case "D":
                            addNodeMovement(coordinates, "U");
                            break;

                    }
                    break;
                case "F":
                    ends.add(coordinates);
                    nodes.put(coordinates, new Boolean[]{false, false, false, false});
                    break;
            }
            checkAdjacent(coordinates);
        }
    }
}
