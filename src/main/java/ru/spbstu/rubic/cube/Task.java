package ru.spbstu.rubic.cube;

import java.util.*;
import java.util.stream.Collectors;


public class Task {
    public static void main(String[] args) {
        System.out.println("Hello World");

    }

    public static class Cube {

        public enum Color {W, Y, R, O, G, B}

        public Color[] white = {Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W};
        public Color[] yellow = {Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y};
        public Color[] red = {Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R};
        public Color[] orange = {Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O};
        public Color[] green = {Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G};
        public Color[] blue = {Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B};

        private Color[] whiteShadow = {Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W};
        private Color[] yellowShadow = {Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y};
        private Color[] redShadow = {Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R};
        private Color[] orangeShadow = {Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O};
        private Color[] greenShadow = {Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G};
        private Color[] blueShadow = {Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B};

        public Color front = Color.W;
        public Color back = Color.Y;
        public Color up = Color.G;
        public Color down = Color.B;
        public Color left = Color.R;
        public Color right = Color.O;

        private Color frontShadow = Color.W;
        private Color backShadow = Color.Y;
        private Color upShadow = Color.G;
        private Color downShadow = Color.B;
        private Color leftShadow = Color.R;
        private Color rightShadow = Color.O;

        private Map<Color, Color[]> map = new HashMap();
        private Map<Color, Color[]> mapShadow = new HashMap();

        public Cube() {

            map.put(Color.W, white);
            map.put(Color.Y, yellow);
            map.put(Color.R, red);
            map.put(Color.O, orange);
            map.put(Color.G, green);
            map.put(Color.B, blue);

            mapShadow.put(Color.W, whiteShadow);
            mapShadow.put(Color.Y, yellowShadow);
            mapShadow.put(Color.R, redShadow);
            mapShadow.put(Color.O, orangeShadow);
            mapShadow.put(Color.G, greenShadow);
            mapShadow.put(Color.B, blueShadow);
        }

