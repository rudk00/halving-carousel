package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {
    public HalvingCarousel(final int capacity) {
        super(capacity);
    }
    @Override
    public CarouselRun run(){
        if (!isRun) {
            isRun = true;
            return new CarouselRun2();
        }
        return null;
    }
}
