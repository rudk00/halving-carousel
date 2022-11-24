package com.epam.rd.autotasks;

public class CarouselRun2 extends CarouselRun {
    @Override
    public int next() {
        int currentItem;
        if (isFinished())
            return -1;
        else {
            while (array[position %= array.length] <= 0) {
                position++;
            }
        }
        currentItem = array[position];
        array[position] /= 2;
        position++;
        return currentItem;
    }
}