        @Override
        public String toString() {
            Map<Color, Character> symbols = new HashMap<>();
            symbols.put(Color.W, 'W');
            symbols.put(Color.Y, 'Y');
            symbols.put(Color.R, 'R');
            symbols.put(Color.O, 'O');
            symbols.put(Color.B, 'B');
            symbols.put(Color.G, 'G');

            String upString = Arrays.stream(map.get(up)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String downString = Arrays.stream(map.get(down)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String frontString = Arrays.stream(map.get(front)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String backString = Arrays.stream(map.get(back)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String rightString = Arrays.stream(map.get(right)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String leftString = Arrays.stream(map.get(left)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));

            StringBuilder result = new StringBuilder();

            int a = 0;
            for (int i = 0; i < 9; a++, i++) {
                a %= 3;
                if (a == 0) result.append("      ");
                result.append(upString.charAt(i));
                if (a == 2) result.append("\n");
            }

            for (int i = 0; i < 9; i += 3) {
                result.append(backString.charAt(i));
                result.append(backString.charAt(i + 1));
                result.append(backString.charAt(i + 2));
                result.append(leftString.charAt(i));
                result.append(leftString.charAt(i + 1));
                result.append(leftString.charAt(i + 2));
                result.append(frontString.charAt(i));
                result.append(frontString.charAt(i + 1));
                result.append(frontString.charAt(i + 2));
                result.append(rightString.charAt(i));
                result.append(rightString.charAt(i + 1));
                result.append(rightString.charAt(i + 2));
                result.append("\n");
            }

            int b = 0;
            for (int i = 0; i < 9; b++, i++) {
                b %= 3;
                if (b == 0) result.append("      ");
                result.append(downString.charAt(i));
                if (b == 2) result.append("\n");
            }

            return result.toString();
        }

        public String getShadow(){
            Map<Color, Character> symbols = new HashMap<>();
            symbols.put(Color.W, 'W');
            symbols.put(Color.Y, 'Y');
            symbols.put(Color.R, 'R');
            symbols.put(Color.O, 'O');
            symbols.put(Color.B, 'B');
            symbols.put(Color.G, 'G');

            String upString = Arrays.stream(map.get(upShadow)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String downString = Arrays.stream(map.get(downShadow)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String frontString = Arrays.stream(map.get(frontShadow)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String backString = Arrays.stream(map.get(backShadow)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String rightString = Arrays.stream(map.get(rightShadow)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));
            String leftString = Arrays.stream(map.get(leftShadow)).map(symbols::get).map(Object::toString).collect(Collectors.joining(""));

            StringBuilder result = new StringBuilder();

            int a = 0;
            for (int i = 0; i < 9; a++, i++) {
                a %= 3;
                if (a == 0) result.append("      ");
                result.append(upString.charAt(i));
                if (a == 2) result.append("\n");
            }

            for (int i = 0; i < 9; i += 3) {
                result.append(backString.charAt(i));
                result.append(backString.charAt(i + 1));
                result.append(backString.charAt(i + 2));
                result.append(leftString.charAt(i));
                result.append(leftString.charAt(i + 1));
                result.append(leftString.charAt(i + 2));
                result.append(frontString.charAt(i));
                result.append(frontString.charAt(i + 1));
                result.append(frontString.charAt(i + 2));
                result.append(rightString.charAt(i));
                result.append(rightString.charAt(i + 1));
                result.append(rightString.charAt(i + 2));
                result.append("\n");
            }

            int b = 0;
            for (int i = 0; i < 9; b++, i++) {
                b %= 3;
                if (b == 0) result.append("      ");
                result.append(downString.charAt(i));
                if (b == 2) result.append("\n");
            }

            return result.toString();
        }

        private void sync() {
            frontShadow = front;
            backShadow = back;
            upShadow = up;
            downShadow = down;
            leftShadow = left;
            rightShadow = right;

            whiteShadow = white.clone();
            yellowShadow = yellow.clone();
            redShadow = red.clone();
            orangeShadow = orange.clone();
            blueShadow = blue.clone();
            greenShadow = green.clone();

            mapShadow.put(Color.W, whiteShadow);
            mapShadow.put(Color.Y, yellowShadow);
            mapShadow.put(Color.R, redShadow);
            mapShadow.put(Color.O, orangeShadow);
            mapShadow.put(Color.G, greenShadow);
            mapShadow.put(Color.B, blueShadow);
        }

        public int countColors(Color color, Color[] side) {
            int counter = 0;
            for (Color anColor : side) {
                if (anColor == color) counter++;
            }
            return counter;
        }

        private void reverseRight(Color side) {
            map.get(side)[0] = mapShadow.get(side)[6];
            map.get(side)[1] = mapShadow.get(side)[3];
            map.get(side)[2] = mapShadow.get(side)[0];
            map.get(side)[3] = mapShadow.get(side)[7];
            map.get(side)[5] = mapShadow.get(side)[1];
            map.get(side)[6] = mapShadow.get(side)[8];
            map.get(side)[7] = mapShadow.get(side)[5];
            map.get(side)[8] = mapShadow.get(side)[2];
        }
        private void reverseLeft(Color side) {
            map.get(side)[0] = mapShadow.get(side)[2];
            map.get(side)[1] = mapShadow.get(side)[5];
            map.get(side)[2] = mapShadow.get(side)[8];
            map.get(side)[3] = mapShadow.get(side)[1];
            map.get(side)[5] = mapShadow.get(side)[7];
            map.get(side)[6] = mapShadow.get(side)[0];
            map.get(side)[7] = mapShadow.get(side)[3];
            map.get(side)[8] = mapShadow.get(side)[6];
        }

        public void turnRight() {
            front = rightShadow;
            right = backShadow;
            left = frontShadow;
            back = leftShadow;

            frontShadow = front;
            rightShadow = right;
            leftShadow = left;
            backShadow = back;

            reverseRight(up);
            reverseLeft(down);

            sync();
        }
        public void turnLeft() {
            front = leftShadow;
            right = frontShadow;
            left = backShadow;
            back = rightShadow;

            frontShadow = front;
            rightShadow = right;
            leftShadow = left;
            backShadow = back;
            sync();

            reverseLeft(up);
            reverseRight(down);

            sync();
        }
        public void turnUp() {
            front = upShadow;
            up = backShadow;
            down = frontShadow;
            back = downShadow;

            frontShadow = front;
            upShadow = up;
            downShadow = down;
            backShadow = back;
            sync();

            reverseRight(up);
            reverseRight(back);
            sync();

            reverseRight(up);
            reverseRight(back);

            reverseLeft(right);
            reverseRight(left);
            sync();
        }
        public void turnDown() {
            front = downShadow;
            up = frontShadow;
            down = backShadow;
            back = upShadow;

            frontShadow = front;
            upShadow = up;
            downShadow = down;
            backShadow = back;
            sync();

            reverseRight(down);
            reverseRight(back);
            sync();

            reverseRight(down);
            reverseRight(back);

            reverseLeft(left);
            reverseRight(right);
            sync();
        }

        public void moveUpRight() {
            reverseLeft(up);
            map.get(front)[0] = mapShadow.get(left)[0];
            map.get(front)[1] = mapShadow.get(left)[1];
            map.get(front)[2] = mapShadow.get(left)[2];
            map.get(right)[0] = mapShadow.get(front)[0];
            map.get(right)[1] = mapShadow.get(front)[1];
            map.get(right)[2] = mapShadow.get(front)[2];
            map.get(back)[0] = mapShadow.get(right)[0];
            map.get(back)[1] = mapShadow.get(right)[1];
            map.get(back)[2] = mapShadow.get(right)[2];
            map.get(left)[0] = mapShadow.get(back)[0];
            map.get(left)[1] = mapShadow.get(back)[1];
            map.get(left)[2] = mapShadow.get(back)[2];
            sync();
        }
        public void moveUpLeft() {
            reverseRight(up);
            map.get(front)[0] = mapShadow.get(right)[0];
            map.get(front)[1] = mapShadow.get(right)[1];
            map.get(front)[2] = mapShadow.get(right)[2];
            map.get(left)[0] = mapShadow.get(front)[0];
            map.get(left)[1] = mapShadow.get(front)[1];
            map.get(left)[2] = mapShadow.get(front)[2];
            map.get(back)[0] = mapShadow.get(left)[0];
            map.get(back)[1] = mapShadow.get(left)[1];
            map.get(back)[2] = mapShadow.get(left)[2];
            map.get(right)[0] = mapShadow.get(back)[0];
            map.get(right)[1] = mapShadow.get(back)[1];
            map.get(right)[2] = mapShadow.get(back)[2];
            sync();
        }
        public void moveDownRight() {
            reverseRight(down);
            map.get(front)[6] = mapShadow.get(left)[6];
            map.get(front)[7] = mapShadow.get(left)[7];
            map.get(front)[8] = mapShadow.get(left)[8];
            map.get(right)[6] = mapShadow.get(front)[6];
            map.get(right)[7] = mapShadow.get(front)[7];
            map.get(right)[8] = mapShadow.get(front)[8];
            map.get(back)[6] = mapShadow.get(right)[6];
            map.get(back)[7] = mapShadow.get(right)[7];
            map.get(back)[8] = mapShadow.get(right)[8];
            map.get(left)[6] = mapShadow.get(back)[6];
            map.get(left)[7] = mapShadow.get(back)[7];
            map.get(left)[8] = mapShadow.get(back)[8];
            sync();
        }
        public void moveDownLeft() {
            reverseLeft(down);
            map.get(front)[6] = mapShadow.get(right)[6];
            map.get(front)[7] = mapShadow.get(right)[7];
            map.get(front)[8] = mapShadow.get(right)[8];
            map.get(left)[6] = mapShadow.get(front)[6];
            map.get(left)[7] = mapShadow.get(front)[7];
            map.get(left)[8] = mapShadow.get(front)[8];
            map.get(back)[6] = mapShadow.get(left)[6];
            map.get(back)[7] = mapShadow.get(left)[7];
            map.get(back)[8] = mapShadow.get(left)[8];
            map.get(right)[6] = mapShadow.get(back)[6];
            map.get(right)[7] = mapShadow.get(back)[7];
            map.get(right)[8] = mapShadow.get(back)[8];
            sync();
        }
        public void moveRightUp() {
            reverseRight(right);
            map.get(front)[2] = mapShadow.get(down)[2];
            map.get(front)[5] = mapShadow.get(down)[5];
            map.get(front)[8] = mapShadow.get(down)[8];
            map.get(up)[2] = mapShadow.get(front)[2];
            map.get(up)[5] = mapShadow.get(front)[5];
            map.get(up)[8] = mapShadow.get(front)[8];
            map.get(back)[0] = mapShadow.get(up)[8];
            map.get(back)[3] = mapShadow.get(up)[5];
            map.get(back)[6] = mapShadow.get(up)[2];
            map.get(down)[2] = mapShadow.get(back)[6];
            map.get(down)[5] = mapShadow.get(back)[3];
            map.get(down)[8] = mapShadow.get(back)[0];
            sync();
        }
        public void moveRightDown() {
            reverseLeft(right);
            map.get(front)[2] = mapShadow.get(up)[2];
            map.get(front)[5] = mapShadow.get(up)[5];
            map.get(front)[8] = mapShadow.get(up)[8];
            map.get(up)[2] = mapShadow.get(back)[6];
            map.get(up)[5] = mapShadow.get(back)[3];
            map.get(up)[8] = mapShadow.get(back)[0];
            map.get(back)[0] = mapShadow.get(down)[8];
            map.get(back)[3] = mapShadow.get(down)[5];
            map.get(back)[6] = mapShadow.get(down)[2];
            map.get(down)[2] = mapShadow.get(front)[2];
            map.get(down)[5] = mapShadow.get(front)[5];
            map.get(down)[8] = mapShadow.get(front)[8];
            sync();
        }
        public void moveLeftUp() {
            reverseLeft(left);
            map.get(front)[0] = mapShadow.get(down)[0];
            map.get(front)[3] = mapShadow.get(down)[3];
            map.get(front)[6] = mapShadow.get(down)[6];
            map.get(up)[0] = mapShadow.get(front)[0];
            map.get(up)[3] = mapShadow.get(front)[3];
            map.get(up)[6] = mapShadow.get(front)[6];
            map.get(back)[2] = mapShadow.get(up)[6];
            map.get(back)[5] = mapShadow.get(up)[3];
            map.get(back)[8] = mapShadow.get(up)[0];
            map.get(down)[0] = mapShadow.get(back)[8];
            map.get(down)[3] = mapShadow.get(back)[5];
            map.get(down)[6] = mapShadow.get(back)[2];
            sync();
        }
        public void moveLeftDown() {
            reverseRight(left);
            map.get(front)[0] = mapShadow.get(up)[0];
            map.get(front)[3] = mapShadow.get(up)[3];
            map.get(front)[6] = mapShadow.get(up)[6];
            map.get(up)[0] = mapShadow.get(back)[8];
            map.get(up)[3] = mapShadow.get(back)[5];
            map.get(up)[6] = mapShadow.get(back)[2];
            map.get(back)[2] = mapShadow.get(down)[6];
            map.get(back)[5] = mapShadow.get(down)[3];
            map.get(back)[8] = mapShadow.get(down)[0];
            map.get(down)[0] = mapShadow.get(front)[0];
            map.get(down)[3] = mapShadow.get(front)[3];
            map.get(down)[6] = mapShadow.get(front)[6];
            sync();
        }

        public void randomInit() {
            for (int i = 0; i < 100; i++) {
                int number = (int) (Math.random() * 12); //12 - Количество функций
                switch (number) {
                    case 0:
                        this.turnUp();
                        break;
                    case 1:
                        this.turnDown();
                        break;
                    case 2:
                        this.turnLeft();
                        break;
                    case 3:
                        this.turnRight();
                        break;
                    case 4:
                        this.moveUpLeft();
                        break;
                    case 5:
                        this.moveUpRight();
                        break;
                    case 6:
                        this.moveDownLeft();
                        break;
                    case 7:
                        this.moveDownRight();
                        break;
                    case 8:
                        this.moveRightDown();
                        break;
                    case 9:
                        this.moveRightUp();
                        break;
                    case 10:
                        this.moveLeftDown();
                        break;
                    case 11:
                        this.moveLeftUp();
                        break;
                }
            }

        }
    }
}
