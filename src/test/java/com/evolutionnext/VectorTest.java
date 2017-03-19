package com.evolutionnext;

import javaslang.Function1;
import javaslang.collection.Vector;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VectorTest {
    @Test
    public void testVectorAdd() {
        Vector<Integer> vector = Vector.of(3,1,5);
        Vector<String> result = vector.append(10).map((Function1<Integer, String>) integer -> "aaa" + integer);
        assertThat(result).isEqualTo(Vector.of("aaa3", "aaa1", "aaa5", "aaa10"));
    }
}
