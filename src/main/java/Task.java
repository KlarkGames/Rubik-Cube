import java.util.*;


public class Task {
    public static void main(String[] args) {
        System.out.println("Hello World");

    }

    public static class Cube {

        public enum Color {W, Y, R, O, G, B}

        public Object[] white = {Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W};
        public Object[] yellow = {Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y};
        public Object[] red = {Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R};
        public Object[] orange = {Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O};
        public Object[] green = {Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G};
        public Object[] blue = {Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B};

        private Object[] whiteShadow = {Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W, Color.W};
        private Object[] yellowShadow = {Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y, Color.Y};
        private Object[] redShadow = {Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R, Color.R};
        private Object[] orangeShadow = {Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O, Color.O};
        private Object[] greenShadow = {Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G, Color.G};
        private Object[] blueShadow = {Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B, Color.B};

        public Object front = Color.W;
        public Object back = Color.Y;
        public Object up = Color.G;
        public Object down = Color.B;
        public Object left = Color.R;
        public Object right = Color.O;

        private Object frontShadow = Color.W;
        private Object backShadow = Color.Y;
        private Object upShadow = Color.G;
        private Object downShadow = Color.B;
        private Object leftShadow = Color.R;
        private Object rightShadow = Color.O;

        private Map<Object, Object[]> map = new HashMap<Object, Object[]>();
        private Map<Object, Object[]> mapShadow = new HashMap<Object, Object[]>();

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
            Map<Object, Character> symbols = new HashMap<>();
            symbols.put(Color.W, 'W');
            symbols.put(Color.Y, 'Y');
            symbols.put(Color.R, 'R');
            symbols.put(Color.O, 'O');
            symbols.put(Color.B, 'B');
            symbols.put(Color.G, 'G');

            return "      " + symbols.get(map.get(up)[0]) + symbols.get(map.get(up)[1]) + symbols.get(map.get(up)[2]) + "\n" +
                    "      " + symbols.get(map.get(up)[3]) + symbols.get(map.get(up)[4]) + symbols.get(map.get(up)[5]) + "\n" +
                    "      " + symbols.get(map.get(up)[6]) + symbols.get(map.get(up)[7]) + symbols.get(map.get(up)[8]) + "\n" +
                    symbols.get(map.get(back)[0]) + symbols.get(map.get(back)[1]) + symbols.get(map.get(back)[2]) +
                    symbols.get(map.get(left)[0]) + symbols.get(map.get(left)[1]) + symbols.get(map.get(left)[2]) +
                    symbols.get(map.get(front)[0]) + symbols.get(map.get(front)[1]) + symbols.get(map.get(front)[2]) +
                    symbols.get(map.get(right)[0]) + symbols.get(map.get(right)[1]) + symbols.get(map.get(right)[2]) + "\n" +
                    symbols.get(map.get(back)[3]) + symbols.get(map.get(back)[4]) + symbols.get(map.get(back)[5]) +
                    symbols.get(map.get(left)[3]) + symbols.get(map.get(left)[4]) + symbols.get(map.get(left)[5]) +
                    symbols.get(map.get(front)[3]) + symbols.get(map.get(front)[4]) + symbols.get(map.get(front)[5]) +
                    symbols.get(map.get(right)[3]) + symbols.get(map.get(right)[4]) + symbols.get(map.get(right)[5]) + "\n" +
                    symbols.get(map.get(back)[6]) + symbols.get(map.get(back)[7]) + symbols.get(map.get(back)[8]) +
                    symbols.get(map.get(left)[6]) + symbols.get(map.get(left)[7]) + symbols.get(map.get(left)[8]) +
                    symbols.get(map.get(front)[6]) + symbols.get(map.get(front)[7]) + symbols.get(map.get(front)[8]) +
                    symbols.get(map.get(right)[6]) + symbols.get(map.get(right)[7]) + symbols.get(map.get(right)[8]) + "\n" +
                    "      " + symbols.get(map.get(down)[0]) + symbols.get(map.get(down)[1]) + symbols.get(map.get(down)[2]) + "\n" +
                    "      " + symbols.get(map.get(down)[3]) + symbols.get(map.get(down)[4]) + symbols.get(map.get(down)[5]) + "\n" +
                    "      " + symbols.get(map.get(down)[6]) + symbols.get(map.get(down)[7]) + symbols.get(map.get(down)[8]) + "\n";
        }

