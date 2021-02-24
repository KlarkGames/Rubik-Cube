package ru.spbstu.rubick.cube;

import org.junit.*;
import ru.spbstu.rubic.cube.Task;

public class TaskTest {
    @Test
    public void cubeInitTest() {
        Task.Cube cube = new Task.Cube();

        Assert.assertEquals(cube.countColors(Task.Cube.Color.W, cube.white), 9);
        Assert.assertEquals(cube.countColors(Task.Cube.Color.Y, cube.yellow), 9);
        Assert.assertEquals(cube.countColors(Task.Cube.Color.R, cube.red), 9);
        Assert.assertEquals(cube.countColors(Task.Cube.Color.O, cube.orange), 9);
        Assert.assertEquals(cube.countColors(Task.Cube.Color.B, cube.blue), 9);
        Assert.assertEquals(cube.countColors(Task.Cube.Color.G, cube.green), 9);

        Assert.assertEquals(Task.Cube.Color.W, cube.front);
        Assert.assertEquals(Task.Cube.Color.Y, cube.back);
        Assert.assertEquals(Task.Cube.Color.R, cube.left);
        Assert.assertEquals(Task.Cube.Color.O, cube.right);
        Assert.assertEquals(Task.Cube.Color.G, cube.up);
        Assert.assertEquals(Task.Cube.Color.B, cube.down);
    }

    @Test
    public void cubeRotateTest() {
        Task.Cube cube = new Task.Cube();

        cube.turnLeft();
        cube.turnUp();
        cube.turnLeft();
        cube.turnDown();
        cube.turnRight();

        Assert.assertEquals(Task.Cube.Color.G, cube.front);
        Assert.assertEquals(Task.Cube.Color.B, cube.back);
        Assert.assertEquals(Task.Cube.Color.R, cube.left);
        Assert.assertEquals(Task.Cube.Color.O, cube.right);
        Assert.assertEquals(Task.Cube.Color.Y, cube.up);
        Assert.assertEquals(Task.Cube.Color.W, cube.down);
    }

    @Test
    public void cubeMovingTest() {
        Task.Cube cube = new Task.Cube();
        cube.moveLeftUp();
        cube.moveLeftDown();
        cube.moveRightUp();
        cube.moveRightDown();
        cube.moveUpRight();
        cube.moveUpLeft();
        cube.moveDownLeft();
        cube.moveDownRight();

        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.W, Task.Cube.Color.W, Task.Cube.Color.W,
                Task.Cube.Color.W, Task.Cube.Color.W, Task.Cube.Color.W,
                Task.Cube.Color.W, Task.Cube.Color.W, Task.Cube.Color.W
        }, cube.white);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.Y, Task.Cube.Color.Y, Task.Cube.Color.Y,
                Task.Cube.Color.Y, Task.Cube.Color.Y, Task.Cube.Color.Y,
                Task.Cube.Color.Y, Task.Cube.Color.Y, Task.Cube.Color.Y
        }, cube.yellow);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.R, Task.Cube.Color.R, Task.Cube.Color.R,
                Task.Cube.Color.R, Task.Cube.Color.R, Task.Cube.Color.R,
                Task.Cube.Color.R, Task.Cube.Color.R, Task.Cube.Color.R
        }, cube.red);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.O, Task.Cube.Color.O, Task.Cube.Color.O,
                Task.Cube.Color.O, Task.Cube.Color.O, Task.Cube.Color.O,
                Task.Cube.Color.O, Task.Cube.Color.O, Task.Cube.Color.O
        }, cube.orange);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.B, Task.Cube.Color.B, Task.Cube.Color.B,
                Task.Cube.Color.B, Task.Cube.Color.B, Task.Cube.Color.B,
                Task.Cube.Color.B, Task.Cube.Color.B, Task.Cube.Color.B
        }, cube.blue);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.G, Task.Cube.Color.G, Task.Cube.Color.G,
                Task.Cube.Color.G, Task.Cube.Color.G, Task.Cube.Color.G,
                Task.Cube.Color.G, Task.Cube.Color.G, Task.Cube.Color.G
        }, cube.green);
    }

    @Test
    public void cubeFinalTest(){
        Task.Cube cube = new Task.Cube();

        cube.moveRightUp();
        cube.turnRight();
        cube.moveRightDown();
        cube.turnUp();
        cube.moveUpLeft();
        cube.turnLeft();

        Assert.assertEquals(Task.Cube.Color.W, cube.front);
        Assert.assertEquals(Task.Cube.Color.Y, cube.back);
        Assert.assertEquals(Task.Cube.Color.R, cube.up);
        Assert.assertEquals(Task.Cube.Color.O, cube.down);
        Assert.assertEquals(Task.Cube.Color.G, cube.right);
        Assert.assertEquals(Task.Cube.Color.B, cube.left);

        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.G, Task.Cube.Color.G, Task.Cube.Color.R,
                Task.Cube.Color.W, Task.Cube.Color.W, Task.Cube.Color.W,
                Task.Cube.Color.B, Task.Cube.Color.B, Task.Cube.Color.B
        }, cube.white);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.O, Task.Cube.Color.B, Task.Cube.Color.B,
                Task.Cube.Color.Y, Task.Cube.Color.Y, Task.Cube.Color.G,
                Task.Cube.Color.Y, Task.Cube.Color.Y, Task.Cube.Color.G
        }, cube.yellow);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.R, Task.Cube.Color.R, Task.Cube.Color.Y,
                Task.Cube.Color.R, Task.Cube.Color.R, Task.Cube.Color.B,
                Task.Cube.Color.R, Task.Cube.Color.R, Task.Cube.Color.B
        }, cube.red);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.O, Task.Cube.Color.O, Task.Cube.Color.O,
                Task.Cube.Color.O, Task.Cube.Color.O, Task.Cube.Color.O,
                Task.Cube.Color.W, Task.Cube.Color.G, Task.Cube.Color.G
        }, cube.orange);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.W, Task.Cube.Color.W, Task.Cube.Color.W,
                Task.Cube.Color.O, Task.Cube.Color.B, Task.Cube.Color.B,
                Task.Cube.Color.O, Task.Cube.Color.Y, Task.Cube.Color.Y
        }, cube.blue);
        Assert.assertEquals(new Task.Cube.Color[]{
                Task.Cube.Color.Y, Task.Cube.Color.Y, Task.Cube.Color.G,
                Task.Cube.Color.G, Task.Cube.Color.G, Task.Cube.Color.R,
                Task.Cube.Color.W, Task.Cube.Color.W, Task.Cube.Color.R
        }, cube.green);
    }
}

