/*
 *
 *  * Copyright (c) 2022  Bitshift D.O.O (http://bitshifted.co)
 *  *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package co.bitshifted.appforge.common.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class JdkVersionComparatorTest {

    @Test
    void testComparison() {
        List<JdkVersionAware> testData = new ArrayList<>();
        testData.add(new TestVersionAware("17.1.0+10"));
        testData.add(new TestVersionAware("17.0.2"));
        testData.add(new TestVersionAware("18.0.1.2.1"));
        testData.add(new TestVersionAware("17.1.2.1"));
        testData.add(new TestVersionAware("17+5"));
        testData.add(new TestVersionAware("17"));

        Collections.sort(testData, new JdkVersionComparator());
        assertEquals("17", testData.get(0).getVersion());
        assertEquals("17+5", testData.get(1).getVersion());
        assertEquals("17.0.2", testData.get(2).getVersion());
        assertEquals("17.1.0+10", testData.get(3).getVersion());
        assertEquals("17.1.2.1", testData.get(4).getVersion());
        assertEquals("18.0.1.2.1", testData.get(5).getVersion());
    }

    private  static class TestVersionAware implements JdkVersionAware {
        private final String version;

        TestVersionAware(String version) {
            this.version = version;
        }

        @Override
        public String getVersion() {
            return version;
        }
    }
}