        public String getShadow(){
            Map<Object, Character> symbols = new HashMap<>();
            symbols.put(Color.W, 'W');
            symbols.put(Color.Y, 'Y');
            symbols.put(Color.R, 'R');
            symbols.put(Color.O, 'O');
            symbols.put(Color.B, 'B');
            symbols.put(Color.G, 'G');

            return "      " + symbols.get(map.get(upShadow)[0]) + symbols.get(map.get(upShadow)[1]) + symbols.get(map.get(upShadow)[2]) + "\n" +
                    "      " + symbols.get(map.get(upShadow)[3]) + symbols.get(map.get(upShadow)[4]) + symbols.get(map.get(upShadow)[5]) + "\n" +
                    "      " + symbols.get(map.get(upShadow)[6]) + symbols.get(map.get(upShadow)[7]) + symbols.get(map.get(upShadow)[8]) + "\n" +
                    symbols.get(map.get(backShadow)[0]) + symbols.get(map.get(backShadow)[1]) + symbols.get(map.get(backShadow)[2]) +
                    symbols.get(map.get(leftShadow)[0]) + symbols.get(map.get(leftShadow)[1]) + symbols.get(map.get(leftShadow)[2]) +
                    symbols.get(map.get(frontShadow)[0]) + symbols.get(map.get(frontShadow)[1]) + symbols.get(map.get(frontShadow)[2]) +
                    symbols.get(map.get(rightShadow)[0]) + symbols.get(map.get(rightShadow)[1]) + symbols.get(map.get(rightShadow)[2]) + "\n" +
                    symbols.get(map.get(backShadow)[3]) + symbols.get(map.get(backShadow)[4]) + symbols.get(map.get(backShadow)[5]) +
                    symbols.get(map.get(leftShadow)[3]) + symbols.get(map.get(leftShadow)[4]) + symbols.get(map.get(leftShadow)[5]) +
                    symbols.get(map.get(frontShadow)[3]) + symbols.get(map.get(frontShadow)[4]) + symbols.get(map.get(frontShadow)[5]) +
                    symbols.get(map.get(rightShadow)[3]) + symbols.get(map.get(rightShadow)[4]) + symbols.get(map.get(rightShadow)[5]) + "\n" +
                    symbols.get(map.get(backShadow)[6]) + symbols.get(map.get(backShadow)[7]) + symbols.get(map.get(backShadow)[8]) +
                    symbols.get(map.get(leftShadow)[6]) + symbols.get(map.get(leftShadow)[7]) + symbols.get(map.get(leftShadow)[8]) +
                    symbols.get(map.get(frontShadow)[6]) + symbols.get(map.get(frontShadow)[7]) + symbols.get(map.get(frontShadow)[8]) +
                    symbols.get(map.get(rightShadow)[6]) + symbols.get(map.get(rightShadow)[7]) + symbols.get(map.get(rightShadow)[8]) + "\n" +
                    "      " + symbols.get(map.get(downShadow)[0]) + symbols.get(map.get(downShadow)[1]) + symbols.get(map.get(downShadow)[2]) + "\n" +
                    "      " + symbols.get(map.get(downShadow)[3]) + symbols.get(map.get(downShadow)[4]) + symbols.get(map.get(downShadow)[5]) + "\n" +
                    "      " + symbols.get(map.get(downShadow)[6]) + symbols.get(map.get(downShadow)[7]) + symbols.get(map.get(downShadow)[8]) + "\n";
        }

        private void sync() {
            System.out.println("До sync()");
            System.out.println(this);
            System.out.println(getShadow());
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
            System.out.println("После sync()");
            System.out.println(this);
            System.out.println(getShadow());
        }

        public int countColors(Color color, Object[] side) {
            int counter = 0;
            for (int i = 0; i < side.length; i++) {
                if (side[i] == color) counter ++;
            }
            return counter;
        }

        private void reverseRight(Object side) {
            map.get(side)[0] = mapShadow.get(side)[6];
            map.get(side)[1] = mapShadow.get(side)[3];
            map.get(side)[2] = mapShadow.get(side)[0];
            map.get(side)[3] = mapShadow.get(side)[7];
            map.get(side)[5] = mapShadow.get(side)[1];
            map.get(side)[6] = mapShadow.get(side)[8];
            map.get(side)[7] = mapShadow.get(side)[5];
            map.get(side)[8] = mapShadow.get(side)[2];
        }
        private void reverseLeft(Object side) {
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

            reverseLeft(up);
            reverseRight(down);

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

            reverseRight(up);
            reverseLeft(down);

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
            reverseRight(up);

            reverseRight(back);
            reverseRight(back);

            reverseRight(right);
            reverseLeft(left);
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
            reverseRight(down);

            reverseRight(back);
            reverseRight(back);

            reverseRight(left);
            reverseLeft(right);
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
            System.out.println("До moveLeftUp()");
            System.out.println(this);
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
            System.out.println("После moveLeftUp()");
            System.out.println(this);
        }
        public void moveLeftDown() {
            System.out.println("До moveLeftDown()");
            System.out.println(this);
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
            System.out.println("После moveLeftDown()");
            System.out.println(this);
        }
    }
}
