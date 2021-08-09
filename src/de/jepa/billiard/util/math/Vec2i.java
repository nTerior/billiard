package de.jepa.billiard.util.math;

import java.util.Objects;

/*
 *  inspired from Vec2d
 */
public class Vec2i {

    public int x;
    public int y;

    public Vec2i() {
    }

    public Vec2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vec2i(Vec2i v) {
        set(v);
    }

    public static Vec2i add(Vec2i v1, Vec2i v2) {
        return new Vec2i(v1.x + v2.x, v1.y + v2.y);
    }

    public static Vec2i subtract(Vec2i v1, Vec2i v2) {
        return new Vec2i(v1.x - v2.x, v1.y - v2.y);
    }

    public static int dot(Vec2i v1, Vec2i v2) {
        return v1.x * v2.x + v1.y * v2.y;
    }

    public static int cross(Vec2i v1, Vec2i v2) {
        return (v1.x * v2.y - v1.y * v2.x);
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void set(Vec2i v) {
        this.x = v.x;
        this.y = v.y;
    }

    public void setZero() {
        x = 0;
        y = 0;
    }

    public int[] getComponents() {
        return new int[]{x, y};
    }

    public double getLength() {
        return Math.sqrt(x * x + y * y);
    }

    public double getLengthSq() {
        return (x * x + y * y);
    }

    public double distanceSq(double vx, double vy) {
        vx -= x;
        vy -= y;
        return (vx * vx + vy * vy);
    }

    public double distanceSq(Vec2i v) {
        double vx = v.x - this.x;
        double vy = v.y - this.y;
        return (vx * vx + vy * vy);
    }

    public double distance(double vx, double vy) {
        vx -= x;
        vy -= y;
        return Math.sqrt(vx * vx + vy * vy);
    }

    public double distance(Vec2i v) {
        double vx = v.x - this.x;
        double vy = v.y - this.y;
        return Math.sqrt(vx * vx + vy * vy);
    }

    public double getAngle() {
        return Math.atan2(y, x);
    }

    public void add(Vec2i v) {
        this.x += v.x;
        this.y += v.y;
    }

    public void add(int vx, int vy) {
        this.x += vx;
        this.y += vy;
    }

    public Vec2i getAdded(Vec2i v) {
        return new Vec2i(this.x + v.x, this.y + v.y);
    }

    public void subtract(Vec2i v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    public void subtract(int vx, int vy) {
        this.x -= vx;
        this.y -= vy;
    }

    public Vec2i getSubtracted(Vec2i v) {
        return new Vec2i(this.x - v.x, this.y - v.y);
    }

    public void multiply(int scalar) {
        x *= scalar;
        y *= scalar;
    }

    public Vec2i getMultiplied(double scalar) {
        return new Vec2i((int) (x * scalar), (int) (y * scalar));
    }

    public void divide(int scalar) {
        x /= scalar;
        y /= scalar;
    }

    public Vec2i getDivided(int scalar) {
        return new Vec2i(x / scalar, y / scalar);
    }

    @SuppressWarnings("SuspiciousNameCombination")
    public Vec2i getPerp() {
        return new Vec2i(-y, x);
    }

    public double dot(Vec2i v) {
        return (this.x * v.x + this.y * v.y);
    }

    public double dot(int vx, int vy) {
        return (this.x * vx + this.y * vy);
    }

    public int cross(Vec2i v) {
        return (this.x * v.y - this.y * v.x);
    }

    public int cross(int vx, int vy) {
        return (this.x * vy - this.y * vx);
    }

    public void reverse() {
        x = -x;
        y = -y;
    }

    public Vec2i getReversed() {
        return new Vec2i(-x, -y);
    }

    public Vec2d toVec2d() {
        return new Vec2d(x, y);
    }

    @Override
    public Vec2i clone() {
        return new Vec2i(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Vec2i) {
            Vec2i v = (Vec2i) obj;
            return (x == v.x) && (y == v.y);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Vector2i[" + x + ", " + y + "]";
    }
}

