package org.example.ObjectEquality;

import java.util.Objects;

public class Sample {
    int val1;
    String val2;

    public Sample(int val1, String val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sample)) return false;
        Sample sample = (Sample) o;
        return val1 == sample.val1 && Objects.equals(val2, sample.val2);
    }
}
