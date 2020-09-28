package ru.kotadmi.Laba1.Pr6;
import ru.kotadmi.Laba1.Pr5.Movable;
import ru.kotadmi.Laba1.Pr5.MovablePoint;


public class MovableRectangle extends MovablePoint implements Movable {
    private final MovablePoint l;
    private final MovablePoint r;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        l = new MovablePoint(x1, y1, xSpeed, ySpeed);
        r = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isBoth() {
        return l.xSpeed == r.xSpeed && l.ySpeed == r.ySpeed;
    }

    @Override
    public void moveUp() {
        if (isBoth()) {
            l.moveUp();
            r.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (isBoth()) {
            l.moveDown();
            r.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (isBoth()) {
            l.moveLeft();
            r.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (isBoth()) {
            l.moveRight();
            r.moveRight();
        }
    }
}