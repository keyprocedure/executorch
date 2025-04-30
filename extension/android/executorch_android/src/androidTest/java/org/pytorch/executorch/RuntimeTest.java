package org.pytorch.executorch;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RuntimeTest {
    @Test
    public void testRuntimeInitialization() {
        assertTrue(Runtime.isInitialized());
    }
}
