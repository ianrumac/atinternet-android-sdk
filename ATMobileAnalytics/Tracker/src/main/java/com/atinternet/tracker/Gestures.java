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

public class Gestures extends Helper {

    private static final String CLASS_NAME_FORMAT = "%1$s.%2$s";

    Gestures(Tracker tracker) {
        super(tracker);
    }

    /**
     * Add a gesture
     *
     * @return Gesture
     */
    public Gesture add() {
        Gesture gesture = new Gesture(tracker);
        tracker.getBusinessObjects().put(gesture.getId(), gesture);

        return gesture;
    }

    /**
     * Add a gesture
     *
     * @param context android.content.Context
     * @return Gesture
     */
    public Gesture add(android.content.Context context) {
        Gesture gesture = new Gesture(tracker)
                .setName(String.format(CLASS_NAME_FORMAT, context.getPackageName(), context.getClass().getSimpleName()));
        tracker.getBusinessObjects().put(gesture.getId(), gesture);

        return gesture;
    }

    /**
     * Add a gesture
     *
     * @param name String
     * @return Gesture
     */
    public Gesture add(String name) {
        Gesture gesture = new Gesture(tracker)
                .setName(name);
        tracker.getBusinessObjects().put(gesture.getId(), gesture);

        return gesture;
    }

    /**
     * Add a gesture
     *
     * @param name     String
     * @param chapter1 String
     * @return Gesture
     */
    public Gesture add(String name, String chapter1) {
        Gesture gesture = new Gesture(tracker);
        gesture.setName(chapter1 + "::" + name);
        tracker.getBusinessObjects().put(gesture.getId(), gesture);

        return gesture;
    }

    /**
     * Add a gesture
     *
     * @param name     String
     * @param chapter1 String
     * @param chapter2 String
     * @return Gesture
     */
    public Gesture add(String name, String chapter1, String chapter2) {
        Gesture gesture = new Gesture(tracker)
                .setName(chapter1 + "::" + chapter2 + "::" + name);
        tracker.getBusinessObjects().put(gesture.getId(), gesture);

        return gesture;
    }

    /**
     * Add a gesture
     *
     * @param name     String
     * @param chapter1 String
     * @param chapter2 String
     * @param chapter3 String
     * @return Gesture
     */
    public Gesture add(String name, String chapter1, String chapter2, String chapter3) {
        Gesture gesture = new Gesture(tracker)
                .setName(chapter1 + "::" + chapter2 + "::" + chapter3 + "::" + name);
        tracker.getBusinessObjects().put(gesture.getId(), gesture);

        return gesture;
    }
}
