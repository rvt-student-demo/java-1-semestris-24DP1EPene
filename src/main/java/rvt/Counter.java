package rvt;

public class Counter {
    int count;

    public Counter() {
        this.count = 0;
    }

    public Counter(int count) {
        this.count = count;
    }

    public int value() {
        return count;
    }

    public void increase() {
        count += 1;
    }

    public void decrease() {
        count -= 1;
    }

    public void increase(int value) {
        if (value > 0) {
            count += value;
        }
    }

    public void decrease(int value) {
        if (value > 0) {
            count -= value;
        }
    }
}
