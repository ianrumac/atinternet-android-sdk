/*
This SDK is licensed under the MIT license (MIT)
Copyright (c) 2015- Applied Technologies Internet SAS (registration number B 403 261 258 - Trade and Companies Register of Bordeaux – France)

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package com.atinternet.tracker;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@Config(sdk =21)
@RunWith(RobolectricTestRunner.class)
public class LocationTest extends AbstractTestClass {

    private Location location;
    private Buffer buffer;

    @Before
    public void setUp() throws Exception {
        super.setUp();
        location = new Location(tracker);
        buffer = tracker.getBuffer();
    }

    @Test
    public void initTest() {
        assertEquals(-1., location.getLatitude(), 0.1);
        assertEquals(-1., location.getLongitude(), 0.1);
    }

    @Test
    public void setTest() {
        assertEquals(5., location.setLatitude(5.).getLatitude(), 0.1);
        assertEquals(6., location.setLongitude(6.).getLongitude(), 0.1);
    }

    @Test
    public void setEventTest() {
        location.setLatitude(87876576.87787).setLongitude(3786765.915656).setEvent();

        assertEquals(2, buffer.getVolatileParams().size());

        assertEquals("gy", buffer.getVolatileParams().get(0).getKey());
        assertEquals("87876576.88", buffer.getVolatileParams().get(0).getValue().execute());

        assertEquals("gx", buffer.getVolatileParams().get(1).getKey());
        assertEquals("3786765.92", buffer.getVolatileParams().get(1).getValue().execute());
    }
}
